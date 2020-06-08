const express = require('express')
require('./db/mongoose')
const userRouter = require('./routers/user')
const taskRouter = require('./routers/tasks')
const app = require('../src/app')

const port = process.env.PORT

app.listen(port, () => {
    console.log('Server running on ' + port)
})

// express middleware / filters
// app.use((req, res, next) => {
//     if (req.method == 'GET') {
//         res.send('Get is disabled')
//     }  {
//         next()
//     }
// })
const jwt = require('jsonwebtoken')

const myFunction = async () => {

    const token = jwt.sign({ _id: 1234567 }, process.env.JWT_SECRET, { expiresIn: 3600 })

    const data = jwt.verify(token, process.env.JWT_SECRET)

    console.log(data);


}

const multer = require('multer')
const upload = multer({
    dest: 'images'
})

app.post('/upload', upload.single('upload'), (req,res) => {
    res.send()
})