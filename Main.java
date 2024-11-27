public class Main {
    public static void main(String[] args) {
        int n = 6;

        // Testing countOccurences
        int[] arr = {1, 2, 3, 4, n, n, n};
        int count = PracticeProblems.countOccurences(arr, n);
        System.out.println("Count of " + n + " in the array: " + count);

        // Testing Reversearray
        int[] revarr = {1, 2, 3, 4, 5};
        int[] revedarr = PracticeProblems.Reversearray(revarr);
        System.out.println("Reversed array: " + java.util.Arrays.toString(revedarr));

        // Testing sumGrid
        int[][] twodarr = {{1, 2}, {4, 5}, {6, 7, 8}};
        int total = PracticeProblems.sumGrid(twodarr);
        System.out.println("Sum of grid elements: " + total);

        // Testing Fibonacci
        int seqnum = 6;
        System.out.println("Fibonacci number at position " + seqnum + ": " + PracticeProblems.fib(seqnum));
    }
}