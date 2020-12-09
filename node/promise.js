const { resolve } = require("path");
const { rejects } = require("assert");

const promise = new Promise((resolve, reject) => {
    setTimeout(() => {
        console.log('Receiving ......')
        resolve({ data: 'Keep your promise' })
        // reject(new Error('Went wrong'))
    }, 2000)
})

promise.then(result => {
    console.log(result)
}).catch(error => {
    console.log(error)
})