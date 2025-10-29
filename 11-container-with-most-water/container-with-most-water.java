class Solution {
    public int maxArea(int[] height) {
        int n = height.length;
        int left = 0;
        int right = n - 1;
        int maximumArea = 0;
        while (left < right) {
            int h = Math.min(height[left], height[right]);
            int width = right - left;
            int area = width * h;
            maximumArea = Math.max(area, maximumArea);
            if (height[left] < height[right]) {
                left++;
            } else {
                right--;
            }
        }
        return maximumArea;
    }
}