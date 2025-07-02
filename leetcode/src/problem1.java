import java.util.ArrayList;
import java.util.List;

class Solution {
    public static void main(String[] args) {
        findKDistantIndices();

    }

    public static void findKDistantIndices() {


        int[] nums = new int[]{3, 4, 9, 1, 3, 9, 5};
        int k = 1, key = 9;


        List<Integer> numbers = new ArrayList<>();
        List<Integer> keyIndex = new ArrayList<>();

        for (int j = 0; j < nums.length; j++) {
            if (nums[j] == key) {
                keyIndex.add(j);
            }

        }
//        int index = 0;
//        int j = keyIndex.get(index);
        for (int i = 0; i < nums.length; i++) {
            for(int j: keyIndex){
                if(Math.abs(i-j)<=k){
                    System.out.println(i);
                }
            }
        }
        keyIndex.stream().sorted();
    }
}

