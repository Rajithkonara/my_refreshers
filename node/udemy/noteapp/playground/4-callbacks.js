// callbacks
//settimeout is used to simulate asynchronous

//argument to function, function provide to another fun as arg
setTimeout(() => {
    console.log('2 seconds are up');
}, 2000);

const names = ['rajith', 'konara', 'jess']
const shortNames = names.filter((name) => {
    return name.length <= 4
})

const geoCode = (address, callback) => {

    setTimeout(() => {
        const data = {
            latitude: 0,
            longitude: 0
        }
        callback(data)
    }, 2000)

}

// address and callback function
geoCode('newyork', (data) => {
    console.log(data)
})


const add = (num1, num2, callback) => {
    setTimeout(() => {
        callback(num1 + num2)
    },2000)

}


add(1, 4, (sum) => {
    console.log(sum);
})