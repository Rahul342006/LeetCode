//Given two sorted arrays nums1 and nums2 of size m and n respectively, return the median of the two sorted arrays.
//The overall run time complexity should be O(log (m+n)) so merging of array not allowed.
//Example 1:
//Input: nums1 = [1,3], nums2 = [2]
//Output: 2.00000
//Explanation: merged array = [1,2,3] and median is 2.
//Example 2:
//Input: nums1 = [1,2], nums2 = [3,4]
//Output: 2.50000
//Explanation: merged array = [1,2,3,4] and median is (2 + 3) / 2 = 2.5.

class MedianOfTwoArrays {
    public static void main(String[] args) {
        int[] arr1 = {1, 2};
        int[] arr2 = {3, 4};

        int low = 0;
        int high = arr1.length;

        // Total elements to consider on left side of partition
        int totalLeft = (arr1.length + arr2.length + 1) / 2;

        int PartitionA = 0;
        int PartitionB = 0;

        double median = 0; // using double to handle decimal median

        while (low <= high) {
            int mid = low + (high - low) / 2;
            PartitionA = mid;
            PartitionB = totalLeft - PartitionA;

            // Assign leftA
            int leftA;
            if (PartitionA == 0) {
                leftA = Integer.MIN_VALUE;
            } else {
                leftA = arr1[PartitionA - 1];
            }

            // Assign rightA
            int rightA;
            if (PartitionA == arr1.length) {
                rightA = Integer.MAX_VALUE;
            } else {
                rightA = arr1[PartitionA];
            }

            // Assign leftB
            int leftB;
            if (PartitionB == 0) {
                leftB = Integer.MIN_VALUE;
            } else {
                leftB = arr2[PartitionB - 1];
            }

            // Assign rightB
            int rightB;
            if (PartitionB == arr2.length) {
                rightB = Integer.MAX_VALUE;
            } else {
                rightB = arr2[PartitionB];
            }

            // Check if we have correct partition
            if (leftA <= rightB && leftB <= rightA) {
                int total = arr1.length + arr2.length;

                if (total % 2 == 0) {
                    // Even total length: average of max(lefts) and min(rights)
                    median = (Math.max(leftA, leftB) + Math.min(rightA, rightB)) / 2.0;
                } else {
                    // Odd total length: median is max of left parts
                    median = Math.max(leftA, leftB);
                }

                break; // median found, exit loop
            } 
            else if (leftA > rightB) {
                // PartitionA too far right, move left
                high = PartitionA - 1;
            } 
            else {
                // PartitionA too far left, move right
                low = PartitionA + 1;
            }
        }

        System.out.println("Median is " + median);
    }
}
