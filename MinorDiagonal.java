import java.util.Scanner;
public class MinorDiagonal {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt(),m = sc.nextInt();
        int[][] arr = new int[n][m];
        for(int i=0;i<n;i++) {
            for(int j=0;j<m;j++) {
                arr[i][j] = sc.nextInt();
            }
        }
        System.out.println(findMinorSum(arr, n, m));
        sc.close();
    }

    static int findMinorSum(int[][] arr,int n,int m){
        int sum = 0,j = m-1;
        for(int i=0;i<n;i++) {
            sum += arr[i][j];
            j--;
        }
        return sum;
    }
}