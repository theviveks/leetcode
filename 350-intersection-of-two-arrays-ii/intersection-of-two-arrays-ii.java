import java.util.ArrayList;
import java.util.Arrays;

class Solution {
    public int[] intersect(int[] nums1, int[] nums2) {
        int i = 0, j = 0;
        Arrays.sort(nums1);
        Arrays.sort(nums2);
        ArrayList<Integer> inter = new ArrayList<>();
        
        while (i < nums1.length && j < nums2.length) {
            if (nums1[i] < nums2[j]) {
                i++;
            } else if (nums1[i] > nums2[j]) {
                j++;
            } else {
                inter.add(nums1[i]);
                i++;
                j++;
            }
        }
        int [] ans= new int[inter.size()];
        int index=0;
        for(int k:inter){
            ans[index++]=k;
        }
        return ans;
    }
}
