import React from 'react';
import Navbar from '../Navbar';

import "./Buttons.css";

function Buttons() {

    return (
        <div className='Vemula Lakshmi'>
            <Navbar/>
 <div className='backgroundImg43'> 
     
       <div className="container">
            <div className="center">
                <div><a href="/ownerlogin"><button className='button1'>Owner Login</button></a>
                <a href="/ownerregister"><button className='button4'>Owner Register</button></a></div><br/>
                
                <div><a href="/Managerlogin"><button className='button2'>Manager Login</button></a>
                 <a href="/managerregister"><button className='button5'>Manager Register</button></a></div><br />

                <div><a href="/Receptionistlogin"><button className='button3'>Receptionist Login</button></a>
                <a href="/Receptionistregister"><button className='button6'>Receptionist Register</button></a></div><br />
            </div>
            
        </div>
        </div>
            <img src='https://img.wattpad.com/35084e6ad89db906eb202a9d70ace224bcca7409/68747470733a2f2f73332e616d617a6f6e6177732e636f6d2f776174747061642d6d656469612d736572766963652f53746f7279496d6167652f4563574b544f6f4c4b542d6354773d3d2d3734303130393033332e313561343665313838343961303761663736373130333831343838372e676966' alt="" height='597px'/>
   </div>
    );

}

export default Buttons;

