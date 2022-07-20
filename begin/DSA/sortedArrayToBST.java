class Solution {
    public TreeNode sortedArrayToBST(int[] nums) {
    if(nums.length==0)
    {
    return null;
    }
    return createAbinarySearchTree(nums,0,nums.length-1);
    }
    public TreeNode createAbinarySearchTree(int[] nums,int left, int right){
    
        if(left>right){ 
            return null;
        }
        
        int mid= left + (right-left) /2;
        
        TreeNode node = new TreeNode(nums[mid]);
    
        node.left=createAbinarySearchTree(nums,left,mid-1);
        node.right=createAbinarySearchTree(nums,mid+1,right);
        
        return node;
    }
    
    }