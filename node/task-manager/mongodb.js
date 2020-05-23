// // const mongodb = require('mongodb')
// // const MongoClient = mongodb.MongoClient

// //destructuring 
// const { MongoClient, ObjectID } = require('mongodb')

// const connectionUrl = 'mongodb://127.0.0.1:27017'
// const database = 'task-manager'


// // Create custom Id
// // const id = new ObjectID()



// MongoClient.connect(connectionUrl, { useNewUrlParser: true, useUnifiedTopology: true }, (error, client) => {

//     if (error) {
//         return console.log('Unable connect to database')
//     }

//     const db = client.db(database)

//     // db.collection('users').insertOne({
//     //     name: 'balla',
//     //     age: 34
//     // }, (error, result) => {
//     //     if(error) {
//     //         return console.log('Unable to insert user')
//     //     } 
//     //     console.log(result.ops)
//     // })

//     // db.collection('users').insertMany([
//     //     {
//     //         name: 'konara',
//     //         age: 12
//     //     },
//     //     {
//     //         name: 'jose',
//     //         age: 43
//     //     }
//     // ], (error, result) => {
//     //     if (error) {
//     //         return console.log('Unable to insert user')
//     //     }
//     //     console.log(result.ops)
//     // })



//     // db.collection('tasks').insertMany([
//     //     {
//     //         description: 'Hello world',
//     //         completed: true
//     //     },
//     //     {
//     //         description: 'Hello world 22',
//     //         completed: true
//     //     },
//     //     {
//     //         description: 'Hello world 44',
//     //         completed: false
//     //     }
//     // ], (error, result) => {
//     //     if (error) {
//     //         return console.log('Unable to insert user')
//     //     }
//     //     console.log(result.ops)
//     // })


//     //fetch
//     // db.collection('users').findOne({ name: "konara", age: 12 }, (error, result) => {

//     //     if (error) {
//     //         return console.log('unalbe to fetch')
//     //     }

//     //     console.log(result)

//     // })

//     // by Id
//     // db.collection('users').findOne({ _id: new ObjectID('5ec0d812446faa4c7bca9f87') }, (error, result) => {

//     //     if (error) {
//     //         return console.log('unalbe to fetch')
//     //     }

//     //     console.log(result)

//     // })

//     //.count to get no of records
//     // db.collection('users').find({ name: "Rajith" }).toArray((error, result) => {

//     //     if (error) {
//     //         return console.log('unalbe to fetch')
//     //     }

//     //     console.log(result)

//     // })

//     // db.collection('tasks').find({ completed: true }).toArray((error, result) => {

//     //     if (error) {
//     //         return console.log('unalbe to fetch')
//     //     }

//     //     console.log(result)

//     // })

//     // update one
//     // db.collection('users').updateOne({ _id: new ObjectID("5ec0d961fd0f754ecb18be51") }, {
//     //     // $set: {
//     //     //     name: 'Sisira'
//     //     // }
//     //     $inc: {  //increment
//     //         age: 1
//     //     }
//     // }).then((result) => {
//     //     console.log(result)
//     // }).catch((error) => {
//     //     console.log(error)
//     // })


//     // update many
//     // db.collection('tasks')
//     //     .updateMany({
//     //         completed: false 
//     //     }, {
//     //         $set: {
//     //             completed: true
//     //         }
//     //     }).then((result) => {
//     //         console.log(result)
//     //     }).catch((error) => {
//     //         console.log(error)
//     //     })

//     //delete 

//     db.collection('users').deleteMany({
//         age: 27
//     }).then((result) => {
//         console.log(result)
//     }).catch((error) => {
//         console.log(error)
//     })

// })