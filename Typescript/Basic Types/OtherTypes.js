/* Span multiple lines with embedded expressions
strings are surrounded by the backtick/backquote (`) character,
and embedded expressions are of the form ${ expr }. */
var fullName = "Namrata";
var age = 23;
var sentence = "Hello, my name is " + fullName + ". I'll be " + (age + 1) + " years old next year.";
console.log(sentence);
//Array
var list = [1, 2, 3];
console.log("Array Elements : ");
list.forEach(function (element) {
    console.log(element);
});
//Generic Array type, Array<elemType>:
var genericList = [1, 2, 3];
//genericList[3] = "string";       this gives error.
console.log("Generic Array Elements : ");
genericList.forEach(function (element) {
    console.log(element);
});
