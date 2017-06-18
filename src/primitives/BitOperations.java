package primitives;

/**
 * Created by amatada on 5/22/2017.
 */
public class BitOperations {

    public static void main(String args[]){
        BitOperations bo = new BitOperations();
        //bo.runOps();
        //bo.parity();
        System.out.println(Integer.toBinaryString(10));
        int x = 10;
        x^=(1L <<0) | (1L << (1));
        System.out.println(Integer.toBinaryString(x));
    }

    private void runOps() {

        System.out.println("No. of set bits for "+2+"("+Integer.toBinaryString(2)+") is:"+countBits(2));
        System.out.println("No. of set bits for "+15+"("+Integer.toBinaryString(15)+") is:"+countBits(15));

    }

    private int countBits(int i) {
        short numOfBits = 0;
        while(i!=0)
        {
            numOfBits += i&1;
            i>>>=1;
        }
        return numOfBits;
    }

    private void parity(){
        short result =0;
        int x = 15;
        while(x!=0){
            System.out.println(Integer.toBinaryString(x));
            result ^= (x & 1);
            x >>>= 1;
            System.out.println(Integer.toBinaryString(result)+" "+Integer.toBinaryString(x));
        }
    }
}
