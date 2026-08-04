
import java.util.*;

public class MergeIntervals {
    public static int[][] merge(int[][] intervals) {
        //sort the array
        Arrays.sort(intervals, (a, b) -> a[0] - b[0]);

        List<int[]> ans = new ArrayList<>();

        ans.add(intervals[0]);

        for(int i=1;i<intervals.length;i++){

            //last for update the end
            int[] last = ans.get(ans.size() - 1);

            if(intervals[i][0] <= last[1]){
                last[1] = Math.max(last[1], intervals[i][1]);
            }else{
                ans.add(intervals[i]);
            }
        }
        return ans.toArray(new int[ans.size()][]);
    }
    public static void main(String[] args){
        int[][] intervals = {{1,3},{2,6},{8,10},{15,18}};
        System.out.println(Arrays.deepToString(merge(intervals)));
    }
}
