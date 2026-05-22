public class SumofNatNum{
    static void printSum(int i,int n,int sum){
        if(i == n+1){
            System.out.println(sum);
            return;
        }
        sum = sum + i;
        printSum(i + 1,n,sum);
    }

    public static void main(String[] args){
        int i = 1;
        int n = 20;
        int sum = 0;
        printSum(i,n,sum);
    }
}