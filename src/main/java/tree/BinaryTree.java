package tree;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Objects;

/**
 * java中二叉树的简单实现
 * @author QinQiang
 * @since 2018-12-06 9:44
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class BinaryTree {

    private TreeNode root;

    @Data
    @AllArgsConstructor
    @NoArgsConstructor
    private static class TreeNode {

        private String data = null;

        private TreeNode leftNode;

        private TreeNode rightNode;
    }

    /**
     * 返回父结点
     * @param element 子结点
     * @return 父结点
     */
    public TreeNode getParent(TreeNode element) {
        return (Objects.isNull(root) || Objects.equals(root, element)) ? null : parent(root, element);
    }

    private TreeNode parent(TreeNode subTree, TreeNode elememt) {
        if (Objects.isNull(subTree)) {
            return null;
        }
        if (Objects.equals(subTree.getLeftNode(), elememt) || Objects.equals(subTree.getRightNode(), elememt)) {
            return subTree;
        }

        TreeNode p;

        if (Objects.nonNull(p = parent(subTree.getLeftNode(), elememt))) {
            return p;
        }else {
            return parent(subTree.getRightNode(), elememt);
        }
    }

    /**
     * 获取树的结点数
     * @return 结点个数
     */
    public int getSize() {
        return getNum(root);
    }

    private int getNum(TreeNode root) {
        if (Objects.isNull(root)) {
            return 0;
        } else {
            int i = getNum(root.getLeftNode());
            int j = getNum(root.getRightNode());
            return i + j + 1;
        }
    }

    /**
     * 获取树的高度
     * @return 树的高度
     */
    public int getHeight() {
        return getHeight(root);
    }

    private int getHeight(TreeNode root) {

        if (Objects.isNull(root)) {
            return 0;
        }else {
            int i = getHeight(root.getLeftNode());
            int j = getHeight(root.getRightNode());
            return (i < j) ? (j + 1) : (i + 1);
        }
    }

    /**
     * 前序遍历
     */
    public void preOrder(TreeNode node) {
        if (Objects.nonNull(node)) {
            System.out.println(node.getData());
            preOrder(node.getLeftNode());
            preOrder(node.getRightNode());
        }
    }

    /**
     * 中序遍历
     */
    public void inOrder(TreeNode node) {
        if (Objects.nonNull(node)) {
            inOrder(node.getLeftNode());
            System.out.println(node.getData());
            inOrder(node.getRightNode());
        }
    }


    /**
     * 后序遍历
     */
    public void postOrder(TreeNode node) {
        if (Objects.nonNull(node)) {
            postOrder(node.getLeftNode());
            postOrder(node.getRightNode());
            System.out.println(node.getData());
        }
    }



}
