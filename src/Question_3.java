public class Question_3 {
//    Given n & i, set ith bit in n
    public static void main(String[] args) {
        int n = 26;
        int i = 2;
        int ans = setBit(n,i);
        System.out.println("Ans : "+ans);
    }
    static int setBit(int n,int i){
        if(!Question_2.checkBit(n,i)) {
            n = n + (1 << i);
        }
        return n;
//        return (n|1<<i);  //  Without Condition
    }
}
