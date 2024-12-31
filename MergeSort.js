function divide(arr, si, ei) {
    // time complexty : O(logn)
    if (si >= ei) {
        return;
    }
    let mid = Math.floor(si + (ei - si) / 2);  // (si + ei) / 2
    divide(arr, si, mid)
    divide(arr, mid+1, ei)
    conquer(arr, si, mid, ei)
}
function conquer(arr, si, mid, ei) {
    let merged = [];
    let i1 = si;
    let i2 = mid+1;
    let x = 0;

    // time complexty : O(n)
    while(i1 <= mid && i2 <= ei) {
        if (arr[i1] <= arr[i2]) {
            merged[x] = arr[i1];
            x++;
            i1++;
        }
        else {
            merged[x] = arr[i2];
            x++;
            i2++;
        }
    }

    while (i1 <= mid) {
        merged[x] = arr[i1];
        x++;
        i1++;
    }

    while (i2 <= ei) {
        merged[x] = arr[i2];
        x++;
        i2++;
    }

    for(let i=0, j=si; i<merged.length; i++, j++){
        arr[j] = merged[i];
    }

}
let arr = [6, 3, 9, 5, 2, 8];
divide(arr, 0, arr.length-1)
console.log(arr)