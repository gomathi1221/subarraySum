class Solution {
    static ArrayList<Integer> subarraySum(int[] arr, int target) {
        // code here
        ArrayList<Integer> a=new ArrayList<>(2);
        ArrayList<Integer> b=new ArrayList<>();
        b.add(-1);
        int sum;
        for(int i=0;i<=arr.length-1;i++){
            sum=0;
            for(int j=i;j<=arr.length-1;j++){
                int g=sum+arr[j];
                if(g==target){
                   a.add(i+1);
                   a.add(j+1);
                   return a;
                   
                }
                else if(arr[j]>target){
                    break;
                }
                else{
                    sum+=arr[j];
                }
            }
            
        }
        return b;
      
        
        
           
    }
}
