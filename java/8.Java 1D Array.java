//print 1d array
public class Solution {

    public static void main(String[] args) {
	   
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
int a[]=new int[n];
for(int i=0;i<n;i++){
  a[i]=scan.nextInt();
}
// for(int i=0;i<n;i++){
//     System.out.println(a[i]);
// }
        scan.close();

        // Prints each sequential element in array a
        for (int i = 0; i < a.length; i++) {
            System.out.println(a[i]);
        }
    }
