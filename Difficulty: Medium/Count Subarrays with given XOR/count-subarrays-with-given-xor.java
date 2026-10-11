class Solution {
	public long subarrayXor(int arr[], int k) {
		// code here
		int n = arr.length;
		HashMap<Integer, Integer> sc = new HashMap<>();
		sc.put(0, 1);
		long count = 0;
		int xr = 0;
		for (int i = 0; i<n; i++) {
			xr = xr^arr[i];
			
			int x = xr^k;
			
			if (sc.containsKey(x)) {
				count += sc.get(x);
			}
			sc.put(xr, sc.getOrDefault(xr, 0) + 1);
		}
		return count;
	}
}
