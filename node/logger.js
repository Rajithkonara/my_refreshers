const EventEmitter = require('events');

var url = 'http://mylogger.io/log';

class Logger extends EventEmitter {

    log(message) {
        //send request
        console.log(message);

        //Raise an event
        this.emit('messageLogged', {id: 1, url: 'url'});
    }
}

module.exports = Logger;
