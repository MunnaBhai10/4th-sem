// //Declaring variable
// console.log(age); // cannot be intialize
// //console.log(myName); //undefined
// var myName = "Aakri";
// let age = 9;
// const gender = "female";
// let isTalented = true;

// function someFunction() {
//     var myName = "SomeFunctionalName";
//     age = "Some age";

//     console.log(age);
// }
// alert(myName);





//Scope
//Global Scope
let SomeName = "Some name";

function someFunc() {
    console.log(SomeName);

    //local Scope
    let age = "Some age";
}

function showAge() {
    document.write(age);
}
function showName() {
    document.write(someName);
}
someFunc();
showName();
showAge();