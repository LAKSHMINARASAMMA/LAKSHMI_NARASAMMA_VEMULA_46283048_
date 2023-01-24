document.write("**********");
const cars = ["BMW", "Volvo", "Saab", "Ford", "Fiat", "Audi"];
document.write("**********");
let text = "";
for (let i = 0; i < cars.length; i++) {
      text += "*  "+cars[i] +"  *" +"<br>";
}
document.getElementById("demo").innerHTML = text;