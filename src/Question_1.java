public class Question_1 {
//    Given N array elements, every element repeats expect 1 element find unique element.
    public static void main(String[] args) {
        int[] array = {1,2,2,1,3,5,4,6,3,5,4};
        int ans = getUnique(array);
        System.out.println("Ans : "+ans);
    }
    static int getUnique(int[] array){
        int ans = 0;
        for(int i=0;i<array.length;i++){
            ans = ans ^ array[i];
        }
        return ans;
    }
}
