import java.util.Scanner;
public class BinarySearch {
    public static boolean binary_search(int arr[],int key){
        int low=0;
        int high=arr.length-1;
        while(low<=high){
            int mid=(low+high)/2;
            if(arr[mid]==key){
                return true;
            }else if(key<arr[mid]){
                high=mid-1;
            }else {
                low=mid+1;
            }
        }
        return false;
    }

    public static void main(String[] args) {
        int arr[]={1,2,3,4,5};
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter Element to Search");
        int key=sc.nextInt();
        System.out.println(binary_search(arr, key));
    }
}
