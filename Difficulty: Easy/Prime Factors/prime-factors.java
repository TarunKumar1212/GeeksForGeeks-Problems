//{ Driver Code Starts


import java.util.*;
import java.lang.*;
import java.io.*;
class GFG
{
    public static void main(String[] args) throws IOException
    {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int T = Integer.parseInt(br.readLine().trim());
        while(T-->0)
        {
            int N = Integer.parseInt(br.readLine().trim());
            Solution ob = new Solution();
            int[] ans = ob.AllPrimeFactors(N);
            for(int i = 0; i < ans.length; i++)
                System.out.print(ans[i] + " ");
            System.out.println();
        }
    }
}

// } Driver Code Ends




class Solution
{
    public static boolean isPrime(int n)
        {
            if(n <= 1) return false;
            for(int i =2 ; i < n ; i++)
            {
                if(n % i == 0) return false;
            }
            return true;
        }
    public int[] AllPrimeFactors(int N)
    {
        ArrayList<Integer> temp = new ArrayList <>();
        for(int i = 1 ; i <= N ; i++)
        {
            if(N % i == 0)
            {
                boolean is = isPrime(i);
            
            if(is) 
            {
                temp.add(i);
            }
            }
        }
        
        if (temp == null || temp.isEmpty()) 
         {  
            return new int[0]; 
        }
        int size = temp.size();
        int ans[] = new int[size];
        
        for(int i = 0 ; i < size ; i++)
        {
            ans[i] = temp.get(i);
        }
        
        Arrays.sort(ans);
        
        return ans;
    }
}