// alert("hello");
function myfunc() {

    var num = document.getElementById("inputs").value
    
    var x = ""
    if (num % 2 == 1) {
        console.log("Number is odd");
        x="Odd"
        document.getElementById("x1").innerHTML = x;
    }
    else{
        x="Even"
        document.getElementById("x2").innerHTML = x;
    }
}
