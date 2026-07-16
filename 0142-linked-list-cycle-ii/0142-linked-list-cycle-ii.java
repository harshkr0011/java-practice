/**
 * Definition for singly-linked list.
 * class ListNode {
 * int val;
 * ListNode next;
 * ListNode(int x) {
 * val = x;
 * next = null;
 * }
 * }
 */
public class Solution {
    // Using Floyd's Cycle Detection Algorithm
    public ListNode detectCycle(ListNode head) {
        if(head == null || head.next == null) return null;
        
        ListNode slow = head;
        ListNode fast = head;
        
        // Phase 1: Detect if a cycle exists
        while(fast != null && fast.next != null){
            slow = slow.next;
            fast = fast.next.next;
            
            if(fast == slow){       // if cycle is detected
                fast = head;        // Reset one to start and begin this to search for other index
                
                // Mathematically, the distance between the meeting point and the Start of Loop is equal to the distance between head and Start of Loop
                // Phase 2: Find the entry point of the cycle
                while(fast != slow){
                    fast = fast.next;
                    slow = slow.next;
                }
                return fast;    // Both pointers meet at the start of the cycle
            }
        }
        return null;    // No cycle found
    }
}