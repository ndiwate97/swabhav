"use strict";
exports.__esModule = true;
exports.Student = void 0;
var Student = /** @class */ (function () {
    function Student(name, id) {
        this.studId = id;
        this.studName = name;
    }
    Student.prototype.displayStudent = function () {
        console.log("Student Id: " + this.studId + ", Student Name: " + this.studName);
    };
    return Student;
}());
exports.Student = Student;
