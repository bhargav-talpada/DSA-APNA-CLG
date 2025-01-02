let arr = [1,2,3,4,5]

let totalSum = arr.reduce((i, sum) => i + sum, 0)

let minNum = Math.min(...arr)
let maxNum = Math.max(...arr)

let min = totalSum - maxNum;
let max = totalSum - minNum;

console.log(min, max)