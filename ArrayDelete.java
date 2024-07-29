import java.util.Scanner;

public class ArrayDelete {
    public static void main(String[] args) {
    Scanner sc=new Scanner(System.in);
    System.out.println("Enter the size of the array: ");
    int n=sc.nextInt();

    int[] arr=new int[n];
    int[] arr2=new int[n-1];
    System.out.println("Enter the elements of the array: ");
    for(int i=0;i<n;i++){
        arr[i]=sc.nextInt();
        }
        System.out.println("Enter the index you want remove: ");
        int x=sc.nextInt();
        for(int i=0;i<n;i++){
            if(i<x){
                arr2[i]=arr[i];
            }
            else if(i==x){
                continue;
            }
            else{
                arr2[i-1]=arr[i];
            }
            
        }

        
      for(int i=0;i<n-1;i++){
        System.out.println("Arrays :"+arr2[i]+" ");
      }
    }

}
