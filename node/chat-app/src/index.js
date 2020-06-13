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

let count = 0

io.on('connection', (socket) => {
    console.log('New connection')
    
    socket.emit('countUpdated', count)

    socket.on('increment', () => {
        count++
        // socket.emit('countUpdated', count)
        io.emit('countUpdated', count)
    })

})



server.listen(port, () => {
    console.log('Started the server on ' + port)
})