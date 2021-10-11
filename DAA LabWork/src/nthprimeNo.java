import java.util.Scanner;

public class nthprimeNo {
    public static int prime_no(int n){
        int count =0;
        int nth=0;
        int i=2;
        while(count<n){
            for(int j=2;i<i;i++){
                if(i%j!=0){
                    count++;
                    nth=j;
                }
            }
        }
        return nth;
    }

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter Value of n");
        int n= sc.nextInt();
        System.out.println(prime_no(n));
    }
}
