class Solution {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        ArrayList<Integer> nums3 = new ArrayList<>();
        int n1= nums1.length;
        int n2 = nums2.length;
        int i=0,j=0;
        while (i < n1 && j < n2) {
            if (nums1[i] <= nums2[j]) {
                nums3.add(nums1[i]);
                i++;
            } else {
                nums3.add(nums2[j]);
                j++;
            }
        }
        while (i < n1) {
            nums3.add(nums1[i]);
            i++;
        }
        while (j < n2) {
            nums3.add(nums2[j]);
            j++;
        }
        int n=i+j;
        if(n%2==0){
             return (double) (nums3.get(n/2)+nums3.get((n-1)/2))/2;
        }
        else{
             return (double) nums3.get(n/2);
        }
    }
}