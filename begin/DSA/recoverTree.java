class Solution {
    public TreeNode first=null,second=null;
    public TreeNode prev=null;
    
    public void recoverTree(TreeNode root) {
        fixBST(root);
        first.val+=second.val;
        second.val=first.val-second.val;
        first.val=first.val-second.val;
    }
    
    public void fixBST(TreeNode root){
        if(root!=null){
            fixBST(root.left);
            if(prev!=null && prev.val>root.val){
                if(first==null)
                    first=prev;
                second=root;
            }
            prev=root;
            fixBST(root.right);
        }
    }
}