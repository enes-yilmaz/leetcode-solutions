/*----------------------------------------------------------------------
	FILE        : MergeTwoSortedListsTest.java
	AUTHOR      : enes-yilmaz
	LAST UPDATE : 22.06.2023

	https://leetcode.com/problems/merge-two-sorted-lists/

	All Rights Free
-----------------------------------------------------------------------*/
package org.ylmzz.linkedList;

public class MergeTwoSortedListsTest {
    public static void run()
    {
        ListNode list1 = ListNode.createLinkedListByArray(new int[]{1, 2, 4});
        ListNode list2 = ListNode.createLinkedListByArray(new int[]{1, 3, 4});

        System.out.println("Inputs: ");
        System.out.print("list1: ");
        ListNode.printLinkedList(list1);
        System.out.print("list2: ");
        ListNode.printLinkedList(list2);

        ListNode mergeTwoLists = mergeTwoLists(list1, list2);

        System.out.println("Output: ");
        ListNode.printLinkedList(mergeTwoLists);
    }

    public static ListNode mergeTwoLists(ListNode list1, ListNode list2)
    {
        final ListNode dummy = new ListNode();
        ListNode tail = dummy;

        while (list1 != null && list2 != null) {
            if (list1.val < list2.val) {
                tail.next = list1;
                list1 = list1.next;
            } else {
                tail.next = list2;
                list2 = list2.next;
            }
            tail = tail.next;
        }
        tail.next = list1 != null ? list1 : list2;

        return dummy.next;
    }
}
