const express = require('express')
const path = require('path')
const http = require('http')
const app = express()
const socketio = require('socket.io')

const server = http.createServer(app)

const io = socketio(server)

const port = process.env.PORT || 3000

// Define paths for express configs
const publicDir = path.join(__dirname, '../public')

//parse json
app.use(express.json())

// set up static directory
app.use(express.static(publicDir))

io.on('connection', (socket) => {
    console.log('New connection')

    socket.emit('message', 'Welcome!')

    socket.broadcast.emit('message', 'A new user has joined')

    socket.on('sendMessage', (message) => {
        io.emit('message', message)
    })

    socket.on('disconnect', () => {
        io.emit('message', 'A user has left')
    })
})



server.listen(port, () => {
    console.log('Started the server on ' + port)
})