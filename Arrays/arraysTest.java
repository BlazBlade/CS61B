package Arrays;

public class arraysTest {
    public static void main(String[] args) {
        int[][] x = {{1, 2, 3}, {4, 5, 6}, {7, 8, 9}};

        int[][] z = new int[3][];
        z[0] = x[0];
        z[0][0] = -z[0][0];

        int[][] w = new int[3][3];
        System.arraycopy(x[0], 0, w[0], 0, 3);
        w[0][0] = -w[0][0];
    }
}
