//There are two lines of input. The first line contains : the breadth of the parallelogram. The next line contains : the height of the parallelogram.
// in static block format

public class Solution {
Write your code here
static int B;
static int H;
static Boolean flag=true;
static{
    Scanner sc=new Scanner(System.in);
    B=sc.nextInt();
    H=sc.nextInt();
if(B<=0 || H<=0){
    flag=false;
    System.out.println("java.lang.Exception: Breadth and height must be positive");
}
}
public static void main(String[] args){
		if(flag){
			int area=B*H;
			System.out.print(area);
		}
		
	}//end of main

}//end of class

