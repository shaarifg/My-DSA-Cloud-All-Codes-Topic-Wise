import java.util.Arrays;

public class ReverseArray {
    public static void main(String[] args) {
        int[][] a = {{1,1,0},{0,0,1},{0,0,0}};

        int [][] ans = flipAndInvertImage(a);
        for (int [] x: ans){
            System.out.println(Arrays.toString(x));
        }
    }
    public static int[][] flipAndInvertImage(int[][] image) {
        for(int[] row:image){
            flipRow(row);
            System.out.println(Arrays.toString(row));
            for(int i=0; i<row.length; i++){
                row[i]  = row[i]^1;
            }
        }
        return image;
    }

    public static int[] flipRow(int[] row){
        int n = row.length/2;
        for (int i = 0; i < n; i++) {
            int t = row[i];
            row[i] = row[row.length-1-i];
            row[row.length-1-i] = t;
        }
        return row;
    }
}
