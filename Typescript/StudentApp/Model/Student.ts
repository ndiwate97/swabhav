export class Student {
    studId: number;
    studName: string;
    constructor(name: string, id: number) {
        this.studId = id;
        this.studName = name;
    }

    displayStudent() {
        console.log ("Student Id: " + this.studId
         + ", Student Name: " + this.studName);
    }
}