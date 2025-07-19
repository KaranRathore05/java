import java.util.*;

class TreeNode {
    int val;
    TreeNode left, right;
    TreeNode(int x) {
        val = x;
    }
}

public class InorderTraversal {
    public List<Integer> inorderTraversal(TreeNode root) {
        List<Integer> res = new ArrayList<>();
        inorder(root, res);
        return res;
    }

    private void inorder(TreeNode node, List<Integer> res) {
        if (node == null) return;
        inorder(node.left, res);
        res.add(node.val);
        inorder(node.right, res);
    }

    public static void main(String[] args) {
        // Constructing this tree:
        //      1
        //       \
        //        2
        //       /
        //      3
        TreeNode root = new TreeNode(1);
        root.right = new TreeNode(2);
        root.right.left = new TreeNode(3);

        InorderTraversal obj = new InorderTraversal();
        List<Integer> result = obj.inorderTraversal(root);
        System.out.println(result);  // Output: [1, 3, 2]
    }
}
