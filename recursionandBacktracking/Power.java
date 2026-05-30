public class Power{
    static int NumtoPow(int x, int n){
        if(n == 0){
            return 1;
        }
        int nextt = NumtoPow(x , n - 1);
        int term = x * nextt;
        return term;
    }

    public static void main(String[] args){
        int x = 2;
        int n = 8;

        int ans = NumtoPow(x, n);
        System.out.println(ans);
    }
}