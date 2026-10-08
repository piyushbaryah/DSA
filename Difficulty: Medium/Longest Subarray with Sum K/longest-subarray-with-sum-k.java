class Solution {
    public int longestSubarray(int[] arr, int k) {
                HashMap<Integer, Integer> sc = new HashMap<>();

                int sum = 0;
                int maxlen = 0;

                for(int i=0; i<arr.length; i++){
                    sum += arr[i];

                    if(sum == k){
                        maxlen = i + 1;
                    }

                    if(sc.containsKey(sum-k)){
                        maxlen = Math.max(maxlen, i-sc.get(sum-k));
                    }

                    if(!sc.containsKey(sum)){
                        sc.put(sum, i);
                    }
                }

                return maxlen;
            }
        }