const fs = require('fs');

// const book = {
//     title: 'Enemy',
//     author: 'Dont know'
// }

// const bookJ = JSON.stringify(book);
// fs.writeFileSync('1-json.json', bookJ);

// console.log(bookJ);
// const parsed = JSON.parse(bookJ);
// console.log(parsed);

// const dataBuffer = fs.readFileSync('1-json.json');
// const dataJson = dataBuffer.toString();
// const data =JSON.parse(dataJson);
// console.log(data.title);


const dataBuffer1 = fs.readFileSync('1-json.json');
const dataJson1 = dataBuffer1.toString();
const data2 = JSON.parse(dataJson1);
data2.name = "Rajith";
data2.age = 25;

const userJson = JSON.stringify(data2);
fs.writeFileSync('1-json.json', userJson);