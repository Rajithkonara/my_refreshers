const chalk = require('chalk');
const yargs = require('yargs');
const notes = require('./notes')

// Customize yargs version
yargs.version('1.1.0');

// Create add command
yargs.command({
    command: 'add',
    describe: 'Add a new Note',
    builder: {
        title: {
            describe: 'Note title Perfect',
            demandOption: true,
            type: 'string'
        },
        body: {
            describe: 'Note Content',
            demandOption: true,
            type: 'string'
        }
    },
    handler(argv) {
        notes.addNote(argv.title, argv.body)
    }
})

// Create Remove command
yargs.command({
    command: 'remove',
    describe: 'Remove a Note',
    handler() {
        console.log('removing a note ');
    },
    builder: {
        title: {
            describe: 'Note title Perfect',
            demandOption: true,
            type: 'string'
        }
    },
    handler(argv) {
        notes.removeNote(argv.title);
    }
})

// List notes
yargs.command({
    command: 'list',
    describe: 'List notes',
    handler() {
        console.log('Listing the notes ');
        notes.listNotes()
    }
})

// Read a Note
yargs.command({
    command: 'read',
    describe: 'Read your note',
    builder: {
        title: {
            describe: 'Read a Note by Title',
            demandOption: true,
            type: 'string'
        }
    },
    handler(argv) {
        console.log('Reading your note ...');
        notes.readNote(argv.title);
    }
})

yargs.parse();
