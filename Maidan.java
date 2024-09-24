class Maidan {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
             int n = nums1.length;
        int m = nums2.length;
        int i = 0, j = 0, mid1 = 0, mid2 = 0;

        // Find median.
        for (int count = 0; count <= (n + m) / 2; count++) {
            mid2 = mid1;
            if (i != n && j != m) {
                if (nums1[i] > nums2[j]) {
                    mid1 = nums2[j++];
                } else {
                    mid1 = nums1[i++];
                }
            } else if (i < n) {
                mid1 = nums1[i++];
            } else {
                mid1 = nums2[j++];
            }
        }
        if ((n + m) % 2 == 1) {
            return (double) mid1;
        } else {
            double ans = (double) mid1 + (double) mid2;
            return ans / 2.0;
        }
    }

    public void main(String [] args){
        int [] num1={1,2};
        int [] num2={3,4};
        System.out.print(findMedianSortedArrays(num1,num2));
    }
}