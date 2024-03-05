package Tree;

import com.sun.source.tree.Tree;

public class SegmentTree {
    private class TreeNode {
        TreeNode left;
        TreeNode right;
        int data;
        int startInterval;
        int endInterval;

        public TreeNode(int startInterval, int endInterval) {
            this.startInterval = startInterval;
            this.endInterval = endInterval;
        }
    }

    TreeNode root;

    public SegmentTree(int[] arr) {
        // create tree using array
        this.root = constructTree(arr, 0, arr.length - 1);
    }

    private TreeNode constructTree(int[] arr, int start, int end) {
        if (start == end) {
            // leaf node
            TreeNode leaf = new TreeNode(start, end);
            leaf.data = arr[start];
            return leaf;
        }

        // create new node with the index you are at
        TreeNode treeNode = new TreeNode(start, end);
        int mid = (start + end) / 2;

        treeNode.left = this.constructTree(arr, start, mid);
        treeNode.right = this.constructTree(arr, mid + 1, end);

        treeNode.data = treeNode.left.data + treeNode.right.data;
        return treeNode;
    }

    public void display() {
        display(this.root);
    }

    private void display(TreeNode node) {
        if (node == null) {
            return;
        }

        String str = "Interval = [" + node.startInterval + " - " + node.endInterval + "] and data: " + node.data;

        if (node.left != null) {
            str += " -> Left Child: [" + node.left.startInterval + " - " + node.left.endInterval + "]";
        } else {
            str += " -> No left child";
        }

        if (node.right != null) {
            str += " -> Right Child: [" + node.right.startInterval + " - " + node.right.endInterval + "]";
        } else {
            str += " -> No right child";
        }

        System.out.println(str);

        display(node.left);
        display(node.right);
    }

    public int query(int qsi, int qei) {
        return this.query(this.root, qsi, qei);
    }

    private int query(TreeNode node, int qsi, int qei) {
        if (node.startInterval >= qsi && node.endInterval <= qei) {
            // node is completely lying inside the query
            return node.data;
        } else if (node.startInterval > qei || node.endInterval < qsi) {
            return 0;
        } else {
            return this.query(node.left, qsi, qei) + this.query(node.right, qsi, qei);
        }
    }

    public void update(int index, int value) {
        update(this.root, index, value);
    }

    private void update(TreeNode node, int index, int value) {
        if (node == null) {
            return;
        }

        if (index >= node.startInterval && index <= node.endInterval) {
            if (node.startInterval == index && node.endInterval == index) {
                // Node is the leaf node corresponding to the index
                node.data = value;
            } else {
                update(node.left, index, value);
                update(node.right, index, value);
                node.data = node.left.data + node.right.data;
            }
        }
    }

    public static void main(String[] args) {
        int[] arr = {3, 8, 6, 7, -2, -8, 4, 9};
        SegmentTree segmentTree = new SegmentTree(arr);

        System.out.println("Original Segment Tree:");
        segmentTree.display();

        System.out.println("Query result for interval [1, 4]: " + segmentTree.query(1, 4));

        // Update value at index 2 to 10
        segmentTree.update(2, 10);
        System.out.println("After update:");
        segmentTree.display();
    }
}
