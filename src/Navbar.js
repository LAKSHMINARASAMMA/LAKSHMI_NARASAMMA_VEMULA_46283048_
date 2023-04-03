import React from "react";
import { Link } from "react-router-dom";
import { useRef } from "react";
import { FaBars, FaTimes } from "react-icons/fa";

import "./Navbar.css";
function Navbar() {
  const navRef = useRef();

  const showNavbar = () => {
    navRef.current.classList.toggle("responsive_nav");
  };

  return (
    <header>
      <h2> Hotel Management System</h2>
      <nav ref={navRef}>
        <Link to={"/"} className="nav-link active ">Home</Link>
        <Link to={"/contact"} className="nav-link">Contact</Link>
        <Link to={"/Button"} className="nav-link"> Login/Register </Link>
        <button
          className="nav-btn nav-close-btn"
          onClick={showNavbar}>
          <FaTimes />
        </button>
      </nav>
      <button className="nav-btn" onClick={showNavbar}>
        <FaBars />
      </button>
    </header>
  );
}

export default Navbar;