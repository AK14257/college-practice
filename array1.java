import java.util.*;
import java.util.Scanner;
public class array1{  
/**
 * @param args
 */
public static void main(String args[]){  
    int n;
    System.out.println("enter the lenght of the array");
    Scanner sc=new Scanner(System.in);
    n=sc.nextInt();
    
    int arr[]=new int[n];
    for(int j=0;j<n;j++){
        arr[j]=sc.nextInt();

    }

    Arrays.sort(arr);
    System.out.println("Modified arr[]: "+Arrays.toString(arr));
    int count=0;
    for(int i=arr.length-1;i>0;i--){
        System.out.println(arr[i]);
        count++;
        if(count>=3){
            break;
        }
        

    }

}
}