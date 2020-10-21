//  we can declare a variable in four types:

/* var [identifier] : [type-annotation] = value;
Declare its type and value in one statement */
var uname : string = "Namrata"; 
console.log("name : "+uname) 

/* var [identifier] : [type-annotation] ;
Declare its type but no value. In this case, the variable will be set to undefined.*/
 var score1:number ;
 score1 = 10;
 console.log("first score : "+score1) 

/* var [identifier] = value;
Declare its value but no type. The variable type will be set to the data type of the assigned value. */
var newValue = 42.50;
console.log("New Value : "+newValue) 

/* var [identifier] : [type-annotation] = value;
Declare neither value not type.
In this case, the data type of the variable will be any and will be initialized to undefined. */
var msg ;
 msg = "New message";
 console.log("Msg : "+msg) 