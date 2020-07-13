const connection = require('../database/connection');
const mailer = require('../modules/mailer');

module.exports = {
    async index (request, response){
        const users = await connection('users').select('*');

        return response.json(users);
    },

    async create (request, response){
        const {name, email, phone, subject} = request.body;

        try {
            const user = await connection('users').where('email', email).select('*').first();
            if(!user){
                const createdAt = new Date();

                // inserir dados na tabela de usuarios
                await connection('users').insert({
                    name,
                    email,
                    phone,
                    createdAt
                })

                // enviar email com o assunto
                mailer.sendMail({
                    to: 'viniciussaturnino78@gmail.com',
                    from: email,
                    template: 'auth/NewLead',
                    context: { subject },
                }, (err) => {
                    if(err)
                        return response.status(400).send({ error: 'Algo deu errado' })
                })
                // return response.json({ subject });
                return response.send('Email enviado');
            }
            else{
                // somente enviar email
                mailer.sendMail({
                    to: 'viniciussaturnino78@gmail.com',
                    from: email,
                    template: 'auth/NewLead',
                    context: { subject },
                }, (err) => {
                    if(err)
                        return response.status(400).send({ error: 'Algo deu errado' })
                })
                return response.send('Usuario ja existe, email enviado');
            }
        } catch (err) {
            console.log(err);
            return response.status(400).send({ error: 'Algo deu errado' });
        }
    }
}