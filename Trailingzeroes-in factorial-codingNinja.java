// Moderate? that was easy 
/*A trailing zero is created whenever a number is multiplied by 10. Since 10 is the product of 2 and 5, every trailing zero in the factorial of a number is produced by a pair of factors 2 and 5.
Let's consider n = 100.

Multiples of 5:

Count the multiples of 5 from 1 to 100: 5, 10, 15, 20, ..., 100. There are 100/5 = 20 multiples of 5.
Multiples of 25:

Some numbers like 25, 50, 75, and 100 contribute an extra factor of 5. So, count the multiples of 25: 100/25 = 4 multiples of 25.
Multiples of 125:

Since 125 > 100, there are no multiples of 125 within 100.
Sum the Factors:

The total number of trailing zeros is 20 + 4 = 24.*/

public class Solution {
	static int trailingZerosInFactorial(int n) {
		int res=0;
		
		for(int i=5;n / i > 0;i=i*5){
			res=res+n/i;
		}
		return res;
	}
	
}
