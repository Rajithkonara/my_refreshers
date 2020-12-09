const { resolve } = require("path");
const { rejects } = require("assert");
const { promises } = require("fs");

const news = new Promise((resolve, reject) => {
    setTimeout(() => {
        console.log('Getting news .....')
        resolve({
            news: [1, 2, 3, 4, 5]
        })
    }, 2000)
})

const feeds = new Promise((resolve, reject) => {
    setTimeout(() => {
        console.log('Getting feed .....')
        resolve({
            feeds: [1, 2, 3]
        })
    }, 2000)
})

Promise.all([news, feeds]).then(result => {
    console.log(result)
})