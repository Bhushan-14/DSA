package Tree;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

class TreeNode {
    int value;

    public TreeNode(int value, TreeNode left, TreeNode right) {
        this.value = value;
        this.left = left;
        this.right = right;
    }

    public TreeNode(int value) {
        this.value = value;
    }

    TreeNode left;
    TreeNode right;
}

public class InorderTraversal {
    public List<Integer> inorderTraversal(TreeNode root) {
        List<Integer> result = new ArrayList<>();
        Stack<TreeNode> stack = new Stack<>();

        TreeNode current = root;

        while (current != null || !stack.isEmpty()) {
            while (current != null) {
                stack.push(current);
                current = current.left;
            }

            current = stack.pop();
            result.add(current.value);
            current = current.right;
        }
        return result;
    }

    public static void main(String[] args) { 
        TreeNode root = new TreeNode(1, null, new TreeNode(2, new TreeNode(3), null));
        InorderTraversal inorderTraversal = new InorderTraversal();
        List<Integer> result = inorderTraversal.inorderTraversal(root);
        System.out.println(result);
    }
}
