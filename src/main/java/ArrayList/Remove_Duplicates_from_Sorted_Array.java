package ArrayList;

public class Remove_Duplicates_from_Sorted_Array{
    public static void main(String[] args) {
        System.out.println(  removeDuplicates(new int[]{0,0,1,1,1,2,2,3,3,4}));
    }
    public  static int removeDuplicates(int[] nums) {
        int insertIndex=1;
        if(nums.length==0)
            return 0;
        for(int i=1;i<nums.length;i++){
            if(nums[i-1]!=nums[i])
            {
                nums[insertIndex]=nums[i];
                insertIndex++;
            }
        }
        return insertIndex;
    }
}