//{ Driver Code Starts
// Initial Template for Java

import java.io.*;
import java.lang.*;
import java.util.*;

class Geeks {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(br.readLine());
        for (int g = 0; g < t; g++) {
            String[] str = (br.readLine()).trim().split(" ");
            int arr[] = new int[str.length];
            for (int i = 0; i < str.length; i++) arr[i] = Integer.parseInt(str[i]);
            System.out.println(new Solution().majorityElement(arr));
        }
    }
}
// } Driver Code Ends


// User function Template for Java

class Solution {
    static int majorityElement(int arr[]) {
     
     int ele = 0;
     int cnt = 0;
     int n = arr.length;
     
     for(int i = 0 ; i < n ; i++)
     {
         if(cnt == 0)
         {
             ele = arr[i];
             cnt++;
             
         }else if(ele == arr[i])
         {
             cnt++;
         }else 
         {
             cnt--;
             
         }
     }
     
     int cnt1 = 0;
     int times = n/2;
     for(int i = 0 ; i < n ; i++)
     {
         if(arr[i] == ele) cnt1 ++;
        
     }
      if(cnt1 > times) return ele;
     return -1;
     
    }
}