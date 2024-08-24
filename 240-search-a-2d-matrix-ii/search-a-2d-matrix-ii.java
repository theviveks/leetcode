class Solution {
    public boolean searchMatrix(int[][] a, int target) {
        int m = a.length;
        int n = a[0].length;
        int i=0;
        int j=n-1;
        while(i<m && j>=0){
            if(a[i][j] == target){
                return true;
            }else if(a[i][j] > target){
                j--;
            }else{
                i++;
            }
        }
        return false;
    }
}