package com.practice.dynamicprogramming;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class CuttheTree_M {

    private static MyNode rootNode;
    private static List<Integer> data;
    private static List<MyNode> nodeList = new ArrayList<>();

    public static void main(String[] args) {

        System.out.println(cutTheTree(Arrays.asList(1, 2, 3, 4, 5, 6), Arrays.asList(Arrays.asList(1, 2),
                Arrays.asList(1, 3),
                Arrays.asList(1, 3),
                Arrays.asList(2, 6),
                Arrays.asList(3, 4),
                Arrays.asList(3, 5)
                )));

    }


    public static int cutTheTree(List<Integer> data, List<List<Integer>> edges) {
        // Write your code here
        CuttheTree_M.data = data;

        for(int i = 0; i < edges.size(); i++) {
            addEdge(new Edge(edges.get(i).get(0), edges.get(i).get(1)));
        }

        nodeList.forEach(i -> {
            if(i.paths != null) {
                i.paths.forEach(j -> {
                    j.isVisited = false;
                });
            } else {
                i.isVisited = false;
            }
        });

        printTree(rootNode);
        return 0;
    }

    private static void printTree(MyNode node) {
        if(node == null)
            return;

        if(node.paths != null) {
            for(int i = 0; i < node.paths.size(); i++) {
                if(!node.paths.get(i).isVisited) {
                    node.paths.get(i).isVisited = true;
                    printTree(node.paths.get(i));
                }
            }
        }

        System.out.println("Vertex :: "+node.vertex+" -- value :: "+node.value);
    }

    private static void addEdge(Edge edge) {
        if(rootNode == null) {
            rootNode = new MyNode(data.get(edge.left-1), edge.left);
            rootNode.paths.add(new MyNode(data.get(edge.right-1), edge.right));
            nodeList.add(rootNode);
            nodeList.add(rootNode.paths.get(0));
            return;
        }

        MyNode node1 = findVertex(rootNode, edge.left);
        if (node1 == null) {
            node1 = new MyNode(data.get(edge.left-1), edge.left);
        }

        MyNode node2 = findVertex(rootNode, edge.right);
        if(node2 == null) {
            node2 = new MyNode(data.get(edge.right-1), edge.right);
        }

        node1.paths.add(node2);
        node2.paths.add(node1);

        nodeList.add(node1);
        nodeList.add(node2);
    }

    private static MyNode findVertex(MyNode node, int vertex) {
        if(node == null)
            return null;
        if(node.vertex == vertex) {
            return node;
        }

        for(int i = 0; i<((node.paths != null)?node.paths.size():0); i++) {
            if(!node.isVisited) {
                node.paths.get(i).isVisited = true;
                return findVertex(node.paths.get(i), vertex);
            }
        }

        return null;
    }

    static class MyNode {
        int value, vertex;
        List<MyNode> paths = new ArrayList<>();
        boolean isVisited = false;

        public MyNode(int value, int vertex) {
            this.value = value;
            this.vertex = vertex;
        }
    }

    static class Edge {
        int left, right;

        public Edge(int left, int right) {
            this.left = left;
            this.right = right;
        }
    }

}
