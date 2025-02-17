//{ Driver Code Starts
import java.io.*;
import java.util.*;

class Geeks {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(br.readLine());
        for (int g = 0; g < t; g++) {
            String[] str = (br.readLine()).trim().split(" ");
            int arr[] = new int[str.length];
            for (int i = 0; i < str.length; i++) {
                arr[i] = Integer.parseInt(str[i]);
            }
            System.out.println(new Solution().missingNumber(arr));
            System.out.println("~");
        }
    }
}
// } Driver Code Ends


// User function Template for Java
class Solution {
    int missingNumber(int arr[]) {
        
        
       int n = arr.length + 1;  // Total numbers (including the missing one)
    int xor = 0;  // XOR variable to store result

    // Merging both XOR calculations in a single loop
    for (int i = 0; i < arr.length; i++) {
        xor ^= arr[i];  // XOR with array elements
        xor ^= (i + 1); // XOR with numbers from 1 to N
    }

    // XOR the last number N (since the loop runs only till n-1)
    xor ^= n;

    return xor; // The missing number
    }
}