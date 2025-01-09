let s = "ac"

function isPalindrome(s){
    let rev = "";
        for(let i=0; i<s.length; i++){
            rev = s.charAt(i) + rev;
        }

        return rev === s;
}
for(let i=0; i<s.length; i++) {
    let temp = "" + s.charAt(i);
    for(let j=i+1; j<s.length; j++){
        temp = temp + s.charAt(j);
        if (isPalindrome(temp)) {
            console.log(temp)
        }
    }
}
