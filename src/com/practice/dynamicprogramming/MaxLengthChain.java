package com.practice.dynamicprogramming;

import java.util.ArrayList;
import java.util.List;

public class MaxLengthChain {

    static List<NodeValue> resultList = new ArrayList<>();

    public static void main(String[] args) {

        ArrayList<NodeValue> list = new ArrayList<>();
        list.add(new NodeValue(5, 24));
        list.add(new NodeValue(39, 60));
        list.add(new NodeValue(15, 28));
        list.add(new NodeValue(27, 40));
        list.add(new NodeValue(50, 90));

        findChain(list, new ArrayList<NodeValue>());

        System.out.println("Result list length :: " + resultList.size());
        resultList.forEach((NodeValue value)-> System.out.println(value));
    }

    private static void findChain(ArrayList<NodeValue> list, ArrayList<NodeValue> traverseList) {

        if( list.isEmpty()) {
            if(resultList.size() < traverseList.size()) {
                resultList.clear();
                resultList.addAll(traverseList);
            }
            return;
        }

        for ( NodeValue outerNode: list) {
            ArrayList<NodeValue> tempList = new ArrayList<>();
            for (NodeValue node: list ) {
                if(outerNode.end < node.start)
                    tempList.add(node);
            }

            if(traverseList == null)
                traverseList = new ArrayList<>();

            traverseList.add(outerNode);
            findChain(tempList, traverseList);
            traverseList.remove(outerNode);

        }
    }
}

class NodeValue {
    int start, end;
    public NodeValue(int start, int end) {
        this.start = start;
        this.end = end;
    }

    @Override
    public String toString() {
        return "NodeValue{" +
                "start=" + start +
                ", end=" + end +
                '}';
    }
}

