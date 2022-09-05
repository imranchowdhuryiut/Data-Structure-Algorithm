package leetcode.listnode;

public class DeleteTheMiddleNodeOfALinkedList {

	public ListNode deleteMiddle(ListNode head) {
		ListNode slow = head;
		ListNode fast = head;
		ListNode beforeSlow = head;
		int count = 0;
		
		if (fast.next == null) {
			return null;
		}
		
		while (fast.next != null) {
			fast = fast.next;
			count++;
			if (count % 2 == 0) {
				beforeSlow = slow;
				slow = slow.next;
			}
		}
		
		if (count % 2 == 1) {
			beforeSlow = slow;
			slow = slow.next;
		}
		
		beforeSlow.next = slow.next;
		
		return head;
	}

}
