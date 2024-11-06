//{ Driver Code Starts
// Initial Template for Java

import java.io.*;
import java.lang.*;
import java.util.*;

class DriverClass {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();

        while (t-- > 0) {
            int n = sc.nextInt();
            int[][] arr = new int[n][n];

            for (int i = 0; i < n; i++)
                for (int j = 0; j < n; j++) arr[i][j] = sc.nextInt();

            GFG g = new GFG();
            g.rotate(arr);
            printMatrix(arr);

            System.out.println("~");
        }
    }

    static void printMatrix(int arr[][]) {
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[0].length; j++) System.out.print(arr[i][j] + " ");
            System.out.println("");
        }
    }
}
// } Driver Code Ends


// User function Template for Java

class GFG
{
    static void rotate(int matrix[][]) 
    {
        int n=matrix.length;
        int l=0, r=n-1;
        
        //rotation (inside sq.)
        for(int op=0;op<n/2;op++){
            
            for(int i=l;i<r;i++){
                
                int top_left=matrix[l][i];
                int top_right=matrix[i][r];
                int bottom_left=matrix[n-1-i][l];
                int bottom_right=matrix[n-1-l][n-1-i];
                
                matrix[l][i]=bottom_left;
                matrix[i][r]=top_left;
                matrix[n-1-l][n-1-i]=top_right;
                matrix[n-1-i][l]=bottom_right;
                
            }
            
            l++;
            r--;
            
        }
    }
}
