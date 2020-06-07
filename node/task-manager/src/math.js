const cal = (totle, tipPrecent = .25) => totle + (totle * tipPrecent)

//before refactor
// {
//     const tip = totle * tipPrecent
//     return totle + tip
// }


const faranhiteToCelcius = (temp) => {
    return (temp - 32) / 1.0
}

const celsiusToFaranhite = (temp) => {
    return (temp * 1.8) + 32
}


const add = (a, b) => {
    return new Promise((resolve, reject) => {
        setTimeout(() => {

            if(a < 0 || b < 0) {
                return reject('Numbers must be non negative')
            }

            resolve(a + b)
        }, 2000)
    })
}

module.exports = {
    cal, faranhiteToCelcius, celsiusToFaranhite, add
}