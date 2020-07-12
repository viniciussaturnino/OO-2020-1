const express = require('express');
const { request, response } = require('express');

const routes = express.Router();

routes.get('/users', (request, response) => {
    return response.send('OK');
})

module.exports = routes;