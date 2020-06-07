const express = require('express')
require('./db/mongoose')
const userRouter = require('./routers/user')
const taskRouter = require('./routers/tasks')
const app = express()

const port = process.env.PORT

// express middleware / filters
// app.use((req, res, next) => {
//     if (req.method == 'GET') {
//         res.send('Get is disabled')
//     }  {
//         next()
//     }
// })

//parse json
app.use(express.json())

//use routes
app.use(userRouter, taskRouter)



app.listen(port, () => {
    console.log('Server running on ' + port)
})


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