const { cal, faranhiteToCelcius, celsiusToFaranhite, add } = require('../src/math')

test('Hello World', () => {

})

test('Should calculate totle with tip', () => {
    const totle = cal(10, .3)

    // asssertions
    expect(totle).toBe(13)


})

test('Should calculate total with default tip', () => {

    const total = cal(10)

    expect(total).toBe(12.5)

})

test('Should return celcius value when faranhite value is given', () => {

    const celcius = faranhiteToCelcius(32)

    expect(celcius).toBe(0)

})


test('Should return faranhite value when celcius value is given', () => {

    const faranhite = celsiusToFaranhite(0)

    expect(faranhite).toBe(32)

})


// test('Async Test Demo', (done) => {
//     setTimeout(() => {
//         expect(1).toBe(1)
//         done()
//     }, 2000)

// })


test('Should be add two numbers', (done) => {
    add(2, 3).then((sum) => {
        expect(sum).toBe(5)
        done()
    })
})

test('Should add two numbers asyc wait', async () => {
    const sum = await add(10 ,22)
    
    expect(sum).toBe(32)

})