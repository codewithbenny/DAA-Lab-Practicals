public class PrimeIndexes {
    public static void prime_indexes(int[] arr){
        for (int i = 0; i < arr.length; i++) {
          boolean check= check_prime(arr[i]);
          if(check){
              System.out.println("The Prime no "+arr[i]+ " is at index "+ i);
          }
        }
    }

    public static boolean check_prime(int num){
        if(num<2){
            return false;
        }else{
            for (int i = 2; i < num ; i++) {
                if(num%i!=0){
                    return true;
                }
            }
        }
        return false;
    }

    public static void main(String[] args) {
     int arr[]={8,9,3,2,23,17};
      prime_indexes(arr);
    }
}
