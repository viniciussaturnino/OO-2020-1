import React from 'react';
import Navbar from './components/Navbar/index';
import Footer from './components/Footer/index'
import Lamp from './assets/lamp.svg';
import Computer from './assets/computer.svg';
import Gear from './assets/gear.svg';
import Barra from './assets/barra.svg';
import User from './assets/user.svg';

import './global.css'

function App() {
  return (
      <div className='app'>
        <div className="home">
          <Navbar/>
          <div className="content">
            <h1>BEM VINDO AO MEU <br/>UNIVERSO</h1>
            <div/>
            <p>desenvolvedor web full-stack Node e React.</p>
            <button>Saiba mais</button>
          </div>
        </div>
        
        <div className='info'>
          <div className="infogroup">
            <img src={Lamp} />
            <p>Desenvolvimento Otimizado</p>
          </div>
          <div className="infogroup">
            <img src={Computer} />
            <p>Backend e Frontend</p>
          </div>
          <div className="infogroup">
            <img src={Gear} />
            <p>Ferramentas atualizadas</p>
          </div>
        </div>

        <div className="title">
          <h1>SOBRE MIM</h1>
          <div/>
        </div>

        <div className="about">
          <div className="textgroup">
            <h2>Vinicius Saturnino</h2>
            <p>     Meu nome é Vinicius Saturnino, tenho 21 anos, sou estudante de Engenharia de Software na Universidade de Brasília desde 2018.
      Desenvolvedor web full stack, voltado para NodeJS e ReactJS. A busca pela qualidade é o principal objetivo frente a qualquer projeto de Desenvolvimento de Software. Busco contribuir na evolução da tecnologia e em como todas as coisas se conectam. Amo o que faço!</p>
            <img src={Barra} />
          </div>
          <img className="user" src={User} />
        </div>
        
      </div>
  );
}

export default App;
