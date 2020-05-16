// Object property shortHand

const name = 'Rajith'
const userAge = 27

const user = {
    name,
    age: userAge,
    location: 'Colombo'
}

console.log(user);

// Object destructuring

const product = {
    label: 'Note book',
    price: 3,
    stock: 200,
    salePrice: undefined
}

// const label = product.label
// const stock = product.stock

// Destructing 
// 1) We can rename the variable of the object label:productLable
// 2) add new property
const { label: productLable, stock, ratings = 5 } = product
console.log(productLable);
console.log(stock);
console.log(ratings);


const transaction = (type, { label, stock }) => {

    console.log(type, label, stock) 

}

transaction('order', product)