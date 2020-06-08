const app = require('../src/app')
const request = require('supertest')
const User = require('../src/models/user')
const { userOneId, userOne, setUpDb } = require('./fixtures/db')

beforeEach(setUpDb)

test('Should signup a new user', async () => {
    const response = await request(app).post('/users').send({
        name: 'Rajith',
        email: 'rajith@example.com',
        password: 'Mysad@123'
    }).expect(201)


    const user = await User.findById(response.body.user._id)
    expect(user).not.toBeNull()

    //assert response body
    // expect(response.body.user.name).toBe('Rajith')
    expect(response.body).toMatchObject({
        user: {
            name: 'Rajith',
            email: 'rajith@example.com'
        },
        token: user.tokens[0].token
    })
    expect(user.password).not.toBe('Mysad@123')
})

test('Should log in ', async () => {
    const response = await request(app).post('/users/login').send({
        email: userOne.email,
        password: userOne.password
    }).expect(200)

    const user = await User.findById(userOneId)

    expect(response.body.token).toBe(user.tokens[1].token)
})

test('Invalid login', async () => {
    await request(app).post('/users/login').send({
        email: 'invalid',
        password: userOne.password
    }).expect(400)
})


test('Should get profile for user', async () => {
    await request(app)
        .get('/users/me')
        .set('Authorization', `Bearer ${userOne.tokens[0].token}`)
        .send()
        .expect(200)
})

test('Should failed profile for unauthorized users', async () => {
    await request(app)
        .get('/users/me')
        .send()
        .expect(401)
})

test('Should delete user', async () => {
    await request(app)
        .delete('/users/me')
        .set('Authorization', `Bearer ${userOne.tokens[0].token}`)
        .send()
        .expect(200)

    const user = await User.findById(userOneId)
    expect(user).toBeNull()
})

test('Should failed delete user for unauthenticated user', async () => {
    await request(app)
        .delete('/users/me')
        .send()
        .expect(401)
})

test('Should upload avatar image', async () => {
    await request(app)
        .post('/users/me/avatar')
        .set('Authorization', `Bearer ${userOne.tokens[0].token}`)
        .attach('avatar', 'tests/fixtures/sunset.jpg')
        .expect(200)

    const user = await User.findById(userOneId)
    expect(user.avatar).toEqual(expect.any(Buffer))
})

test('Should update valid user fields', async() => {

    await request(app)
        .patch('/users/me')
        .set('Authorization', `Bearer ${userOne.tokens[0].token}`)
        .send({
            name: 'Jess'
        })
        .expect(200)

        const user = await User.findById(userOneId)

        expect(user.name).toEqual('Jess')
})


test('Should not update inValid user fields', async() => {

    await request(app)
        .patch('/users/me')
        .set('Authorization', `Bearer ${userOne.tokens[0].token}`)
        .send({
            location: 'Colombo'
        })
        .expect(400)
})