package com.practice;

import java.util.ArrayList;
import java.util.List;

public class LowestCommonAncestor {

    private static List<Node> nodePath = new ArrayList<>();
    private static boolean pathFound = false;


    public static void main(String[] args) {

        Node node = new Node(2,
                new Node(1, null, null),
                new Node(3,
                        new Node(4, null, null),
                        new Node(5, new Node(6, null, null), null)));

//        findNode(node, 6);
        Node resultNode = lca(node, 4, 6);
        System.out.println("LCA :: "+resultNode.data);

    }

    public static Node lca(Node root, int v1, int v2) {
        // Write your code here.
        findNode(root, v1);
        List<Node> v1Path = new ArrayList<>(nodePath);

        nodePath.clear();
        pathFound = false;
        findNode(root, v2);

        Node resultNode = null;
        int v1PathSize = v1Path.size();
        int v2PathSize = nodePath.size();
        int minPath = (v1PathSize < v2PathSize)?v1PathSize:v2PathSize;
        for(int i=1; i<= minPath; i++) {
            if(v1Path.get(v1PathSize-i) == nodePath.get(v2PathSize-i)) {
                resultNode = v1Path.get(v1PathSize-i);
            } else {
                break;
            }
        }

        return resultNode;
    }


    private static void findNode(Node root, int i) {
        if(root.data == i) {
            pathFound = true;
            nodePath.add(root);
            return;
        }

        if(root.left != null && !pathFound)
            findNode(root.left, i);
        if(root.right != null && !pathFound)
            findNode(root.right, i);

        if(pathFound)
            nodePath.add(root);
    }

    private static class Node {
        int data;
        Node left, right;

        public Node(int data, Node left, Node right) {
            this.data = data;
            this.left = left;
            this.right = right;
        }
    }
}
