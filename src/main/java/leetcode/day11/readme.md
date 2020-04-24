#面试题51. 数组中的逆序对

在数组中的两个数字，如果前面一个数字大于后面的数字，则这两个数字组成一个逆序对。输入一个数组，求出这个数组中的逆序对的总数。


示例 1:

输入: [7,5,6,4]
输出: 5
 

限制：

0 <= 数组长度 <= 50000

# 思路
最先想到的就是用暴力求解，两层for循环遍历，找出所有的逆序对。
但是一想不可能这么简单的。一看限制数据的长度这么大就知道暴力求解肯定会超时。

所以采用归并排序算法。
归并排序是什么呢？
就是将一个数组分成两大组，然后没大组再细分。
最后小组就两个成员，进行排序，然后方向合并。

![在这里插入图片描述](https://imgconvert.csdnimg.cn/aHR0cHM6Ly9pbWFnZXMyMDE1LmNuYmxvZ3MuY29tL2Jsb2cvMTAyNDU1NS8yMDE2MTIvMTAyNDU1NS0yMDE2MTIxODE2MzEyMDE1MS00NTIyODM3NTAucG5n?x-oss-process=image/format,png)
