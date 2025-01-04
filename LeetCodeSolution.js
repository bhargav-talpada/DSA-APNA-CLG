let nums = [1,2,3,4]
let c = 0;
nums.sort((a,b) => a - b);

for(let i = 0; i < nums.length; i++) {
    if (nums[i] === nums[i+1]) {
        c++;
    }
}

console.log(c>=1)