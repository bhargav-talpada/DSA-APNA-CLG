let nums1 = [1,2], nums2 = [3, 4]

let arr = [...nums1, ...nums2].sort((a, b) => a - b);
let mid = Math.floor(arr.length / 2);
if (arr.length % 2 === 0) {
    console.log( (arr[mid] + arr[mid-1]) / 2);
}
else {
    console.log( arr[mid])
}
console.log(arr[mid])