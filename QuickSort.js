function partition(arr, low, high){
    let pivot = arr[high];
    let i = low-1;

    for(let j=low; j<high; j++) {
        if (arr[j] < pivot) {
            i++;
            let temp = arr[i];
            arr[i] = arr[j];
            arr[j] = temp;
        }
    }

    i++;
    let temp = arr[i];
    arr[i] = pivot;
    arr[high] = temp;
    return i;  // pivot index
}
function QuickSort(arr, low, high){
    if (low < high) {
        let pivot = partition(arr, low, high);

        QuickSort(arr, low, pivot-1);
        QuickSort(arr, pivot+1, high);
    }
}
let arr = [6, 3, 9, 5, 2, 8]
QuickSort(arr, 0, arr.length-1)
console.log(arr)