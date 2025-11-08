// Last updated: 11/8/2025, 12:12:53 PM
class Solution {
    public List<Integer> findMissingElements(int[] nums) {
        List<Integer> list = new ArrayList<>();
        List<Integer> ans = new ArrayList<>();

        int min = Arrays.stream(nums).min().orElse(Integer.MAX_VALUE);
        int max = Arrays.stream(nums).max().orElse(Integer.MIN_VALUE);

        for(int i=min; i<max; i++){
            list.add(i);
        }

        for(int e : list){
            boolean found = false;
            for(int num : nums){
                if(e == num){
                    found = true;
                    break;
                }
            }

            if(!found){
                ans.add(e);
            }
        }
        return ans;

    }
}