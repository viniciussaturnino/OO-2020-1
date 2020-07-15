import React from 'react';
import Logo from '../../assets/Logo.svg';

import './styles.css'

export default function Navbar(){
    return(
        <nav className="navbar">
            <img className='logo' src={Logo} alt='Logo' />

            <div className="menu">
                <a href="/">Home</a>
                <a href="/sobre">Sobre</a>
                <a href="/portfolio">Portfólio</a>
                <a href="/servicos">Serviços</a>
                <a href="/contato">Contato</a>
            </div>
        </nav>
    );
}