import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class MaxPairwiseProduct {

    public static void main(String[] args) {


        FastScanner scanner = new FastScanner(System.in);
        int n = scanner.nextInt();
        int[] arr = new int[n];

        for (int i = 0; i < n; i++) {
            arr[i] = scanner.nextInt();
        }
        System.out.println(MaxPairwiseProducts(arr));

    }

    public static long MaxPairwiseProducts(int[] arr){
        long max =  -1;
        int length = arr.length;
        long product = 0;
        if(length == 1)
            return (long) arr[0];
        else{
            Arrays.sort(arr);

            product =  (long) arr[length - 1] * arr[length - 2];
        }

        return product;
    }

    static class FastScanner {
        BufferedReader br;
        StringTokenizer st;

        FastScanner(InputStream stream) {
            try {
                br = new BufferedReader(new
                        InputStreamReader(stream));
            } catch (Exception e) {
                e.printStackTrace();
            }
        }

        String next() {
            while (st == null || !st.hasMoreTokens()) {
                try {
                    st = new StringTokenizer(br.readLine());
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
            return st.nextToken();
        }

        int nextInt() {
            return Integer.parseInt(next());
        }
    }
}
