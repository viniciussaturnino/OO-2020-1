import React from 'react';
import Navbar from './components/Navbar/index';
import Footer from './components/Footer/index'

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
      </div>
  );
}

export default App;
