public static int longestContaintedRange(int[] arr){
	Set<Integer> hash = new HashSet<>();
	int max = 0;
	int upper;
	int lower;

	for(int i = 0; i < arr.length; i++){
		if(hash.add(arr[i])){
			//successful add
			upper = arr[i] + 1;
			while(hash.contains(upper)){
				hash.remove(upper);
				upper++;
			}

			lower = arr[i] - 1;
			while(hash.contains(lower)){
				hash.remove(lower);
				lower--;
			}

			max = Math.Max(max, upper - lower - 1);
		}
	}
	return max;
}