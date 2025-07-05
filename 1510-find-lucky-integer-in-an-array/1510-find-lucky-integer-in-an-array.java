class Solution {
    public int findLucky(int[] arr) {
        int max = -1;
        int[] freq = new int[501];

        for (int i = 0; i<arr.length; i++){
            freq[arr[i]]++;
        };
        for (int i = 0; i<freq.length; i++){
            if (freq[i] == i) max = i; 
        }

        return max = (max == 0) ? -1 : max;
    }
}