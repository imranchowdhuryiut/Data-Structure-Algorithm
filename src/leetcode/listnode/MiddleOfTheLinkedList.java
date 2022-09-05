package leetcode.listnode;

public class MiddleOfTheLinkedList {

	public ListNode middleNode(ListNode head) {
		ListNode slow = head;
		ListNode fast = head;
		int count = 0;
		while (fast.next != null) {
			fast = fast.next;
			count++;
			if (count % 2 == 0) {
				slow = slow.next;
			}
		}
		
		if (count % 2 == 1) {
			slow = slow.next;
		}
		
		return slow;
	}

}
