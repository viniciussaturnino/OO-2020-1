import React from 'react';
import { FaGithub, FaWhatsapp } from 'react-icons/fa'
import { GrLinkedin } from 'react-icons/gr'

import './styles.css';

export default function Footer(){
    return(
        <footer className='footer'>
            <div className='icons'>
                <FaGithub size={40} />
                <GrLinkedin size={40} />
                <FaWhatsapp size={40} />
            </div>
            <div className='copy'>
                <p>Copyright 2020 ©</p>
            </div>
        </footer>
    )
}