public class Question_4 {
//    set xth & yth bit in number 0.
    public static void main(String[] args){
        int x = 2,y = 5;
        int ans = setIn0(x,y);
        System.out.println("Ans : "+ans);
    }
    static int setIn0(int x,int y){
        int ans=0;
        if(x!=y){
            ans = (1<<x)+(1<<y);
        }else{
            ans = 1<<x;
        }
        return ans;
//        return (1<<x)|(1<<y);    // Without Condition
    }
}
