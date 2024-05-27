class Solution {
    private void reverse(char[] arr,int i,int j){
        while(i<j){
            char temp=arr[i];
            arr[i]=arr[j];
            arr[j]=temp;
            i++;
            j--;
        }
    }
    public String reverseStr(String s, int k) {
        char[] arr=s.toCharArray();
        int n=arr.length,i=0;
        for (int start = 0; start < n; start += 2 * k) {
            int end = Math.min(start + k - 1, n - 1);
            reverse(arr, start, end);
        }
        return new String(arr);
    }
}