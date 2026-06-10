public class EvenorOdd{
    public static void EvenorOdd(int n){
        int bitmask = 1;
        if((n & bitmask) == 0){
            System.out.println("no. is Even");
        }else{
            System.out.println("no. is Odd");
        }
    }
    //----GET ITH BIT
    public static int getIthBit(int n, int i){
        int bitmask = 1 << i;
        if((n & bitmask) == 0){
            return 0;
        }else{
            return 1;
        }
    }

    //-----------SET ITH BIT
        public static int setIthBit(int n, int i){
        int bitmask = 1 << i;
        return n | bitmask;
    }

    //-----------CLEAR ITH BIT
        public static int clearIthBit(int n, int i){
        int bitmask = ~(1 << i);
        return n & bitmask;
    }

    //-----------UPDATE ITH BIT
        public static int updateIthBit(int n, int i, int newbit){
        if(newbit == 0){
            return clearIthBit(n , i);
        }else{
            return setIthBit(n, i);
        }
    }

    //-----------UPDATE ITH BIT
        public static int clearLastIthBit(int n, int i){
        int bitmask = ~(0)<<i;
        return n & bitmask;
    }

    public static void main(String[] args){
        EvenorOdd(10);
        //get ith bit
        System.out.println(getIthBit(10, 3));

        //set ith bit
        System.out.println(setIthBit(10, 2));

        //clear ith bit
        System.out.println(clearIthBit(10, 1));

        //update ith bit
        System.out.println(updateIthBit(10, 2, 1));

        //clear last ith bit
        System.out.println(clearLastIthBit(15, 2));
    }
}