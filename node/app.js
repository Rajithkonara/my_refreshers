const logger = require('./logger');

const path = require('path');

const fs = require('fs');

const files = fs.readdirSync('./');
console.log(files);

//asynchronous 
fs.readdir('./', function (err, files) {
    if (err) {
        console.log('Error ' + err);
    } else {
        console.log('Result', files);

    }
});

var pathObject = path.parse(__filename);

console.log(pathObject);


logger('message');




