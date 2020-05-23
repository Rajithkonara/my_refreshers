require('../db/mongoose')
const User = require('../models/user')

// 5ec4097137e0117b4be73e23

User.findByIdAndUpdate('5ec4097137e0117b4be73e23', {age: 1}).then((user) => {
    console.log(user)
    return User.countDocuments({ age: 1})
}).then((result) => {
    console.log(result)
}).catch((e) =>{
    console.log(e)
})