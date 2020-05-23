const mongoose = require('mongoose')

mongoose.connect('mongodb://127.0.0.1:27017/task-manager-api', {
    useNewUrlParser: true,
    useUnifiedTopology: true,
    useCreateIndex: true,
    useFindAndModify: false
}).then(() => {
    console.log('connected .....');
}).catch((error) => {
    console.log(error)
})


// const me = new User({
//     name: 'myname',
//     age: 15,
//     email: 'ra',
//     password: '12131243'
// })

// const task = new Task({
//     description: 'my description',
//     completed: true
// })

// me.save().then(() => {
//     console.log(me)
// }).catch((error) => {
//     console.log('Error ' + error)
// })


// task.save().then(() =>{
//     console.log(task)
// }).catch((error) => {
//     console.log('Error' + error)
// })