import Navbar from '../Navbar'
import React from 'react';
import '../FrontPages/Home.css'
import Bed1 from "../Images/bed1.jpg";
import Bed2 from "../Images/bed2.jpg";
import Bed3 from "../Images/bed3.jpg";


function Home() {
  return (
    <div>
      <Navbar />

        <section className="rooms sec-width" id="rooms">
          <div className="title">
            <h2>rooms</h2>
          </div>
          <div className="rooms-container">
            <article className="room">
              <div className="room-image">
                <img src={Bed1} alt="room" />
              </div>
              <div className="room-text">
                <h3>Luxury Room</h3>
              </div>
            </article>
            <article className="room">
              <div className="room-image">
                <img src={Bed2} alt="room" />
              </div>
              <div className="room-text">
                <h3>Luxury Room</h3>
              </div>
            </article>
            <article className="room">
              <div className="room-image">
                <img src={Bed2} alt="room" />
              </div>
              <div className="room-text">
                <h3>Luxury Room</h3>
              </div>
            </article>
            <article className="room">
              <div className="room-image">
                <img src={Bed3} alt="room" />
              </div>
              <div className="room-text">
                <h3>Luxury Room</h3>
              </div>
            </article>
           
          </div>
        </section>

    
        <div className="footer">
          <div className="footer-container">
            <div>
              <h2>About Us </h2> 
              <p>Suites and special room occupants should be given complimentary access to the fitness centre, spa, salon, pools and other exclusive features of the hotel. There should be a 24/7 room service, concierge, gym and pool facility</p>
            </div>

            <div>
              <h2>Useful Links</h2>
              <a href="www.facebook.com">facebook</a>
              <a href="http://localhost:4359">Rooms</a>
              <a href="https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcTTA5IbxqHwtJhHZOezf60ZP21-U0iSw5Wz1Lre5ElU5cDl-d3oQllUD7jhDlHAFYb-VME&usqp=CAU">Subscription</a>
              <a href="https://c8.alamy.com/comp/2DJ4C0K/christmas-or-birthday-gift-box-red-wrapped-present-with-golden-stars-and-ribbon-bow-isolated-vector-illustration-2DJ4C0K.jpg">Gift Card</a>
            </div>

            <div>
              <h2>Privacy</h2>
              <a href="https://img.freepik.com/premium-vector/hotel-building-isolated-city-street-vector-illustration-flat-cartoon_101884-680.jpg">Career</a>
              <a href="http://localhost:4359/">About Us</a>
              <a href="http://localhost:4359/contact">Contact Us</a>
              <a href="https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcSeCMYoogIVV3vjxfiffh7fuIX4vuT6DQgzcVkf6HIa2m2UvGmd0sres32lHLIP0BTckg4&usqp=CAU">Services</a>
            </div>

            <div>
              <h2>Have A Question</h2>
              <div className="contact-item">
                <span>
                  <i className="fas fa-map-marker-alt"></i>
                </span>
                <span>
                   Guntur , Andhra Pradesh 
                </span>
              </div>
              <div className="contact-item">
                <span>
                  <i className="fas fa-phone-alt"></i>
                </span>
                <span>
                  +xxxxxxxxxxxxxxxxx
                </span>
              </div>
              <div className="contact-item">
                <span>
                  <i className="fas fa-envelope"></i>
                </span>
                <span>
                  vemulalakshmi@gmail.com
                </span>
             
              </div>

            </div>
          </div>
        </div>
      </div>
      
   
  )
}

export default Home;