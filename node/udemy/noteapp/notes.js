const fs = require('fs');
const chalk = require('chalk');

//add a Note
const addNote = (title, body) => {
    const notes = loadNotes();

    const duplicateNote = notes.find((note) => note.title === title)

    if (!duplicateNote) {
        notes.push({
            title: title,
            body: body
        })
        saveNotes(notes);
        console.log(chalk.green.inverse('Note added'));
    } else {
        console.log(chalk.red.inverse('Note title taken'));
    }
}

const saveNotes = (notes) => {
    const dataJSON = JSON.stringify(notes);
    fs.writeFileSync('notes.json', dataJSON);
}

const loadNotes = () => {
    try {
        const dataBuffer = fs.readFileSync('notes.json');
        const dataJSON = dataBuffer.toString();
        return JSON.parse(dataJSON);
    } catch (e) {
        return [];
    }
}

const removeNote = (title) => {
    const notes = loadNotes();
    const notesToKeep = notes.filter((note) => note.title !== title);

    if (notes.length > notesToKeep.length) {
        console.log(chalk.green.inverse('Note Remove !'));
        saveNotes(notesToKeep);
    } else {
        console.log(chalk.red.inverse('No Note Found '));
    }
}

const listNotes = () => {
    const notes = loadNotes();

    console.log(chalk.inverse('Your Notes '));

    notes.forEach((note) => {
        console.log(note.title);
    })
}

const readNote = (title) => {

    const notes = loadNotes();

    const body = notes.find((note) => note.title === title);

    if (body) {
        console.log("You searched for " + title)
        console.log(chalk.green(body.body));
    } else {
        console.log(chalk.red.inverse('No Note found in the title ' + title));
    }

}

module.exports = {
    addNote: addNote,
    removeNote: removeNote,
    listNotes: listNotes,
    readNote: readNote
};