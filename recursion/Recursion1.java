
// //print numbers from 5 to 1;
// public class Recursion1{

//     static void PrintNum(int n){
//         if(n == 0){
//             return;
//         }

//         System.out.println(n);
//         PrintNum(n-1);
//     }
//     public static void main(String[] args){
//         int n = 5;
//         PrintNum(n);
//     }
// }



//print numbers from 1 to 5;
public class Recursion1{

    static void PrintNum(int n){
        if(n == 6){
            return;
        }

        System.out.println(n); //if you'll print here means it is printing on the same layer when it it moving up
        PrintNum(n+1);
        // System.out.println(n); //here it will print in rever manner cause it is print the values after all iterations till the basecase and then print in reverse order.
    }
    public static void main(String[] args){
        int n = 1;
        PrintNum(n);
    }
}