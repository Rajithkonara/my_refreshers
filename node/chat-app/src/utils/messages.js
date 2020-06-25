const generateMessage = (text) => {
    return {
        text,
        createdAt: new Data().getTime()
    }
}

module.exports = {
    generateMessage
}