
public class YourBinaryTree extends BinaryTree {
    protected boolean heightBalanced() {
        return heightBalanced(root);
    }

    private boolean heightBalanced(Node cur) {
        if (cur == null) {
            return true;
        }
        if (Math.abs(countLevel(cur.left) - countLevel(cur.right)) > 1) {
            return false;
        }
        return heightBalanced(cur.left) && heightBalanced(cur.right);
    }

    private int countLevel(Node cur) {
        //this is added after second run, remember this code
        if (cur == null) {
            return 0;
        }

        int leftLevel = 0;
        int rightLevel = 0;
        leftLevel += 1 + countLevel(cur.left);
        rightLevel += 1 + countLevel(cur.right);
        return Math.max(leftLevel, rightLevel);
    }
}
