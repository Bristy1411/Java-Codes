
package array;

import java.util.Scanner;

public class Array {

   
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.print("enter array size=");
        int n=sc.nextInt();
        int i,j;
        int arr[]= new int[n];
        for(i=0;i<arr.length;i++){
        arr[i]=sc.nextInt();
       }
        for(i=0;i<arr.length;i++){
          for(j=0;j<arr.length-1;j++){
              if(arr[i]<arr[i+1])
              {
                  int k=arr[i];
                  arr[i]=arr[i+1];
                  arr[i+1]=k;
              }
              else{}
          }
        }
        for(i=0;i<arr.length;i++){
          System.out.print(arr[i]+" ");
        }
    }
    
}
