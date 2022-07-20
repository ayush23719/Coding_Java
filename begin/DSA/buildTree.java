class Solution {
    public TreeNode buildTree(int[] preorder, int[] inorder) {
    if(preorder==null || inorder==null || inorder.length==0 || preorder.length==0) return null;
    TreeNode root = new TreeNode();
    
        if(inorder.length == 1) {
            root.val = inorder[0];
            return root;
        }
        
        root.val = preorder[0];
        int idx = 0;
        for(int i = 0; i < inorder.length; i++){
            if(inorder[i] == preorder[0]){
                idx = i;
                break;
            }
        }
        
        int linarr[] = Arrays.copyOfRange(inorder,0,idx);
        int lprearr[] = Arrays.copyOfRange(preorder,1,idx+1);
        int rinarr[] = Arrays.copyOfRange(inorder,idx + 1,inorder.length);
        int rprearr[] = Arrays.copyOfRange(preorder,idx + 1,preorder.length);
        
        root.left = buildTree(lprearr,linarr);
        root.right = buildTree(rprearr,rinarr);
        
        return root;
    }
    
    }