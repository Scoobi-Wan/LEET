import java.util.ArrayList;

public class AddTwoNumbers {
	public ListNode addTwoNumbers(ListNode l1, ListNode l2) {

		ListNode head = new ListNode();
		ListNode curr = head;

		ArrayList<Integer> sum = new ArrayList<Integer>();

		int carryDigit = 0;

		while (l1 != null || l2 != null) {

			if (l1 == null) {
				while (l2 != null) {
					sum.add(l2.val);
					l2 = l2.next;
				}
			} else if (l2 == null) {
				while (l1 != null) {
					sum.add(l1.val);
					l1 = l1.next;
				}
			} else {

				int digit1 = l1.val;
				int digit2 = l2.val;
				int digitSum = digit1 + digit2 + carryDigit;
				if (digitSum >= 10) {
					carryDigit = 1;
					digitSum -= 10;
				} else {
					carryDigit = 0;
				}
				sum.add(digitSum);
				l1 = l1.next;
				l2 = l2.next;

			}

		}
		if (sum.get(sum.size() - 1) == 0) {
			sum.remove(sum.size() - 1);
		}
		
		
		for (int i = 0; i < sum.size(); i++) {
			curr.val = sum.get(i);
			curr.next = new ListNode();
			curr = curr.next;
		}

		return head;
	}
	
	private class ListNode {
	      int val;
	      ListNode next;
	      ListNode() {}
	      ListNode(int val) { this.val = val; }
	      ListNode(int val, ListNode next) { this.val = val; this.next = next; }
	  }
	
	
	
}


