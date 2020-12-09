console.log('Start') 

function getData(id) {
    
    setTimeout(() => {
        console.log('Receiving data ...')
        return { 
            items: [1, 2, 3, 4, 5]
        }
    }, 2000) 

}

const items = getData(1)
console.log(items)
console.log('end')

// prints  
/**
 * 
Start
undefined
end
Receiving data ...
 */

 //solution is to use callback

 console.log('Start _2') 

function getData_2(id, callback) {
    
    setTimeout(() => {
        console.log('Receiving data ...')
        callback({ 
            items: [1, 2, 3, 4, 5]
        })
    }, 2000) 

}

const items_2 = getData_2(1, items => {
    console.log(items)
})

console.log('end_2')
    