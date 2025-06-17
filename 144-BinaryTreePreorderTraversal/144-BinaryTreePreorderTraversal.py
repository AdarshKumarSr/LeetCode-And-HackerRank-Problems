# Last updated: 6/17/2025, 8:58:26 AM
# Definition for a binary tree node.
class TreeNode:
    def __init__(self, val=0, left=None, right=None):
        self.val = val
        self.left = left
        self.right = right
class Solution:
    def preorderTraversal(self, root: TreeNode) -> List[int]:
        result = []
        def traverse(node):
            if node is None:
                return
            result.append(node.val)
            traverse(node.left)
            traverse(node.right)
            
        traverse(root)
        return result


            


        