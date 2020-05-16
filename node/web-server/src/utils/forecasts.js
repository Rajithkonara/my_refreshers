const request = require('request')

const access_key = process.env.access_key

const forecast = (longitude, latitude, callback) => {

    const url = 'http://api.weatherstack.com/current?access_key='+access_key+'&query=' + latitude + ',' + longitude + '&unit=f'

    request({ url, json: true }, (error, {body} = {}) => {
        if (error) {
            callback('Unable to connect ..')
        } else if (body.error) {
            callback('Unable to find location')
        } else {
            callback(undefined, "Current Temperature " + body.current.temperature + ' There is a ' + body.current.weather_descriptions[0])
        }
    })
}

module.exports = forecast