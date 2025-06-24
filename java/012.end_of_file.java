// Sample Input

// Hello world
// I am a file
// Read me until end-of-file.
// Sample Output

// 1 Hello world
// 2 I am a file
// 3 Read me until end-of-file.

  public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
  Scanner sc=new Scanner(System.in);
int n=1;
while(sc.hasNext()){
  System.out.println(n++ +" "+sc.nextLine());
    }
    sc.close();
}
}
