require('../db/mongoose')
const User = require('../models/user')

// 5ec4097137e0117b4be73e23

// User.findByIdAndUpdate('5ec4097137e0117b4be73e23', { age: 1 }).then((user) => {
//     console.log(user)
//     return User.countDocuments({ age: 1 })
// }).then((result) => {
//     console.log(result)
// }).catch((e) => {
//     console.log(e)
// })


// asyc

const updateAgeAndCount = async (id, age) => {
    const user = await User.findByIdAndUpdate(id, { age })

    const count = await User.countDocuments({ age })

    return count

}

updateAgeAndCount('5ec4097137e0117b4be73e23', 2).then((count) => {
    console.log(count)
}).catch((e) => {
    console.log(e)
})