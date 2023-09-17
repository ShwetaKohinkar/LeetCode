public class MergeTwoSortedArray {


    public static void main(String[] args) {
       int[] nums1 = new int[]{4,5,6,0,0,0};
        int[] nums2 = new int[]{1,2,3};
        merge(nums1, 3,nums2,3);

    }

        public static void merge(int[] nums1, int m, int[] nums2, int n) {
            int[] temp = new int[nums1.length];

            int i = 0, j = 0, k =0;

            while(i<m && j < n) {
                if (nums1[i] <= nums2[j]) {
                    temp[k] = nums1[i];
                    k++;
                    i++;
                } else {
                    temp[k] = nums2[j];
                    k++;
                    j++;
                }
            }
                while(i<m){
                    temp[k] = nums1[i];
                    i++;
                    k++;
                }

            while(j<n){
                temp[k] = nums2[j];
                j++;
                k++;
            }
            for (int l = 0; l < m+n; l++)
            {
                nums1[l] = temp[l];
            }

        }
}
