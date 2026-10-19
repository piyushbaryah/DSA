class Solution {
    public boolean checkPerfectNumber(int num) {
        int sum=0;
        if(num==1) return false;
        for(int i=1;i*i<=num;i++){
            if(num%i==0){
                sum+=i;
            if(i!=(num/i) && num!=(num/i)){
                sum+=(num/i);
            }
            }
        }
        if(sum==num) return true;
        return false;

        // return (num==6 || num==28 || num==496 || num==8128 || num==33550336);
    }
}