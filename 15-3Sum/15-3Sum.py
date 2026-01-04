# Last updated: 1/4/2026, 11:48:12 PM
1class Solution:
2    def threeSum(self, nums: List[int]) -> List[List[int]]:
3        nums.sort()  
4        result = []
5        n = len(nums)
6    
7        for i in range(n):
8            if i > 0 and nums[i] == nums[i-1]:
9                continue  
10        
11            left, right = i + 1, n - 1
12        
13            while left < right:
14                total = nums[i] + nums[left] + nums[right]
15            
16                if total == 0:
17                    result.append([nums[i], nums[left], nums[right]])
18                
19                    while left < right and nums[left] == nums[left + 1]:
20                        left += 1  
21                    while left < right and nums[right] == nums[right - 1]:
22                        right -= 1   
23                
24                    left += 1
25                    right -= 1
26                
27                elif total < 0:
28                    left += 1
29                else:
30                    right -= 1
31    
32        return result
33        