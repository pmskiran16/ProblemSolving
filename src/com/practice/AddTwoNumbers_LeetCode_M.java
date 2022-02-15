package com.practice;

public class AddTwoNumbers_LeetCode_M {
    public static void main(String[] args) {
        ListNode l1 = new ListNode(2, new ListNode(4, new ListNode(3, null)));
        ListNode l2 = new ListNode(5, new ListNode(6, new ListNode(4, null)));

        ListNode result = new AddTwoNumbers_LeetCode_M().addTwoNumbers(l1, l2);
        while(result != null) {
            System.out.println(result.val);
            result = result.next;
        }
    }

    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode result = null;
        ListNode tempNode = null;
        int tempSum = 0;

        while(l1 != null || l2 != null) {
            if(l1 != null) {
                tempSum += l1.val;
                l1 = l1.next;
            }

            if(l2 != null) {
                tempSum += l2.val;
                l2 = l2.next;
            }

            if(tempNode == null) {
                result = tempNode = new ListNode(0, null);
            } else {
                tempNode.next = new ListNode(0, null);
                tempNode = tempNode.next;
            }

            tempNode.val = (tempSum>=10)?tempSum%10:tempSum;
            tempSum /= 10;
        }

        if(tempSum > 0) {
            tempNode.next = new ListNode(0, null);
            tempNode = tempNode.next;
            tempNode.val = tempSum;
        }

        return result;
    }

    public static class ListNode{
        int val;
        ListNode next;
        ListNode() {};
        ListNode(int val) {
            this.val = val;
        }
        ListNode(int val, ListNode next) {
            this.val = val;
            this.next = next;
        }
    }
}
