/* Span multiple lines with embedded expressions
strings are surrounded by the backtick/backquote (`) character, 
and embedded expressions are of the form ${ expr }. */

let fullName: string = `Namrata`;
let age: number = 23;
let sentence: string = `Hello, my name is ${fullName}. I'll be ${age + 1} years old next year.`;

console.log(sentence);


//Array
 let list : number[] = [1, 2, 3];
 console.log("Array Elements : ");
 list.forEach(element => {
     console.log(element);
 });

 //Generic Array type, Array<elemType>:
 let genericList: Array<number> = [1, 2, 3];
//genericList[3] = "string";       this gives error.
console.log("Generic Array Elements : ");
genericList.forEach(element => {
    console.log(element);
});


//Tuple
// Declare a tuple type
let x: [string, number];
// Initialize it
x = ["hello", 10]; // OK
// Initialize it incorrectly
//x = [10, "hello"]; // Error
console.log("Values from tuple :"+x[0].substring(1));