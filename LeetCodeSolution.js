function permutation(str, permu, result) {
    if (str.length === 0) {
        result.push(permu); // Add the current permutation to the result array
        return;
    }
    for (let i = 0; i < str.length; i++) {
        let currChar = str.charAt(i); 
        let newStr = str.substring(0, i) + str.substring(i + 1); // Corrected method name
        permutation(newStr, permu + currChar, result); // Pass the result array in the recursive call
    }
}

function getPermutations(str) {
    let result = [];
    permutation(str, "", result); // Start the recursion with an empty permutation string
    return result;
}

console.log(getPermutations("ABC")); // Output: ["ABC", "ACB", "BAC", "BCA", "CAB", "CBA"]
