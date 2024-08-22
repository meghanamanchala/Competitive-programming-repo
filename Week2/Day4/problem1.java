//Problem -1 : Duplicate Zeros

// Given a fixed-length integer array arr, duplicate each occurrence of zero, shifting the remaining elements to the right.

// Note that elements beyond the length of the original array are not written. Do the above modifications to the input array in place and do not return anything.

//Solution:

class problem1 {
    public void duplicateZeros(int[] arr) {
        int length = arr.length;
        for(int i =0;i<length;i++)
        {
            if(arr[i] == 0 && i+1 < length)
            {
                for(int j = length -1;j > i+1;j--)
                {
                    arr[j] = arr[j-1];
                }
                arr[i+1] = 0;
                i++;
            }
        }
    }
}