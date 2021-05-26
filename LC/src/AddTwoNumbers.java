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
	        
	        // while both input nodes are not null, process nodes
	        while(l1 != null && l2 != null) {

	        	// Add the digits for the current column
	            digitSum = l1.val + l2.val + carryDigit;
	               
	            // Capture the carry digit
	            carryDigit = digitSum / 10;
	            
	            // Remove the carry digit from the column sum
	            digitSum = digitSum % 10;
	            
	            // Set the nodes value to the updated sum
	            l1.val = digitSum;
	            
	            // move the prev, l1, and l2 pointers
	            prev = l1;
	            l1 = l1.next;
	            l2 = l2.next;

	        }
	        
	        // In the case l1 runs out, attach remaining l2 nodes onto l1
	        if (l1 == null && l2 != null) {
	            l1 = l2;
	            prev.next = l1; // link the previous l1 nodes to the new (l2) node
	        }
	        
	        // perform any remaining carrying
	        while (l1 != null) {
	            
	        	// Add the carry digit to the remaining column digits
	            int digit1 = l1.val;
	            digitSum = digit1 + carryDigit; 
	            
	            // get new carry digit for remaining columns
	            carryDigit = digitSum / 10;
	            
	            // remove the carry digit from the columns sum
	            digitSum = digitSum % 10;
	            
	            // move the l1 and prev pointers to next nodes
	            l1.val = digitSum;
	            prev = l1;
	            l1 = l1.next;            
	        }
	        
	        // Finally, if carry digit exists for final column, add new node to the end of existing
	        if (carryDigit > 0) {
	            l1 = new ListNode(carryDigit);
	            prev.next = l1;
	        }
	        
	        // Program complete, return the first node containing the sum
	        return head;
	    }
	}
	
	// inner class for the ListNode
	private class ListNode {
	      int val;
	      ListNode next;
	      ListNode() {}
	      ListNode(int val) { this.val = val; }
	      ListNode(int val, ListNode next) { this.val = val; this.next = next; }
	  }
	
	
	
}


