import java.util.Arrays;

public class Rotation_of_2d_array05 {

    public static void rotatedMatrix(int arr[][]) {
        // step1 : transpose the 2d array
        int m = arr.length; // m = no of raws /
        int n = arr[0].length; // n = no of columns
        for (int i = 0; i < m; i++) {
            for (int j = i; j < n; j++) {
                int temp = arr[i][j];
                arr[i][j] = arr[j][i];
                arr[j][i] = temp;

            }

        }

        // step2 swap the left and right side columns
        for (int i = 0; i < m; i++) {
            int li = 0; // li = left index
            int ri = n - 1; // ri = right index
            while (li < ri) {
                int temp = arr[i][li];
                arr[i][li] = arr[i][ri];
                arr[i][ri] = temp;

                li++;
                ri--;

            }
        }
    }

    public static void main(String[] args) {
        int arr[][] = {
                { 1, 2, 3, 4 },
                { 5, 6, 7, 8 },
                { 9, 10, 11, 12 },
                { 13, 14, 15, 16 }
        };

        rotatedMatrix(arr);
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[0].length; j++) {
                System.out.println("Hello ");
                System.out.println(arr[i][j] + " ");
            }
        }
        for (var mat : arr) {
            System.out.println(" Rotated matrix is :  " + Arrays.toString(mat));
        }

    }

}
// Time complexity = O(n)
// Space complexity = O(1)