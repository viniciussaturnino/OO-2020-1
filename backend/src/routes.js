const express = require('express');
const { request, response } = require('express');

const UserController = require('./controllers/UserController');

const routes = express.Router();

routes.post('/users', UserController.create);
routes.get('/users', UserController.index);

module.exports = routes;