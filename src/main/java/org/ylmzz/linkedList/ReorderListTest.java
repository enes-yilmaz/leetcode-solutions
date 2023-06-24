package org.ylmzz.linkedList;

public class ReorderListTest {
    public static void run()
    {
        ListNode head = ListNode.createLinkedListByArray(new int[]{1, 2, 3, 4});

        System.out.println("Input: ");
        ListNode.printLinkedList(head);

        reorderList(head);

        System.out.println("Output: ");
        ListNode.printLinkedList(head);
    }

    public static void reorderList(ListNode head)
    {
        // find middle
        var slow = head;
        var fast = head.next;
        while (fast != null && fast.next != null){
            slow = slow.next;
            fast = fast.next.next;
        }

        // reverse second half
        var second = slow.next;
        var prev = slow.next = null;
        while(second != null){
            var temp = second.next;
            second.next = prev;
            prev = second;
            second = temp;
        }

        // merge to halfs
        var first = head;
        second= prev;
        while (second != null){
            var temp1 = first.next;
            var temp2 = second.next;
            first.next = second;
            second.next = temp1;
            first= temp1;
            second = temp2;
        }
    }
}
