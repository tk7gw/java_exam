'use strict';

//問題1
console.log("瀧川真生");

//問題2
const firstName = "Mao";
const lastName = "Takigawa";

console.log(firstName + " " + lastName);

//問題3
const price1 = 200;
const goods1 = 3;

const price2 = 250;
const goods2 = 4;

const subtotal = (price1 * goods1) + (price2 * goods2);
const tax = subtotal * 0.1;
const total = subtotal + tax;

console.log("小計");
console.log(subtotal + "円");
console.log("消費税");
console.log(tax + "円");
console.log("合計金額");
console.log(total + "円");

//問題4
const testScore = 48;
if (0 <= testScore && testScore <= 79) {
    console.log("追試です");
} else if (80 <= testScore && testScore <= 100) {
    console.log("合格です");
} else {
    console.log("存在しない点数です");
}

//問題5
let answer = 0;
for (let i = 1; i <= 100; i++) {
    answer += i;
}
console.log(answer);

//問題6
function add(num1, num2) {
  return num1 + num2;
}
function sub(num1, num2) {
  return num1 - num2;
}
function multi(num1, num2) {
  return num1 * num2;
}
function div(num1, num2) {
  return num1 / num2;
}

console.log("5 + 3 = " + add(5,3));
console.log("5 - 3 = " + sub(5,3));
console.log("5 * 3 = " + multi(5,3));
console.log("5 / 3 = " + div(5,3));
