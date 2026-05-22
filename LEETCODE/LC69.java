public class LC69{
    static int mySqrt(int x){
        int start = 0;
        int end = x;

        while(start <= end){
            int mid = start + (end - start)/2;

            if(mid * mid == x || mid * mid < x){
                return mid;
            }else if(mid * mid > x){
                end = mid - 1;
                System.out.println(end);
            }
        }
        return -1;      
    }

    public static void main(String[] args){
        int x = 8;

        System.out.println(mySqrt(x));
    }
}