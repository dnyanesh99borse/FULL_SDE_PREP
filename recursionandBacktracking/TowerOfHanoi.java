public class TowerOfHanoi{
    public static void TowerOfHanoi(int n, String src, String helper, String dest){
        //n: no. of disks, //src: source, //helper: helper, //dest: destination
        if(n == 1){
            System.out.println("transfer disk " + n + " from "+src+" to "+dest);
            return;
        }
        //for transfering n-1 disks to the helper
        TowerOfHanoi(n - 1, src, dest, helper);
        //and it means it get passed to the destination finally.
        System.out.println("transfer disk " + n + " from "+src+" to "+dest);
        //for transfering this n-1 disks to the destination.
        TowerOfHanoi(n-1,helper, src, dest);
    }

    public static void main(String[] args){
        int n = 2;
        String src = "Source";
        String helper = "helper";
        String dest = "Destination";

        TowerOfHanoi(n,src,helper,dest);
    }
}