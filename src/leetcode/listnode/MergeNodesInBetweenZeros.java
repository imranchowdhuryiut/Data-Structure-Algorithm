package leetcode.listnode;

public class MergeNodesInBetweenZeros {

	public ListNode mergeNodes(ListNode head) {
		ListNode newHead = null;
		ListNode temp = null;
		head = head.next;
		int sum = 0;
		while (head != null) {
			if (head.val == 0) {
				if (newHead == null) {
					newHead = new ListNode(sum);
					temp = newHead;					
				} else {
					temp.next = new ListNode(sum);
					temp = temp.next;
				}
				sum = 0;
			} else {
				sum = sum + head.val;
			}
			head = head.next;
		}
		return newHead;
	}

}
