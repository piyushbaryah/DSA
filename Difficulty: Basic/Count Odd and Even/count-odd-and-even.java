class Solution {
    public int[] countOddEven(int[] arr) {
        // Code here
        int even=0;
        int odd=0;
        int[] sc = new int[2];
        for(int i: arr){
            if(i%2==0){
                even++;
            }
            else odd++;
        }
        sc[0]=odd;
        sc[1]=even;
        return sc;
    }
}