import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        sc.nextLine();
        int[] arr = new int[n];
        int sum = 0;
        for (int i=0;i<n;i++){
            arr[i] = sc.nextInt();
            sum+= arr[i];
        }
        System.out.println((double)sum/n);
        Arrays.sort(arr);
        System.out.println((arr[n/2-1]+arr[n/2])/2.0);
        int max = 0, index = 0, count=0;
        for (int i = 0;i<n-1;i++){
            if (arr[i]==arr[i+1]){
                count++;
                if (max<count) {
                    max = count;
                    index = i;
                }
            } else count = 0;
            
        }
        System.out.println(arr[index]);
        
    }
}
