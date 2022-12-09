var students= [];
 document.getElementById("btn").onclick = function(){
    // alert();
    var NameEntry = document.getElementById("student").value;
    var RollNoEntry = document.getElementById("Rollno").value;
    var AgeEnrty = document.getElementById("Age").value;

    var jsObj = {
        Roll:RollNoEntry,
        name:NameEntry,
        age:AgeEnrty
    };
    students.push(jsObj);

    // console.log(students)
}

 document.getElementById("Viewbutton").onclick = function(){
     document.getElementById("studenttable").style.visibility ="visible"

     var x = ""
    // students.forEach(function () {
    //     x=x+`<tr>
    //     <td>${}<td>    
    //     </tr>`
    // });
    // console.table(students)

    for ( var i = 0; i<students.length; ++i)
    {
    //    console.log(typeof students[i])
        x=x+`<tr>
        
        <td>${i+1}</td>
        <td>${students[i].Roll}</td>
        <td>${students[i].name}</td>
        <td>${students[i].age}</td>
        </tr>`
        document.getElementById("result").innerHTML = x;
    }
}