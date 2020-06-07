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

module.exports = {
    cal, faranhiteToCelcius, celsiusToFaranhite
}