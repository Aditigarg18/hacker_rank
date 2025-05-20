   public static int diagonalDifference(List<List<Integer>> arr) {
    // Write your code here
    int sum=0,sum1=0,ans=0;
    int no=arr.size();
for(int i=0;i<no;i++){
            sum=sum+arr.get(i).get(i);
            sum1=sum1+arr.get(i).get(no-i-1);
        }
    ans=Math.abs(sum-sum1);
    return ans;
}
}
