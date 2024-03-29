import React, { useState, useEffect } from 'react';
import Navbar from '../Navbar';
import swal from 'sweetalert';


  function Contact() {
  const [to_name, setTo_name] = useState("");
  const [from_name, setFrom_name] = useState("");
  const [message, setMessage] = useState("");
  const [formErrors, setFormErrors] = useState({});
  const [isSubmit, setIsSubmit] = useState(false);
  const initialValues = { to_name: "", from_name: "", message: "" };
  const [formValues, setFormValues] = useState(initialValues);


  const submitInfo = (event) => {
    event.preventDefault();
    console.log(to_name + from_name + message);

    swal({
      title: "Send Successfull!",
      icon: "success",
      button: "Ok!",
    });
    const emailContent = { to_name, from_name, message }
    setFormErrors(validate(emailContent));
    setIsSubmit(true);
  }

  const handleSubmit = (event) => {
    event.preventDefault();
    setFormErrors(validate(formValues));
    setIsSubmit(true);
  };
  useEffect(() => {
    console.log(formErrors);
    if (Object.keys(formErrors).length === 0 && isSubmit) {
      console.log("success");
    }
  }, [formErrors]);
  const validate = (emailContent) => {
    const errors = {};
    const name_regex = /^[a-zA-Z ]{2,30}$/i;
    if (!emailContent.to_name) {
      errors.to_name = "UserName is required!";
    }
    if (!emailContent.from_name) {
      errors.from_name = "Email is required!";
    }

    if (!emailContent.message) {
      errors.message = " Message is required!";
    }
    else if (!name_regex.test(emailContent.message)) {
      errors.message = " Message is not a valid!";
    }

    return errors;
  };
  return (
    <from onSubmit={handleSubmit}>
      <Navbar />
      <div className="container border"
        style={{
          marginTop: "50px",
          width: "50%",
          backgroundImage: `url('https://www.switchingtomac.com/wp-content/uploads/2022/01/Featured-Mail-App-on-Mac-Keeps-Crashing-Try-These-Fixes.jpg')`,
          backgroundPosition: "center",
          backgroundSize: "cover",
        }}>
        <h1 style={{ marginTop: '25px', color: 'white' }}>Contact Details</h1>
        <div className="row" style={{ margin: "25px 85px 75px 100px", color: 'white' }}

        >
          <label style={{ marginTop: '25px', color: 'red' }}><b>UserName</b></label>
          <input
            type="text"
            name="name"
            className="form-control"
            placeholder="Username"
            value={to_name}
            onChange={(event) => { setTo_name(event.target.value) }} />
          <p style={{ marginTop: '25px', color: 'red' }}>{formErrors.to_name}</p>

          <label style={{ marginTop: '25px', color: 'red' }}><b>Email</b></label>
          <input
            type="text"
            name="user_email"
            className="form-control"
            placeholder="Email"
            value={from_name}
            onChange={(event) => { setFrom_name(event.target.value) }} />

          <p style={{ marginTop: '25px', color: 'red' }}>{formErrors.from_name}</p>

          <label style={{ marginTop: '25px', color: 'red' }}><b>Message</b></label>
          <textarea
            type="text"
            data-testid="para"
            name="message" rows="4"
            className="form-control"
            placeholder="Message"
            value={message}
            onChange={(event) => { setMessage(event.target.value) }} />
          <p style={{ marginTop: '25px', color: 'red' }}>{formErrors.message}</p>

          <button
            onClick={(event) => submitInfo(event)}
            className=" btn btn-primary "
            style={{ marginTop: '30px' }} >Submit </button>
        </div>
      </div>
    </from>
  )
};
export default Contact;