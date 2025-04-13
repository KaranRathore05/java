public class BinarySerchTree {

    static class Node {
        int data;
        Node left;
        Node right;
        Node(int data) {
            this.data = data;}     }

              public static void inorder(Node rootNode){
                if (rootNode == null) {
                    return;
                }
                inorder(rootNode.left);
                System.out.println(rootNode.data + " ");
                inorder(rootNode.right);


              }
         

    public static  Node insert (Node rootNode,int val ){
        if (rootNode == null){
            rootNode = new Node(val);
            return rootNode;
        }
        if(rootNode.data > val){
            //left subtree
            rootNode.left = insert(rootNode.left, val);
        }
        else if(rootNode.data < val){
            //right subtree
            rootNode.right = insert(rootNode.right, val);
        }
                return rootNode;
        
    }
    public static boolean search(Node rootNode, int key){
        if (rootNode == null){
            return false;
        }
        if (rootNode.data == key){
            return true;
        }
        if (rootNode.data > key){
            return search(rootNode.left, key);
        }
        else{
            return search(rootNode.right, key);
        }
    }
    public static int minValue(Node rootNode) {
        int minValue = rootNode.data;
        while (rootNode.left != null) {
            rootNode = rootNode.left;
            minValue = rootNode.data;
        }
        return minValue;
    }

    public static Node delete(Node rootNode, int val){
        if (rootNode == null){
            return null;
        }
        if (val< rootNode.data){
            rootNode.left = delete(rootNode.left, val);
        }
        else if (val > rootNode.data){
            rootNode.right = delete(rootNode.right, val);
        }
        else{
            // Node with only one child or no child
            if (rootNode.left == null)
                return rootNode.right;
            else if (rootNode.right == null)
                return rootNode.left;

            // Node with two children: Get the inorder successor (smallest in the right subtree)
            rootNode.data = minValue(rootNode.right);

            // Delete the inorder successor
            rootNode.right = delete(rootNode.right, rootNode.data);
        }
        return rootNode;
    }
    public static void main(String[] args) {
        int val[] = { 5, 1, 3, 4, 2, 7 };
        Node rootNode = null;
        for (int i = 0; i < val.length ; i++) {
            rootNode = insert(rootNode,val[i]);
          
            
        }
        inorder(rootNode);
    }
}
