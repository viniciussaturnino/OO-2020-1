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

                // insert datas in users table
                await connection('users').insert({
                    name,
                    email,
                    phone,
                    createdAt
                })

                // send mail with subject
                mailer.sendMail({
                    to: 'viniciussaturnino78@gmail.com',
                    from: email,
                    template: 'auth/NewLead',
                    context: { subject },
                }, (err) => {
                    if(err)
                        return response.status(400).send({ error: 'Algo deu errado' })
                })
                console.log('Email enviado');
            }
            else{
                // just send mail
                mailer.sendMail({
                    to: 'viniciussaturnino78@gmail.com',
                    from: email,
                    template: 'auth/NewLead',
                    context: { subject },
                }, (err) => {
                    if(err)
                        return response.status(400).send({ error: 'Algo deu errado' })
                })
                console.log('Usuario existente, email enviado');
            }
            return response.json({ subject });
        } catch (err) {
            console.log(err);
            return response.status(400).send({ error: 'Algo deu errado' });
        }
    }
}