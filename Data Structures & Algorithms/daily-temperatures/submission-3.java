class Solution {
    public int[] dailyTemperatures(int[] temperatures) {
        int res[] = new int[temperatures.length];
        for(int i = 0;i < temperatures.length;i++) {
            System.out.printf("Main idx %d : temp: %d%n",i,temperatures[i]);
            int j = i + 1;
            while(j < temperatures.length && (temperatures[i] > temperatures[j] || temperatures[i] == temperatures[j])) {
                System.out.printf("Index: %d : number: %d%n",j,temperatures[j]);
                
                j++;
            }
            if(j < temperatures.length) {
                res[i] = j - i;
                System.out.printf("resIdx: %d : resNum: %d%n",j,temperatures[j]);
            }
        }

        return res;
    }
}
