import java.util.Scanner;

public class ArrayPosition {

    public static void main(String[] args) {
    Scanner sc=new Scanner(System.in);
    System.out.println("Enter the size of the array: ");
    int n=sc.nextInt();

    int[] arr=new int[n];
    int[] arr2=new int[n+1];
    System.out.println("Enter the elements of the array: ");
    for(int i=0;i<n;i++){
        arr[i]=sc.nextInt();
        }
        System.out.println("Enter the index: ");
        int x=sc.nextInt();
        System.out.println("Enter the index value: ");
        int Y=sc.nextInt();
        for(int i=0;i<n+1;i++){
            if(i<x){
                arr2[i]=arr[i];
            }
            else if(i==x){
                arr2[i]=Y;
            }
            else{
                arr2[i]=arr[i-1];
            }
            
        }

        
      for(int i=0;i<n+1;i++){
        System.out.println("Arrays :"+arr2[i]+" ");
      }

    }
}