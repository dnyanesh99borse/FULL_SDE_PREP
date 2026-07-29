public class LC2379 {
    public static int minimumRecolors(String blocks, int k) {
        int bcount = 0;
        int minOp = 0;

        for(int i=0; i<k; i++){
            if(blocks.charAt(i) == 'B'){
                bcount++;
            }

            if(bcount == k){
                return 0;
            }
            minOp = k - bcount;
        }

        for(int i=k; i<blocks.length(); i++){
            if(blocks.charAt(i) == 'B'){
                bcount++;
            }
            if(blocks.charAt(i - k) == 'B'){
                bcount--;
            }
            if(bcount == k){
                return 0;
            }
            minOp = Math.min(minOp, k - bcount);
        }
        return minOp;
    }
    public static void main(String[] args){
        String blocks = "WBWBBBW";
        int k = 2;

        System.out.println(minimumRecolors(blocks,k));
    }
}
