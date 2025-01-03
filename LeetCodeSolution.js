let arr = [1,2,3,4,5]
let str = 'bhargav'
for (const num of arr) {
    // console.log(num)
}

const map = new Map()
map.set('IN', 'India')
map.set('USA', 'United States Of America')
map.set('FR', 'France')

// console.log(map)

for (const [key, value] of map) {
    // console.log(key, value)
}

const myObj = {
    js: 'javascript',
    cpp: 'c++',
    rb: 'ruby',
    swift: 'swift by app'
}

for (const key in map) {
    // console.log(`${key} for ${key}`)
}

const coding = ['js', 'react', 'node', 'express']
// coding.forEach((item) => (
//     console.log(item)
// ))

const myCode = [
    {
        langName: 'javascript',
        langFile: 'js'
    },
    {
        langName: 'react',
        langFile: 'jsx'
    },
    {
        langName: 'java',
        langFile: 'java'
    }
]

// let values = myCode.forEach((item) => {
//     console.log(item.langName,': ', item.langFile)
//     return item.langFile
// })

// console.log(values)

const myNums = [1,2,3,4,5,6,7,8,9,10]

// const filterd = myNums.filter((num) => num > 5)
// console.log(filterd)

// const nums = myNums.map((n) => n)
// console.log(nums)

const sum = myNums.reduce((n, s) => n+s, 0)
console.log(sum)

