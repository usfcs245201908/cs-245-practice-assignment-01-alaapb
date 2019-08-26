public class Practice01MathRecursive implements Practice01Math{

    public int fib(int n) throws Exception{
        if(n < 0) {
            throw new IllegalArgumentException("Error: Enter a Natural Number");
        }
        if(n == 0 || n == 1) { // The base case makes sure it is not asking for the 1st or 2nd term
            return n;
        }else{
            return fib(n - 1) + fib(n-2);
        }
    }

    public int fact(int n) throws Exception{
        if(n < 0) {
            throw new IllegalArgumentException("Error: Enter a Natural Number");
        }
        if(n <= 1) { // could go to negatives if this isn't here and would never stop.
            return 1;
        }else{
            return n * fact(n-1);
        }
    }
}
