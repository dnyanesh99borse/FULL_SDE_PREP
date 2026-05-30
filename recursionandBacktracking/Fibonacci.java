public class Fibonacci{
    public static void PrintFib(int a, int b, int n){
        if(n == 0){
            return;
        }
        int c = a + b;
        System.out.println(c);
        PrintFib(b, c, n-1);

    }

    public static void main(String[] args){
        int a = 0; int b = 1;
        int n = 8;  //means print fibonacci numbers upto 8 numbers of the series.
        System.out.println(a);
        System.out.println(b);
        PrintFib(a,b,n-2);
    }
}