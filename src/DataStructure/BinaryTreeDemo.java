package DataStructure;

public class BinaryTreeDemo{
    public static void main(String[] args) {
        BinaryNode root = new BinaryNode(1,"D");
        BinaryNode left1 = new BinaryNode(1,"B");
        BinaryNode left2 = new BinaryNode(1,"A");
        BinaryNode right1 = new BinaryNode(1,"C");
        BinaryNode right2 = new BinaryNode(1,"E");
        root.setLeft(left1);
        left1.setLeft(left2);
        left1.setRight(right1);
        root.setRight(right2);
//        new BinaryTree(root).preOrder();
//        System.out.println();
        new BinaryTree(root).infixOrder();
//        System.out.println();
//        new BinaryTree(root).postOrder();
    }

}
class BinaryTree {
    private BinaryNode root;

    public BinaryTree(BinaryNode root) {
        this.root = root;
    }

    public void preOrder() {
        if (root==null) {
            System.out.println("二叉树为空");
            return;
        }
        root.preOrder();
    }
    public void infixOrder() {
        if (root==null) {
            System.out.println("二叉树为空");
            return;
        }
        root.infixOrder();
    }
    public void postOrder() {
        if (root==null) {
            System.out.println("二叉树为空");
            return;
        }
        root.postOrder();
    }
}

class BinaryNode {
    private int no;
    private String name;
    private BinaryNode left;
    private BinaryNode right;

    /**
     * 前 序 遍 历
     */
    public void preOrder() {
        System.out.print(this);
        if (this.left != null) {
            this.left.preOrder();
        }
        if (this.right != null) {
            this.right.preOrder();
        }
    }

    /**
     * 中 序 遍 历
     */
    public void infixOrder() {
        if (this.left != null) {
            this.left.infixOrder();
        }
        System.out.print(this);
        if (this.right != null) {
            this.right.infixOrder();
        }
    }

    /**
     * 后 序 遍 历
     */
    public void postOrder() {
        if (this.left != null) {
            this.left.postOrder();
        }
        if (this.right != null) {
            this.right.postOrder();
        }
        System.out.print(this);
    }
    public BinaryNode(int no, String name) {
        this.no = no;
        this.name = name;
    }

    public int getNo() {
        return no;
    }

    public void setNo(int no) {
        this.no = no;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public BinaryNode getLeft() {
        return left;
    }

    public void setLeft(BinaryNode left) {
        this.left = left;
    }

    public BinaryNode getRight() {
        return right;
    }

    public void setRight(BinaryNode right) {
        this.right = right;
    }

    @Override
    public String toString() {
        return name;


    }
}