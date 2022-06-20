public class ContainerWithMostWater {
    public int maxArea(int[] height) {
        int left = 0;
        int right = height.length-1;
        int width = right;
        int max = 0;
        while(left<right) {
            if(height[left] < height[right]) {
                int temp = height[left++] * width;
                max = Math.max(temp, max);
            }
            else {
                int temp = height[right--] * width;
                max = Math.max(temp, max);
            }
            width--;
        }
        return max;
    }
}
