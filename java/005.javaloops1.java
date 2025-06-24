// print table from i to 10 for an integer N
public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(bufferedReader.readLine().trim());
for(int i=1;i<11;i++){
    // int res=N*i;
    System.out.println(N+" x "+i+" = "+N*i);
}
        bufferedReader.close();
    }
}
