class Solution {
    void merge(int arr[], int l, int m, int r)
    {
         // Your code here
         ArrayList <Integer> temp= new ArrayList <>();
         int left=l;
         int high=m+1;
         while(left<=m && high<=r){
             if(arr[left]<=arr[high]){
                 temp.add(arr[left]);
                 left++;
             }
             else{
                 temp.add(arr[high]);
                 high++;
             }
         }
         while(left<=m){
            temp.add(arr[left]);
                 left++;
         }
         while(high<=r){
             temp.add(arr[high]);
                 high++;
         }
         for(int i=l;i<=r;i++){
             arr[i]=temp.get(i-l);
         }
         
    }
    void mergeSort(int arr[], int l, int r)
    {
        //code here
        if(l>=r) return ;
        int mid=(l+r)/2;
        mergeSort(arr,l,mid);
        mergeSort(arr,mid+1,r);
        merge(arr,l,mid,r);
    }
    public int[] sortArray(int[] nums) {
        mergeSort(nums,0,nums.length-1);
        return nums;
    }
}