//{ Driver Code Starts
import java.io.*;
import java.util.*;

class GFG {
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
        int test = sc.nextInt();
        while (test-- > 0) {
            int n = sc.nextInt();
            Solution obj = new Solution();
            System.out.println(obj.decToBinary(n));
            System.out.println("~");
        }
    }
}
// } Driver Code Ends


class Solution {
    static String decToBinary(int n) {
     
        StringBuilder str = new StringBuilder();
        
        while(n>0)
        {
            int temp = n % 2;
            str.append(temp);
            n /= 2;
        }
        
        str.reverse();
        return str.toString();
    }
}