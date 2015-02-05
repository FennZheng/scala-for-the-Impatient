/**
 * 如何用reduceLeft得到数组中的最大元素?
 */
val arr = Array(1,333,4,6,4,4,9,32,6,9,0,2)
print(arr.reduceLeft((l,r)=>if(l>=r) l else r))
