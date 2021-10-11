import java.util.Scanner;

public class LinearSearch {
    public static void linear_search(int[] arr,int element){
        for(int i=0;i<arr.length;i++){
            if(arr[i]==element){
                System.out.println("Found at index "+i);

            }
        }
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter Length of array");
        int n=sc.nextInt();
        System.out.println("Enter Elements one by one");
        int arr[]=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        System.out.println("Enter Element to serach");
        int key=sc.nextInt();
        linear_search(arr,key);
        System.out.println("Search Done");
    }
}
