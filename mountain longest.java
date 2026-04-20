class Solution {
    public int longestMountain(int[] arr) {
        int n = arr.length;
        int up=0;
        int down=0;
        int max=0;
        for(int i=1;i<n;i++)
        {
            if((down>0 && arr[i]>arr[i-1])|| arr[i]==arr[i-1])
            {
                down=0;
                up=0;
            }
            if(arr[i]>arr[i-1])
            {
                up++;
            }
            else if(arr[i]<arr[i-1])
            {
                down++;
            }
            if(up>0 && down>0)
            {
                max=Math.max(max,down+up+1);
            }
        }
        return max;
        
    }
}