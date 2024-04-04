public class Q2 {
    public static void main(String[] args) {
        int[] X = { 3, 6, 7, 8, 10, 12, 15, 18, 100 };
        int[] Y = { 1, 2, 3, 5, 7, 9, 10, 11, 15, 16, 18, 25, 50 };

        int maxSum = findMaximumSum(X, Y);
        System.out.println("The maximum sum path is: " + maxSum);
    }

    public static int findMaximumSum(int[] X, int[] Y) {
        int m = X.length;
        int n = Y.length;

        int i = 0, j = 0;
        int sumX = 0, sumY = 0, maxSum = 0;

        while (i < m && j < n) {
            if (X[i] < Y[j]) {
                sumX += X[i++];
            } else if (X[i] > Y[j]) {
                sumY += Y[j++];
            } else { // When X[i] == Y[j], we've found a common element
                maxSum += Math.max(sumX, sumY) + X[i];
                sumX = 0;
                sumY = 0;
                i++;
                j++;
            }
        }

        // Add remaining elements of X
        while (i < m) {
            sumX += X[i++];
        }

        // Add remaining elements of Y
        while (j < n) {
            sumY += Y[j++];
        }

        // Add maximum of remaining sums
        maxSum += Math.max(sumX, sumY);

        return maxSum;
    }
}
