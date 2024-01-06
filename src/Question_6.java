public class Question_6 {
//    Given n, check if it's a power of 2?
    public static void main(String[] args) {
        int n = 16;
        boolean ans = isPowerof2(n);
        System.out.println("Ans : "+ans);
    }
    static boolean isPowerof2(int n){
        int countSetBit = Question_5.countSetBits(n);
        if(countSetBit==1){
            return true;
        }else{
            return false;
        }
    }
}
