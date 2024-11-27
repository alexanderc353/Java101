// * Used for testing out code without need to rewrite any issuses *//4


public class Main{}


int[] revarr = {1, 2, 3, 4, 5};
	int[] revedarr = Reversearray(revarr);
	String arrstring = Arrays.toString(revedarr);
	System.out.println(arrstring);


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


public class Main {
    public static void main(String[] args) {
        int n = 6;

        // Testing countOccurences
        int[] arr = {1, 2, 3, 4, n, n, n};
        int count = PracticeProblems.countOccurences(arr, n);
        System.out.println("Count of " + n + " in the array: " + count);

    