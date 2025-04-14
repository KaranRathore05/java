public class Binarytree {
    static class Node {
        int data;
        Node left, right;

        Node(int data) {
            this.data = data;
            this.left = null;
            this.right = null;
        }
    }
    static class IndexWrapper {
        int index = 0;
    }

    static class Tree {
        public static Node buildTree(int nodes[], IndexWrapper index) {
            if (index.index >= nodes.length || nodes[index.index] == -1) {
                index.index++;
                return null;
            }

            Node newNode = new Node(nodes[index.index]);
            index.index++;

            newNode.left = buildTree(nodes, index);
            newNode.right = buildTree(nodes, index);

            return newNode;
        }

        public static void preorder(Node root) {
            if (root == null) {
                return;
            }
            System.out.print(root.data + " ");
            preorder(root.left);
            preorder(root.right);
        }

        public static void inorder(Node root) {
            if (root == null) {
                return;
            }
            inorder(root.left);
            System.out.print(root.data + " ");
            inorder(root.right);
        }
    }

    public static void main(String[] args) {
        int nodes[] = {1, 2, -1, -1, 4, -1, -1, 3, -1, -1};

        Tree tree = new Tree();
        IndexWrapper index = new IndexWrapper();
        Node root = tree.buildTree(nodes, index);

        System.out.println("Binary Tree created successfully!");

        System.out.println("Preorder Traversal:");
        tree.preorder(root);
        System.out.println();

        System.out.println("Inorder Traversal:");
        tree.inorder(root);
        System.out.println();
    }
}
