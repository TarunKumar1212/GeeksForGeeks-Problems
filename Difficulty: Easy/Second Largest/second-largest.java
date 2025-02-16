//{ Driver Code Starts
// Initial Template for Java
import java.io.*;
import java.util.*;
import java.util.stream.Collectors;

public class Main {

    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        int t = Integer.parseInt(sc.nextLine());
        while (t-- > 0) {
            String[] arr1Str = sc.nextLine().split(" ");
            int[] arr = Arrays.stream(arr1Str).mapToInt(Integer::parseInt).toArray();
            Solution ob = new Solution();
            int ans = ob.getSecondLargest(arr);
            System.out.println(ans);

            System.out.println("~");
        }
    }
}

// } Driver Code Ends


// User function Template for Java

class Solution {
    public int getSecondLargest(int[] arr) {
        
       
        Arrays.sort(arr); // Sort the array in ascending order
        int n = arr.length;
        
        if (n < 2) return -1; // If array has less than 2 elements, return -1
        
        int sc = Integer.MIN_VALUE; 
        
        for (int i = n - 1; i > 0; i--) { // ✅ Start from last index, stop at i > 0
            if (arr[i] != arr[i - 1]) { // ✅ Compare with previous element
                sc = arr[i - 1]; // Second largest found
                break; // ✅ Stop at the first unique smaller value
            }
        }
        
        return (sc == Integer.MIN_VALUE) ? -1 : sc; // Return -1 if no second largest
    }
}