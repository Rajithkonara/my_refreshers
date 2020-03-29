const http = require('http');

const server = http.createServer((requset, response) => {
    if (requset.url === '/') {
        response.write('hello world');
        response.end();
    }

    if (requset.url === '/api/courses') {
        response.write(JSON.stringify([1, 2, 3, 4]));
        response.end();
    }
});

server.listen(3000);
console.log('lisning on 3000 ......');


