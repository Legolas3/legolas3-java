package Week4;

public class Factorial {

    public int recursionFactorial(int n){
        if(n == 1)
        return n;

        return n * recursionFactorial(n-1);
    }
}
