public class Practice01MathIterative implements Practice01Math {

    public int fib(int n) throws Exception{
        int fib = 1;
        int prevFib = 1;
        if(n < 0) {
            throw new IllegalArgumentException("Error: Enter a Natural Number"); // Exception here to just make a natural number is entered
        }
        if(n <= 1) {
            return n;
        }
        for(int x = 2; x < n; x++){ //This loop has a temp fib number which used to replace the previous fib and starting at two because the first two numbers of the series is already been added
            int tempFib = fib;
            fib += prevFib;
            prevFib = tempFib;
        }
        return fib;
    }

    public int fact(int n) throws Exception{ // goes through a for loop and just updates the total factorial
        int total = 1;
        if(n < 0) {
            throw new IllegalArgumentException("Error: Enter a Natural Number");
        }
        for(int x = 1; x <= n; x++) {
            total = total * x;
        }
        return total;
    }
}
