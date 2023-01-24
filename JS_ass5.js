var yearsPrinted = 0;
var currentYear = 2023; 

function leapYears() {
    while (yearsPrinted < 30) {
        if ((currentYear % 4 === 0) && (!((currentYear % 100===0) && (currentYear % 400 !== 0)))) {
            document.write(currentYear + "   ");
            yearsPrinted++;
            currentYear++;
        } else {
            currentYear++;
        }
    }  
}     

leapYears();