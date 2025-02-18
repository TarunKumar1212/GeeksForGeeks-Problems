//{ Driver Code Starts
//Initial Template for Java

import java.io.*;
import java.util.*;

class GFG {
    public static void main(String args[]) throws IOException {
        BufferedReader read =
            new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(read.readLine());
        while (t-- > 0) {
            String S = read.readLine();
            
            Solution ob = new Solution();
            System.out.println(ob.isPanagram(S));
        }
    }
}
// } Driver Code Ends


//User function Template for Java

class Solution {
    int isPanagram(String S) {
        
        String o = S.toLowerCase().replaceAll("[^a-z]", "");
        
        
        int []arr = new int[26];
        for(int i = 0 ; i < o.length(); i++)
        {
            arr[o.charAt(i) - 'a'] = 1;
        }
        
        for(int i = 0; i<26;i++)
        {
            if(arr[i] == 0)
            {
                return 0;
            }
        }
        
        return 1;
    }
};