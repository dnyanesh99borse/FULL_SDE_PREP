// public class Factorial{
//     static void PrintFact(int n, int fact){
//         if(n == 0){
//             System.out.println(fact);
//             return;
//         }

//         fact *= n;
//         PrintFact(n - 1, fact);
//     }

//     public static void main(String[] args){
//         int n = 1;
//         int fact = 1;
//         PrintFact(n,fact);
//     }
// }



public class Factorial{
    static int PrintFact(int n){
        if(n == 0 || n == 1){
            return 1; 
        }

        int fact_nm1 = PrintFact(n-1);
        int fact_n = n * fact_nm1;
        return fact_n;
    }

    public static void main(String[] args){
        int n = 5;
        System.out.println(PrintFact(n));
    }
}