package com.practice;

public class HuffmanDecoding {
    public static void main(String[] args) {
    Node node = new Node(5, '-',
        new Node(2, '-',
                new Node(1,'B', null, null),
                new Node(1, 'C',null, null)),
        new Node(3, 'A', null, null));

        new HuffmanDecoding().decode("1001011", node);
    }


    void decode(String s, Node root) {
        StringBuilder resultString = new StringBuilder();
        while (s.length() > 0) {
            resultString.append(fineNextChar(s, root));
            s = updatedString;
        }

        System.out.println(resultString.toString());
    }

    private static String updatedString;
    private static char fineNextChar(String s, Node root) {
        if(root.left == null && root.right == null) {
            updatedString = s;
            return root.data;
        }

        if(s.length() > 0) {
            switch (s.charAt(0)) {
                case '0': if(root.left==null) {
                    updatedString = s;
                    return root.data;
                } else {
                    return fineNextChar(s.substring(1, s.length()), root.left);
                }
                case '1': if(root.right == null) {
                    updatedString = s;
                    return root.data;
                } else {
                    return fineNextChar(s.substring(1, s.length()), root.right);
                }

            }
        }

        return root.data;
    }

    private static class Node {
        public  int frequency;
        public  char data;
        public  Node left, right;

        public Node(int frequency, char data, Node left, Node right) {
            this.frequency = frequency;
            this.data = data;
            this.left = left;
            this.right = right;
        }
    }
}
