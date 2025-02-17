//{ Driver Code Starts
// Initial template for Java
import java.util.*;
import java.io.*;
class GFG {
    public static void main(String args[]) throws IOException {
        BufferedReader read =
            new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(read.readLine());
        while (t-- > 0) {
            String S1 = read.readLine();
            String S2 = read.readLine();
            Solution ob = new Solution();

            System.out.println(ob.areAnagram(S1, S2));
        
System.out.println("~");
}
    }
}
// } Driver Code Ends


// User function template for Java
class Solution {
    static int areAnagram(String S1, String S2) {
        
        int s1 = S1.length();
        int s2 = S2.length();
        
        if(s1 != s2) return 0;
        
        char[] s1Arr = S1.toCharArray();
        char[] s2Arr = S2.toCharArray();
        
        Arrays.sort(s1Arr);
        Arrays.sort(s2Arr);
        
        return Arrays.equals(s1Arr,s2Arr)?1:0;
    }
}