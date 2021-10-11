import java.util.Arrays;

public class BubbleSort {
    public static void bubble_sort(int[] arr){
        for (int i = 0; i < arr.length; i++) {
            for(int j=0;j< arr.length-1;j++){
                // Swapping
                if(arr[i]<arr[j]){
                    int temp=arr[i];
                    arr[i]=arr[j];
                    arr[j]=temp;
                }
            }

        }
    }

    public static void main(String[] args) {
        int arr[]={10,4,100,5,8};
        bubble_sort(arr);
        System.out.println(Arrays.toString(arr));
    }
}
