package Week4;

import java.util.Scanner;

public class SumOfArrays {
    static long sum=0;
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int T=sc.nextInt();
        long [] a=new long[T];
        for(int i=0;i<T;i++){
            a[i]=sc.nextLong();

            sum+=a[i];


        }System.out.println(sum);

    }
}
