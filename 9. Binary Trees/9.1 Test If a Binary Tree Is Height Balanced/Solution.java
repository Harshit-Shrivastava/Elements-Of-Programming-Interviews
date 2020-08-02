private static class BalanceStatusWithHeight {
    public int height;
    public boolean balanced;;

    public BalanceStatusWithHeight(int height, boolean balanced) {
        this.height = height;
        this.balanced = balanced;
    }
}

public class Solution {
    public boolean isBalanced(BinaryTreeNode<Integer> tree) {
        return checkBalanced(tree).balanced;
    }

    private BalanceStatusWithHeight checkBalanced (BinaryTreeNode<Integer> tree) {
        //base case
        if (tree == null) {
            return new BalanceStatusWithHeight(-1, true);
        }

        BalanceStatusWithHeight leftResult = checkBalanced(tree.left);
        if(!leftResult.balanced) {
            return leftResult;
        }

        BalancedStatusWithHeight rightResult = checkBalanced(tree.right);
        if(!rightResult.balanced){
            return rightResult;
        }

        boolean isBalanced = Math.abs(leftResult.height - rightResult.height) <= 1;
        int height = Math.max(leftResult.height, rightResult.height) + 1;
        return new BalanceStatusWithHeight(height, isBalanced);
    }
}
