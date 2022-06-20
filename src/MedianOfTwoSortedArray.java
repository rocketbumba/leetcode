public class MedianOfTwoSortedArray {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int p1 = 0;
        int p2 = 0;
        int length = nums1.length + nums2.length;
        int median = length/2;
        double result = 0;
        if(length % 2 != 0) {
            for(int i = 0; i<median+1; i++) {
                if(p2 >= nums2.length || (p1<nums1.length && nums1[p1]<nums2[p2])) result = nums1[p1++];
                else result = nums2[p2++];
            }
        }
        else {
            int temp1 = 0;
            int temp2 = 0;
            for(int i = 0; i<median; i++) {
                if(p2 >= nums2.length || (p1<nums1.length && nums1[p1]<nums2[p2])) temp1 = nums1[p1++];
                else temp1 = nums2[p2++];
            }
            if(p2 >= nums2.length) temp2 = nums1[p1];
            else if(p1 >= nums1.length) temp2 = nums2[p2];
            else temp2 = Math.min(nums1[p1], nums2[p2]);
            result = (temp1+temp2)/2.0;
        }
        return result;
    }
}
