/*----------------------------------------------------------------------
	FILE        : ListNode.java
	AUTHOR      : enes-yilmaz
	LAST UPDATE : 22.06.2023

    Definition for singly-linked list

	All Rights Free
-----------------------------------------------------------------------*/
package org.ylmzz.linkedList;

public class ListNode {
    int val;
    ListNode next;
    ListNode() {}
    ListNode(int val) { this.val = val; }
    ListNode(int val, ListNode next) { this.val = val; this.next = next; }

    public static ListNode createLinkedListByArray(int[] arr) {
        ListNode dummy = new ListNode(-1);
        ListNode current = dummy;

        for (int num : arr) {
            current.next = new ListNode(num);
            current = current.next;
        }

        return dummy.next;
    }

    public static void printLinkedList(ListNode head) {
        ListNode current = head;

        while (current != null) {
            System.out.print(current.val + " ");
            current = current.next;
        }
        System.out.println();
    }
}
