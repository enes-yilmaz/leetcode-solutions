/*----------------------------------------------------------------------
	FILE        : ReverseLinkedListTest.java
	AUTHOR      : enes-yilmaz
	LAST UPDATE : 22.06.2023

	https://leetcode.com/problems/reverse-linked-list/

	All Rights Free
-----------------------------------------------------------------------*/
package org.ylmzz.linkedList;

public class ReverseLinkedListTest {
    public static void run()
    {
        ListNode head = ListNode.createLinkedListByArray(new int[]{1, 2, 3, 4, 5});

        System.out.println("Input: ");
        ListNode.printLinkedList(head);

        ListNode reversedHead = reverseList(head);

        System.out.println("Output: ");
        ListNode.printLinkedList(reversedHead);
    }

    public static ListNode reverseList(ListNode head)
    {
        ListNode current = head;
        ListNode previous = null;
        ListNode nextCurrent = null;

        while (current != null) {
            nextCurrent = current.next;
            current.next = previous;
            previous = current;
            current = nextCurrent;
        }

        return previous;
    }
}
