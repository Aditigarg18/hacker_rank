    public static void miniMaxSum(List<Integer> arr) {
    // Write your code here
long min=Long.MAX_VALUE;
long max=Long.MIN_VALUE;
long sum=0L,ans1=0L,ans2=0L;
for(int num:arr){
    if(num<min)min=num;
    if(num>max)max=num;
    sum=sum+num;
}
ans1=sum-max;
ans2=sum-min;
System.out.print(ans1+" "+ans2);
   
    }

}
