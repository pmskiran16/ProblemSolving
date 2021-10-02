package com.practice.tree;

public class LevelOrderTraversing {
    public static void main(String[] args) {
        MyNode rootNode = new MyNode(1,
                new MyNode(2, new MyNode(4, null, null), new MyNode(5, null, null)),
                new MyNode(3, null, null));

        levelOrder(rootNode, 3);
    }

    private static void levelOrder(MyNode node, int level) {
        if(node == null ) {
            return;
        }

        if(level == 1) {
            System.out.println(node.value);
        } else if(level > 1) {
            levelOrder(node.leftNode, level-1);
            levelOrder(node.rightNode, level-1);
        }
    }

    static class MyNode {
        MyNode leftNode;
        MyNode rightNode;
        int value;

        public MyNode(int value, MyNode leftNode, MyNode rightNode) {
            this.value = value;
            this.leftNode = leftNode;
            this.rightNode = rightNode;

        }
    }
}
