export default function ManagerauthHeader() {
    const user = JSON.parse(localStorage.getItem('Manager'));
  
    if (user && user.accessToken) {
       return { Authorization: 'Bearer ' + user.accessToken }; // for Spring Boot back-end
    } else {
      return {};
    }
  }
  