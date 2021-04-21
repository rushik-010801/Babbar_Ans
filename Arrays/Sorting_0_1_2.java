//https://practice.geeksforgeeks.org/problems/sort-an-array-of-0s-1s-and-2s4231/1#
class Solution
{
    public static void sort012(int a[], int n)
    {
        // My appraoch
        /*int z = 0, o = 0, t = 0;
        for(int i = 0; i < a.length; i++){
            if(a[i] == 0)
                z++;
            else if(a[i] == 1)
                o++;
            else
                t++;
        }
        int i = 0;
        int temp = i;
        for(; i < a.length && i < temp + z; i++){
            a[i] = 0;
        }
        temp = i;
        for(; i < a.length && i < temp + o; i++){
            a[i] = 1;
        }
        temp = i;
        for(; i < a.length && i < temp + t; i++){
            a[i] = 2;
        }*/
        int low = 0, high = n-1, mid = 0;
        while(mid <= high){
            if(a[mid]==0) {
                int temp=a[low];
                a[low]=a[mid];
                a[mid]=temp;
                low++;
                mid++;
            } else if(a[mid]==1) {
                mid++;
            } else {
                int temp=a[mid];
                a[mid]=a[high];
                a[high]=temp;
                high--;
            }
        }
    }
}
// Write your own driver or input code.
