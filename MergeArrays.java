
public class MergeArrays {
    public static void merge(int[] X, int[] Y) {
        int m = X.length;
        int n = Y.length;

        int lastIndex = m - 1; // Index of last non-vacant cell in X
        for (int i = m - 1, j = n - 1; i >= 0 && j >= 0;) {
            if (X[i] != 0) {
                X[lastIndex--] = X[i--];
            } else {
                X[lastIndex--] = Y[j--];
            }
        }

        // If there are remaining elements in Y, copy them to X
        while (j >= 0) {
            X[lastIndex--] = Y[j--];
        }
    }

    public static void main(String[] args) {
        int[] X = { 0, 2, 0, 3, 0, 5, 6, 0, 0 };
        int[] Y = { 1, 8, 9, 10, 15 };

        merge(X, Y);

        // Print the merged array X
        for (int num : X) {
            System.out.print(num + " ");
        }
    }
}
