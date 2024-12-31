let matrix = [
    [11, 2, 4],
    [4, 5, 6],
    [10, 8, -12]
];

let primaryDiagonalSum = 0;
let secondaryDiagonalSum = 0;

for (let i = 0; i < matrix.length; i++) {
    primaryDiagonalSum += matrix[i][i]; // elements from top-left to bottom-right
    secondaryDiagonalSum += matrix[i][matrix.length - 1 - i]; // elements from top-right to bottom-left
}

let diagonalDifference = Math.abs(primaryDiagonalSum - secondaryDiagonalSum);

console.log(diagonalDifference); // Output will be 15
