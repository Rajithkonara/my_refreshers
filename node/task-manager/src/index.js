const express = require('express')
require('./db/mongoose')
const userRouter = require('./routers/user')
const taskRouter = require('./routers/tasks')
const app = express()

const port = process.env.PORT || 3000

//parse json
app.use(express.json())

//use routes
app.use(userRouter, taskRouter)

app.listen(port, () => {
    console.log('Server running on ' + port)
})