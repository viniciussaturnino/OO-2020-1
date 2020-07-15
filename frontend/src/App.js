import React from 'react';
import Navbar from './components/Navbar/index';
import Footer from './components/Footer/index'

import './global.css'

function App() {
  return (
      <div className='app'>
        <div className="home">
          <Navbar/>
          <h1>BEM VINDO AO MEU <br/>UNIVERSO</h1>
        </div>
        <Footer/>
      </div>
  );
}

export default App;
