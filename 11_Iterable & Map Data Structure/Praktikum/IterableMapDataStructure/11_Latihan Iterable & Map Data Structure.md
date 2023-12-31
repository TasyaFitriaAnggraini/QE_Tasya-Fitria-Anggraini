# Section 7 Iterable & Map Data Structure

https://docs.google.com/document/d/1sluzRFsd8pnMNNVPJX5cH_5c1Ntg4wsocZoQFGtmdzY/edit?usp=sharing

## Soal Prioritas
1. Buatlah sebuah program menggabungkan 2 array yang diberikan, dan jangan sampai terdapat nama yang sama di data yang sudah tergabung tadi.
   
   #### Sample Test Case 1
   
   Input	   : ['kazuya', 'jin', 'lee'], ['kazuya', 'feng']
   
   Output	: ['kazuya', 'jin', 'lee', 'feng']
   
   #### Sample Test Case 2
   
   Input	   : ['lee', 'jin'], ['kazuya', 'panda']
   
   Output	: ['lee', 'jin', 'kazuya', 'panda']

2. Buat program sesuai dengan deskripsi di bawah. Input merupakan variable string berisi kumpulan angka. Output merupakan list / array berisi angka yang hanya muncul 1 kali pada input.
   
   #### Sample Test Case 1
   
   Input	   : “76523752”
   
   Output	: [6, 3]
   
   #### Sample Test Case 2
  
   Input	   : “1122”
   
   Output	: []

3. Given an array of sorted numbers and a target sum, find a pair in the array whose sum is equal to the given target. Write a function to return the indices of the two numbers (i.e. the pair) such that they add up to the given target. 
   
   ### Challenges
   
   Solve with linear complexity O(n), not O(n^2) if you can!
   
   #### Sample Test Case 1
   
   Input		   : [1, 2, 3, 4, 6], target = 6
   
   Output		: [1, 3]
   
   Explanation	: The numbers at index 1 and 3 add up to 6 : 2 + 4 = 6

   #### Sample Test Case 2
   
   Input		   : [2, 5, 9, 11], target = 11
   
   Output		: [0, 2]
   
   Explanation	: The numbers at index 0 and 2 add up to 11 : 2 + 9 = 11

4. Buatlah sebuah program ArrayUnique yang menerima 2 parameter berupa array angka. Output adalah program adalah satu array berupa kumpulan angka di array    pertama tetapi tidak memiliki duplikasi di di array kedua.
   
   #### Sample Test Case 1
   
   Input	   : [1, 2, 3, 4] dan [1, 3, 5, 10, 16]
   
   Output	: [2, 4]
   
   #### Sample Test Case 2
   
   Input	   : [3, 8] dan [2, 8]
   
   Output	: [3]

5. Given an array of sorted numbers, remove all duplicates from it. You should not use any extra space; after removing the duplicates in-place return the    length of the subarray that has no duplicate in it.
   
   #### Sample Test Case 1
   
   Input		   : [2, 3, 3, 3, 6, 9, 9]
   
   Output		: 4
   
   Explanation	: The first four elements after removing the duplicates will be [2, 3, 6, 9].

   #### Sample Test Case 2
   
   Input		   : [2, 2, 2, 11]
   
   Output		: 2
   
   Explanation	: The first two elements after removing the duplicates will be [2, 11].

## Soal Opsional/Tambahan
6. Given an array of positive numbers and a positive number ‘k’, find the maximum sum of any contiguous subarray of size ‘k’.
   
   ### Sample Test Case 1
   
   Input		   : [2, 1, 5, 1, 3, 2], k=3
   
   Output		: 9
   
   Explanation	: Subarray with maximum sum is [5, 1, 3].

   ### Sample Test Case 2
   
   Input		   : [2, 3, 4, 1, 5], k=2
   
   Output		: 7
   
   Explanation	: Subarray with maximum sum is [3, 4].
