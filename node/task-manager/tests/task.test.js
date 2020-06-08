const app = require('../src/app')
const request = require('supertest')
const Task = require('../src/models/task')
const { userOneId, userOne, setUpDb, userTwo, userTwoId, taskOne, taskTwo, taskThree } = require('./fixtures/db')

beforeEach(setUpDb)

test('Should create task for user', async () => {
    const reponse = await request(app)
        .post('/task')
        .set('Authorization', `Bearer ${userOne.tokens[0].token}`)
        .send({
            description: 'From tests'
        })
        .expect(201)

    const task = await Task.findById(reponse.body._id)
    expect(task).not.toBeNull()
    expect(task.completed).toEqual(false)

})


test('Should get all task for user', async () => {
    const response = await request(app)
        .get('/tasks')
        .set('Authorization', `Bearer ${userOne.tokens[0].token}`)
        .send()
        .expect(200)

    expect(response.body.length).toEqual(2)
})

test('Should throw error if unauthorize user delete task', async () => {
    await request(app)
        .delete(`/tasks/${taskOne._id}`)
        .set('Authorization', `Bearer ${userTwo.tokens[0].token}`)
        .send()
        .expect(404)

      const task = await Task.findById(taskOne._id)  
      expect(task).not.toBeNull()
})