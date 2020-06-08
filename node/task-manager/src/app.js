const express = require('express')
require('./db/mongoose')
const userRouter = require('./routers/user')
const taskRouter = require('./routers/tasks')
const app = express()

//parse json
app.use(express.json())

//use routes
app.use(userRouter, taskRouter)

module.exports = app