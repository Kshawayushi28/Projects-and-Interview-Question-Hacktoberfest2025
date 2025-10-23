class Solution {
    public int findNumbers(int[] nums) {
        int ans=0;
        for(int num : nums){
            if(even(num)){
                ans++;
            }
        }
        return ans;
    }

    boolean even(int num){
        int numberOfDigits = digits(num);
        if(numberOfDigits % 2 == 0){
            return true;
        }
        return false;
    }

    static int digits(int num){
        if(num < 0){
            num = num * -1;
        }
        return (int)(Math.log10(num)) + 1;
    }
}
