package src.com.core.Ajay;

public class Singlenum {
    public static void main(String[] args) {
        int [] nums = {4,1,2,1,2};
        System.out.println(Singlenumber(nums));
    }
    

public static int Singlenumber(int nums []){
    int value = 0;
    for(int i =0;i<nums.length;i++){
        value = value^nums[i];
    }
    return value;
}
}