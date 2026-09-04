/**
 * @param {number} n
 * @return {number[]}
 */
grayCode=n=>[...Array(1<<n)].map((_,i)=>i^(i>>1))