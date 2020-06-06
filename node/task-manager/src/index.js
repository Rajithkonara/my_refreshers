const express = require('express')
require('./db/mongoose')
const userRouter = require('./routers/user')
const taskRouter = require('./routers/tasks')
const app = express()

const port = process.env.PORT || 3000

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

    const token = jwt.sign({ _id: 1234567 }, 'secret', { expiresIn: 3600 })

    const data = jwt.verify(token, 'secret')

    console.log(data);


}
