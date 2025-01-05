let l1 = [2,4,3], l2 = [5,6,4]

let newL1 = parseInt(l1.reverse().join(''))
let newL2 = parseInt(l2.reverse().join(''))
let sum = newL1 + newL2
let newArr = sum.toString().split('').reverse().map(Number)
console.log((parseInt(l1.reverse().join('')) + parseInt(l2.reverse().join(''))).toString().split('').reverse().map(Number))