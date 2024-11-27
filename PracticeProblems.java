import java.util.Arrays;

import javax.swing.event.SwingPropertyChangeSupport;

/**(Practice Problems 
Before you start, let's do some setup. Make a new file called something like PracticeProblems.java. The file should look something like this:

public class PracticeProblems {
	
}
Write all your functions inside PracticeProblems. To test them, go back to your Main.java file and run your tests from the main function. You can call a function f in PracticeProblems using PracticeProblems.f(). Here's an example:

public class Main {
	public static void main(String[] args) {
		int[] arr = {4, 3, 2, 8, 3};
		System.out.println(PracticeProblems.countOccurances(arr, 3));
	}
}
Important: Whenever you get to a stopping point (solve a problem, close your computer to take a break) save your changes by committing and pushing!

git add .
git commit -m "description of what you did"
git push
Problems
Write a function called countOccurrences that takes an integer array arr and an integer n, and returns the number of times that n appears in arr.
Write a function called reverseArray that takes an integer array arr and returns a new array with the elements of arr but in reverse order.
Write a function called sumGrid that takes a 2d double array grid and returns the sum of all the elements. Hint: you can do this with nested for loops (look up what that is).
Write a function called fib that takes an integer n and returns the nth number in the fibonacci sequence (starting with 0- 1). */


public class PracticeProblems
{
	public static void main(String[] args)
		{	
		int n = 6;
		int[] arr = {1, 2, 3, 4, n, n, n};
		int count = countOccurences(arr, n);
		System.out.println(count);

	int[] revarr = {1, 2, 3, 4, 5};
	int[] revedarr = Reversearray(revarr);
	String arrstring = Arrays.toString(revedarr);
	System.out.println(arrstring);

	int[][] twodarr = {{1,2}, {4,5}, {6, 7, 8}};
	int total = sumGrid(twodarr);
	System.out.println(total);

	int seqnum = 6;
	System.out.println(fib(seqnum));
		}
		public static int countOccurences(int[] arr, int n)
			{
			int count = 0;
			for(int num : arr)
				{
					if(num == n)
					{
						count++;
					}
				}
		
				return count;
						
			}

				public static int[] Reversearray(int[] revarr)
				{
					int n = 0;                  
					int x = revarr.length - 1;   
				
					while (n < x) {              
						revarr[n] = revarr[n] + revarr[x]; 
						revarr[x] = revarr[n] - revarr[x];  
						revarr[n] = revarr[n] - revarr[x];  
				
						n++; 
						x--; 
					}
					return revarr; 
				}
				public static int sumGrid(int[][] twodarr)
				{
					int sum = 0;
					int i = 0;
					while (i < twodarr.length) {
						int j = 0;
						while (j < twodarr[i].length) {
							sum += twodarr[i][j];
							j++;
						}
						i++;
					}
				return sum;
				}
				public static int fib(int seqnum) 
				{
					if (seqnum == 0) 
					return 0;
					else if (seqnum == 1)
					return 1;
				 
					int a = 0;
					int b = 1;
					int fibnum = 0;
				
					int d = 2;
					while (d <= seqnum) {
   					fibnum = a + b;
    				a = b;
   					b = fibnum;
    				d++;
						}
					return fibnum;
					}
}



// *Write a function called reverseArray that takes an integer array arr and returns a new array with the elements of arr but in reverse order. *//
