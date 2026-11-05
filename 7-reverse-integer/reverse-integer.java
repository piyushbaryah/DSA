class Solution {
    public int reverse(int x) {
        long rev=0;
        int flag=0;
        if(x<0){
            x=Math.abs(x);
            flag=1;
        }
            while(x>0){
            int d = x%10;
            rev=rev*10+d;
            x=x/10;
        }

        if(flag==1){
            rev=-rev;
        }
        
        if(rev<Integer.MIN_VALUE || rev>Integer.MAX_VALUE){
            return 0;
        }
        
        return (int)(rev);
    }
}