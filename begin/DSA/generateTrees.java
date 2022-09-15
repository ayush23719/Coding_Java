class Solution {
    public List<TreeNode> generateTrees(int n) {
        return buildNodes(1, n);
    }
    
    private List<TreeNode> buildNodes(int low, int high) {
        List<TreeNode> result = new ArrayList<>();
        if(low > high) {
            result.add(null);
            return result;
        }
        
        for(int i = low; i <= high; i++) {
            List<TreeNode> leftRoots = buildNodes(low, i-1);
            List<TreeNode> rightRoots = buildNodes(i+1, high);
            
            for(TreeNode leftRoot : leftRoots) {
                for(TreeNode rightRoot: rightRoots) {
                    TreeNode root = new TreeNode(i);
                    root.left = leftRoot;
                    root.right = rightRoot;
                    result.add(root);
                }
            }
        }
        
        return result;
    }
}