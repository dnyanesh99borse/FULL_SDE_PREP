import java.util.*;
public class LCBeautifulArray{
    public static List beautifulArray(int n){
        ArrayList<Integer> res = new ArrayList<>();
        res.add(1);

        while(res.size() < n){
            ArrayList<Integer> temp = new ArrayList<>();
            //Odd numbers
            for(int num : res){
                int odd = 2 * num - 1;
                if(odd <= n){
                    temp.add(odd);
                }
            }
            //Even numbers
            for(int num : res){
                int even = 2 * num;
                if(even <= n){
                    temp.add(even);
                }
            }
            res = temp;
        }
        return res;
    }
    public static void main(String[] args){
        int n = 5;
        System.out.println(beautifulArray(n));
    }
}