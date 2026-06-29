import java.util.*;
public class MaxLengthChainPairs{
    public static void main(String[] args){
        int[][] pairs = {{5,24},
                         {39,60},
                         {5,28},
                         {27,40},
                         {50,90}};
        
        Arrays.sort(pairs, Comparator.comparingDouble(o -> o[1]));

        int chainlen = 1; 
        int currend = pairs[0][1]; //1st pair's end
        for(int i=1; i<pairs.length; i++){
            if(pairs[i][0] > currend){
                chainlen++;
                currend = pairs[i][1]; //store current pair's end
            }
        }
        System.out.println("The longest chain is: " + chainlen);
    }
}