//{ Driver Code Starts
import java.io.*;
import java.util.*;

class GFG {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t;
        t = Integer.parseInt(br.readLine());
        while(t-- > 0){
            
            int a;
            a = Integer.parseInt(br.readLine());
            
            
            int b;
            b = Integer.parseInt(br.readLine());
            
            Solution obj = new Solution();
            int res = obj.gcd(a, b);
            
            System.out.println(res);
            
        
System.out.println("~");
}
    }
}

// } Driver Code Ends



class Solution {
    public static int gcd(int a, int b) {
        
       while (a != b) { // Keep subtracting until both numbers are equal
        if (a > b) {
            a = a - b; // Subtract smaller number from larger
        } else {
            b = b - a;
        }
    }
    return a; 
    }
}
        
