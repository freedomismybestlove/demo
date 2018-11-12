package datastructure.tree;

import java.util.Scanner;
import java.util.Stack;

/**
 * 二叉树Java代码实现
 *
 * @author Pushy
 * @since 2018/11/12 16:41
 */
public class BinaryTree {

    static class Node {

        public Integer data;
        public Node left;
        public Node right;

        public Node(Integer data) {
            this.data = data;
        }
    }

    /**
     * 测试创建二叉树
     */
    public static Node createTree() {
        Node root = new Node(1);
        Node headLeft = new Node(2);  // 创建左节点
        Node headRight = new Node(3); // 创建右节点

        root.left = headLeft;
        root.right = headRight;

        return root;
    }

    /**
     * 递归创建二叉树结构
     */
    public static void initTree(Node node) {
        Scanner scanner = new Scanner(System.in);
        int data = scanner.nextInt();

        if (data == -1) {
            return;
        }
        //
    }

    /**
     * 递归实现先序遍历二叉树
     */
    public static void preOrderTraverse(Node node) {
        if (node == null) {
            return;
        }
        System.out.print(node.data);
        preOrderTraverse(node.left);
        preOrderTraverse(node.right);
    }

    /**
     * 递归实现中序遍历二叉树
     */
    public static void midOrderTraverse(Node node) {
        if (node == null) {
            return;
        }
        System.out.print(node.data);
        midOrderTraverse(node.left);
        midOrderTraverse(node.right);
    }

    /**
     * 递归实现后序遍历二叉树
     */
    public static void postOrderTraverse(Node node) {
        if (node == null) {
            return;
        }
        postOrderTraverse(node.left);
        postOrderTraverse(node.right);
        System.out.print(node.data);
    }

    /**
     * 使用栈非递归实现二叉树的先序遍历
     */
    public static void front(Node root) {

        if (root == null) {
            return;
        }
        Stack<Node> nodes = new Stack<>();
        nodes.add(root);

        while (!nodes.isEmpty()) {
            // 取出栈顶元素，判断是否有子节点
            Node temp = nodes.pop();
            System.out.println("当前子节点的值： " + temp.data);

            if (temp.right != null) {
                nodes.push(temp.right);
            }

            if (temp.left != null) {
                nodes.push(temp.left);
            }
        }
    }

    public static void main(String[] args) {
        Node root = BinaryTree.createTree();

        System.out.println("先序遍历：");
        BinaryTree.preOrderTraverse(root);

        System.out.println("\n中序遍历：");
        BinaryTree.midOrderTraverse(root);

        System.out.println("\n后序遍历：");
        BinaryTree.postOrderTraverse(root);

        BinaryTree.front(root);
    }

}
