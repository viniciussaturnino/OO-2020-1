const connection = require('../database/connection');

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

                return response.json({ subject });
            }
            else{
                // somente enviar email
                return response.send('Usuario ja existe, email enviado');
            }
        } catch (err) {
            console.log(err);
            return response.status(400).send({ error: 'Algo deu errado' });
        }
    }
}