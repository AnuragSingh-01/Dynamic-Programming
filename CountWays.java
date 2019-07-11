/*There are N stairs, a person standing at the bottom wants to reach the top. The person can climb either 1 stair or 2 stairs at a time. Count the number of ways, the person can reach the top (order does matter).

Input:
The first line contains an integer 'T' denoting the total number of test cases. In each test cases, an integer N will be given.

Output:
For each testcase, in a new line, print number of possible ways to reach Nth stair. Answer your output % 10^9+7.

Constraints:
1<=T<=105
1<=N<=105

Example:
Input:
3
4
10
24
Output:
5
89
75025

Problem Statement:-GeeksForGeeks
Solved by AnuragSingh-01
*/


import java.lang.*;
import java.io.*;
class CountWays
 {
	public static void main (String[] args)
	 {
	   Scanner in=new Scanner(System.in);
	   int t=in.nextInt();
     
     call();
     //we have called this function in order to pre calculate all the possiblities of n..
     //that will help in making the execution time of query O(1).
     
	   for(int k=0;k<t;k++)
	   {
	     int n=in.nextInt();
         System.out.println(dp[n]);
	   }
    }
   
    public static int dp[]=new int[100006];
    public static void call()
    {
      dp[0]=1;
      dp[1]=1;  
      for(int i=2;i<=100000;i++)
          dp[i]=(dp[i-1]%1000000007+dp[i-2]%1000000007)%1000000007;
	      
    }
}
