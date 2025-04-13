class TreeNode {
    int val;
    TreeNode left, right;

    TreeNode(int val) {
        this.val = val;
        this.left = this.right = null;
    }
}

public class TreesTraversals {
    
    // Preorder Traversal (Root → Left → Right)
    public static void preorder(TreeNode root) {
        if (root == null) {
            System.out.print("-1 "); // Using -1 to indicate null (optional)
            return;
        }
        System.out.print(root.val + " ");
        preorder(root.left);
        preorder(root.right);
    }

    // Inorder Traversal (Left → Root → Right)
    public static void inorder(TreeNode root) {
        if (root == null) {
            System.out.print("-1 ");
            return;
        }
        inorder(root.left);
        System.out.print(root.val + " ");
        inorder(root.right);
    }

    // Postorder Traversal (Left → Right → Root)
    public static void postorder(TreeNode root) {
        if (root == null) {
            System.out.print("-1 ");
            return;
        }
        postorder(root.left);
        postorder(root.right);
        System.out.print(root.val + " ");
    }

    // Main method to test traversal functions
    public static void main(String[] args) {
        TreeNode root = new TreeNode(1);
        root.left = new TreeNode(2);
        root.right = new TreeNode(3);
        root.left.left = new TreeNode(4);
        root.left.right = new TreeNode(5);
        root.right.left = new TreeNode(6);
        root.right.right = new TreeNode(7);

        System.out.print("Preorder: ");
        preorder(root);
        System.out.println();

        System.out.print("Inorder: ");
        inorder(root);
        System.out.println();

        System.out.print("Postorder: ");
        postorder(root);
        System.out.println();
    }
}
