const express = require('express')
const path = require('path')
const hbs = require('hbs')
const geoCode = require('./utils/geocode')
const foreCast = require('./utils/forecasts')

const app = express()
const port = process.env.PORT || 3000

// Define paths for express configs
const publicDir = path.join(__dirname, '../public')
const viewsPath = path.join(__dirname, '../templates/views')
const partialsPath = path.join(__dirname, '../templates/partials')

//set template engine and path
app.set('view engine', 'hbs')
app.set('views', viewsPath)
hbs.registerPartials(partialsPath)

// set up static directory
app.use(express.static(publicDir))

app.get('/', (req, res) => {
    res.render('index', {
        title: 'Wether app',
        name: 'Rajith konara'
    })
})

app.get('/about', (req, res) => {
    res.render('about', {
        title: 'About Us',
        name: 'Rajith konara'
    })
})

app.get('/help', (req, res) => {
    res.render('help', {
        message: 'Call 119 for help',
        title: "Help",
        name: "Rajith Konara"
    })
})

app.get('/weather', (req, res) => {

    if (!req.query.address) {
        return res.send({
            error: 'Address must be provided    '
        })
    }

    // destructring error handled by = {}
    geoCode(req.query.address, (error, { latitude, longitude, location } = {}) => {
        if (error) {
            return res.send({ error: error })
        }

        foreCast(latitude, longitude, (error, foreCastDate) => {
            if (error) {
                return res.send({ error: error })
            }

            res.send({
                foreCast: foreCastDate,
                location: location,
                address: req.query.address
            }) 
            
        })
    })
})

app.get('/products', (req, res) => {

    if (!req.query.search) {
        return res.send({
            error: 'Provide a search term'
        })
    }

    // 
    console.log(req.query)
    res.send({
        products: []
    })
})

app.get('/help/*', (req, res) => {
    res.render('404', {
        title: "404",
        name: "Rajith konara",
        errorMessage: "Help Article Not found"
    })
})

app.get('*', (req, res) => {
    res.render('404', {
        title: "404",
        name: "Rajith konara",
        errorMessage: "Page Not Found"
    })
})

app.listen(port, () => {
    console.log('Started the server on ' + port)
})