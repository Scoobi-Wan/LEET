import java.util.ArrayList;

public class AddTwoNumbers {

	class Solution {
	    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
	        
	        // Used to return head of list at the end of the function
	        ListNode head = l1;
	        
	        // curr, prev pointers used to point to ListNodes;
	        ListNode curr = head;
	        ListNode prev = null;
	        
	        // carryDigit is what needs to be carried (if anything) to the next column
	        int carryDigit = 0;
	        
	        // digitSum is used to calculate the sum digit of the current column, 
	        int digitSum = 0;
	        
	        while(l1 != null && l2 != null) {

	            digitSum = l1.val + l2.val + carryDigit;
	                
	            carryDigit = digitSum / 10;
	            digitSum = digitSum % 10;
	            
	            l1.val = digitSum;
	            prev = l1;
	            l1 = l1.next;
	            l2 = l2.next;

	        }
	        
	        if (l1 == null && l2 != null) {
	            l1 = l2;
	            prev.next = l1;
	        }
	        
	        
	        while (l1 != null) {
	            
	            int digit1 = l1.val;
	            digitSum = digit1 + carryDigit;       
	            carryDigit = digitSum / 10;
	            digitSum = digitSum % 10;
	            l1.val = digitSum;
	            prev = l1;
	            l1 = l1.next;            
	        }
	        
	        if (carryDigit > 0) {
	            l1 = new ListNode(carryDigit);
	            prev.next = l1;
	        }
	        
	        return head;
	    }
	}
	
	private class ListNode {
	      int val;
	      ListNode next;
	      ListNode() {}
	      ListNode(int val) { this.val = val; }
	      ListNode(int val, ListNode next) { this.val = val; this.next = next; }
	  }
	
	
	
}


