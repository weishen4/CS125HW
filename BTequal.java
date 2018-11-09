
public class YourBinaryTree extends BinaryTree {
    public boolean equals(Object other) {
        if (!(other instanceof BinaryTree)) {
            return false;
        }
        BinaryTree oth = (BinaryTree) other;
        return check(this.root, oth.root);
    }

    //pass in two roots
    public boolean check(Node fir, Node sec) {
        if (fir == null && sec == null) {
            return true;
        }
        if (fir == null || sec == null) {
            return false;
        }
        return fir.value.equals(sec.value)
                && check(fir.left, sec.left)
                && check(fir.right, sec.right);
    }
}
