require('../db/mongoose')
const Task = require('../models/task')


// Task.findByIdAndRemove('5ec890666b28273ad385be22').then((task) => {
//     console.log(task)
//     return Task.countDocuments({ completed: false })
// }).then((result) => {
//     console.log(result)
// }).catch((e) => {
//     console.log(e)
// })


const deleteTaskAndCount = async (id, completed) => {
    const task = await Task.findByIdAndRemove(id)
    const count = await Task.countDocuments({ completed })
    return count
}

deleteTaskAndCount('5ec8b2a52836bd611fae423d', false).then((count) => {
    console.log(count)
}).catch((e) => {
    console.log(e)
})