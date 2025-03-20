|  | Algorithm and Data Structure |
|--|--|
| NIM | 244107020070 |
| Nama | Raihan Zaky Ramadhan |
| Kelas | TI - 1I |
| Repository | [https://github.com/Zakycuy/JS-SEMESTER-2] () |

# Labs #5 BRUTE FORCE AND DIVIDE CONQUER

# 5.2.3. Questions
1. There are if and else, which function as part of the recursion.
If is the basis of recursion (termination). If n has reached 1, then the function immediately returns 1 without calling itself again.
else is the recursive process. If n is more than 1, then the function will call itself (FactorialDC(n - 1)) to calculate the factorial.

2. It is possible to modify the looping of the factorialBF() method to use an alternative to the for loop by using while as follows
![image](https://github.com/user-attachments/assets/69053bea-82ec-40a5-861c-2ba76b0ca10f)

3. The difference between “facto = facto*i; and int facto = n * factorialDC(n-1);”, is that if “facto = facto*i;” facto is multiplied by i every loop, the result is updated until the loop completes. whereas “int facto = n * factorialDC(n-1);” n is multiplied by the result of the FactorialDC(n - 1) function call, which will keep calling itself until it reaches 1.

4. The FactorialBF() method uses looping, calculating the factorial incrementally from 1 to n, making it more efficient and easy to understand. Whereas FactorialDC() uses recursion, calling itself until it reaches n = 1, then calculating the result backwards. Recursion makes the code more concise but takes up more memory, so it can cause stack overflow if n is too large. If you want a safer way for large values, use FactorialBF(), while if you want shorter code, use FactorialDC().

