package Tree;
import java.util.Scanner;

public class TreeDemo1 {
    TreeNode root;

    static class TreeNode {
        int value;
        TreeNode left;
        TreeNode right;

        public TreeNode(int value) {
            this.value = value;
        }
    }

    public void insertRoot() {
        root = null;
    }

    public void insertRoot(int value) {
        root = new TreeNode(value);
    }

    public void insertNodeRec(int value) {
        root = insertNodeRec(root, value);
    }

    public TreeNode insertNodeRec(TreeNode root, int value) {
        if (root == null) {
            return new TreeNode(value);
        } else if (value < root.value) {
            root.left = insertNodeRec(root.left, value);
        } else if (value > root.value) {
            root.right = insertNodeRec(root.right, value);
        }
        return root;
    }

    public void displayTree() {
        displayTree(root, 0);
    }

    private void displayTree(TreeNode root, int level) {
        if (root != null) {
            displayTree(root.right, level + 1);
            for (int i = 0; i < level; i++) {
                System.out.print("   ");
            }
            System.out.println(root.value);
            displayTree(root.left, level + 1);
        }
    }

    public static void main(String[] args) {
        TreeDemo1 treeDemo1 = new TreeDemo1();
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter value of root node: ");
        int rootValue = scanner.nextInt();
        treeDemo1.insertRoot(rootValue);

        while (true) {
            System.out.println("Do you want to insert a node (true/false): ");
            boolean insert = scanner.nextBoolean();
            if (!insert) {

                break;
            }
            System.out.println("Enter the value of the new node: ");
            int nodeValue = scanner.nextInt();

            treeDemo1.insertNodeRec(nodeValue);
        }

        System.out.println("Binary Search Tree:");
        treeDemo1.displayTree();
    }
}
