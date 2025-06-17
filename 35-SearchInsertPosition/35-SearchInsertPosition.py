# Last updated: 6/17/2025, 8:58:44 AM
class Solution:
    def searchInsert(self,arr,target):
        low = 0
        high = len(arr)-1
        mid = int((low+high)//2)
        while(low <= high):
            mid = int((low+high)//2)
            if arr[mid] == target:
                return mid
            if arr[mid] < target:
                low = mid+1
            elif arr[mid] > target:
                high = mid-1 
        return low
solution = Solution()
target = 5
arr=[1,2,3,4,5]
print(solution.searchInsert(arr,target))
