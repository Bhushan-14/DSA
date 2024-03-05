package Tree;

import java.util.Scanner;

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
        displayAndBalance();
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
            if (node.left.balanceFactor() >= 0) {
                return rightRotate(node);
            } else {
                node.left = leftRotate(node.left);
                return rightRotate(node);
            }
        }

        if (node.balanceFactor() < -1) {
            if (node.right.balanceFactor() <= 0) {
                return leftRotate(node);
            } else {
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

    private void displayAndBalance() {
        System.out.println("AVL Tree structure:");
        display(root, "Root Node: ");
        System.out.println("Is AVL Tree balanced? " + balanced());
        System.out.println();
    }

    public static void main(String[] args) {
        AVLTreeDemo avlTree = new AVLTreeDemo();
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter values to insert into AVL tree (separated by spaces):");
        String input = scanner.nextLine();
        String[] values = input.split("\\s+");

        for (String value : values) {
            try {
                int intValue = Integer.parseInt(value);
                avlTree.insert(intValue);
            } catch (NumberFormatException e) {
                System.out.println("Invalid input. Please enter integers only.");
                return;
            }
        }

        scanner.close();
    }
}
