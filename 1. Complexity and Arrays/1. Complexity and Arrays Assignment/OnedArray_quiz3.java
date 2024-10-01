public class OnedArray_quiz3 {
    public static void main(String[] args) {
        int[] arr = { 10,15 , 18, 8, 99, 0, -4 };
        int max = Integer.MIN_VALUE;
        System.out.println(max);
        for (int val : arr) {
            max = Math.max(max, val);
        }
        System.out.print("Largest in given array is " + max);

    }
}
