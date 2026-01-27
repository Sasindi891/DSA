class Node {
    int data;
    Node left, right;

    Node(int d) {
        data = d;
    }
}

public class BinarySearchTree {

    Node root;

    Node insert(Node node, int key) {
        if (node == null) return new Node(key);

        if (key < node.data)
            node.left = insert(node.left, key);
        else if (key > node.data)
            node.right = insert(node.right, key);

        return node;
    }

    void inorder(Node node) {
        if (node != null) {
            inorder(node.left);
            System.out.print(node.data + " ");
            inorder(node.right);
        }
    }

    public static void main(String[] args) {
        BinarySearchTree tree = new BinarySearchTree();

        int[] values = {50, 30, 20, 40, 70, 60, 80};
        for (int v : values)
            tree.root = tree.insert(tree.root, v);

        tree.inorder(tree.root);
    }
}
