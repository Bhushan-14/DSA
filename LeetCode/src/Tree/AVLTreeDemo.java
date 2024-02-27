package Tree;

public class AVLTreeDemo {

    public class Node {
        private int value;
        private Node left;
        private Node right;
        private int height;

        public Node(int value) {
            this.value = value;
        }

        public int getValue() {
            return value;
        }

        private int balanceFactor() {
            return height(left) - height(right);
        }
    }

    private Node root;

    public AVLTreeDemo() {
    }

    public int height() {
        return height(root);
    }

    private int height(Node node) {
        if (node == null) {
            return -1;
        }
        return node.height;
    }

    public void insert(int value) {
        root = insert(value, root);
    }

    private Node insert(int value, Node node) {
        if (node == null) {
            node = new Node(value);
        } else if (value < node.value) {
            node.left = insert(value, node.left);
        } else if (value > node.value) {
            node.right = insert(value, node.right);
        }

        node.height = Math.max(height(node.left), height(node.right)) + 1;
        return rotate(node);
    }

    private Node rotate(Node node) {
        if (node.balanceFactor() > 1) {
            // Left heavy
            if (node.left.balanceFactor() >= 0) {
                // Left-left case
                return rightRotate(node);
            } else {
                // Left-right case
                node.left = leftRotate(node.left);
                return rightRotate(node);
            }
        }

        if (node.balanceFactor() < -1) {
            // Right heavy
            if (node.right.balanceFactor() <= 0) {
                // Right-right case
                return leftRotate(node);
            } else {
                // Right-left case
                node.right = rightRotate(node.right);
                return leftRotate(node);
            }
        }

        return node;
    }

    public Node rightRotate(Node p) {
        Node c = p.left;
        Node t = c.right;

        c.right = p;
        p.left = t;

        p.height = Math.max(height(p.left), height(p.right)) + 1;
        c.height = Math.max(height(c.left), height(c.right)) + 1;

        return c;
    }

    public Node leftRotate(Node c) {
        Node p = c.right;
        Node t = p.left;

        p.left = c;
        c.right = t;

        p.height = Math.max(height(p.left), height(p.right)) + 1;
        c.height = Math.max(height(c.left), height(c.right)) + 1;

        return p;
    }

    public void populate(int[] nums) {
        for (int num : nums) {
            this.insert(num);
        }
    }

    public void populatedSorted(int[] nums) {
        populatedSorted(nums, 0, nums.length);
    }

    private void populatedSorted(int[] nums, int start, int end) {
        if (start < end) {
            int mid = (start + end) / 2;
            this.insert(nums[mid]);
            populatedSorted(nums, start, mid);
            populatedSorted(nums, mid + 1, end);
        }
    }

    public void display() {
        display(root, "Root Node: ");
    }

    private void display(Node node, String details) {
        if (node != null) {
            System.out.println(details + node.value);
            display(node.left, "Left child of " + node.value + ": ");
            display(node.right, "Right child of " + node.value + ": ");
        }
    }

    public boolean isEmpty() {
        return root == null;
    }

    public boolean balanced() {
        return balanced(root);
    }

    private boolean balanced(Node node) {
        return node == null || (Math.abs(height(node.left) - height(node.right)) <= 1 && balanced(node.left) && balanced(node.right));
    }

    public static void main(String[] args) {
        AVLTreeDemo avlTree = new AVLTreeDemo();

        int[] nums = {30, 20, 40, 10, 25, 35, 50};

        // Populating AVL tree
        avlTree.populate(nums);

        // Displaying AVL tree
        System.out.println("AVL Tree structure:");
        avlTree.display();

        // Checking if AVL tree is balanced
        System.out.println("\nIs AVL Tree balanced? " + avlTree.balanced());
    }
}
