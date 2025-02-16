//{ Driver Code Starts
// Initial Template for Java

import java.io.*;
import java.lang.*;
import java.util.*;

class GFG {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int T = Integer.parseInt(br.readLine().trim());
        while (T-- > 0) {
            String str = br.readLine().trim();
            Solution ob = new Solution();
            int ans = ob.binaryToDecimal(str);
            System.out.println(ans);

            System.out.println("~");
        }
    }
}

// } Driver Code Ends


// User function Template for Java

class Solution {
    public int binaryToDecimal(String b) {
        
        int n = b.length();
        int[] arr = new int[n];

        for (int i = 0; i < n ; i++) {
            arr[i] = b.charAt(i) - '0';  
        }
        
       
        int base = 1;
        int decValue = 0;
        
        for(int i = n -1 ; i >= 0;i--)
        {
            int temp = arr[i];
            decValue = decValue + temp*base;
            base = base*2;
        }
        
        return decValue;
    }
}