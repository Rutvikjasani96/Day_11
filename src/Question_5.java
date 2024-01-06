public class Question_5 {
//    Given n,calculate no. of set bits are there in n.
    public static void main(String[] args) {
        int n= 150;
        int ans = countSetBitsTeq2(n);
        System.out.println("Ans : "+ans);
    }
    static int countSetBits(int n){
        int cnt=0;
        for(int i=0;i<32;i++){
            if(Question_2.checkBit(n,i)){
                cnt++;
            }
        }
        return cnt;
    }
    static int countSetBitsTeq2(int n){
        int cnt=0;
        while(n>0){
            if((n&1)==1){
                cnt++;
            }
            n = n>>1;
        }
        return cnt;
    }
}
