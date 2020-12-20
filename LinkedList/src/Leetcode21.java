/**
 * @Description
 * @Author Hanbin
 * @Date 2020/12/20
 */
/*将两个升序链表合并为一个新的 升序 链表并返回。新链表是通过拼接给定的两个链表的所有节点组成的。 */

import com.oracle.webservices.internal.api.databinding.DatabindingMode;

/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
class Leetcode21 {
    public ListNode mergeTwoLists(ListNode l1, ListNode l2) {

        ListNode head = new ListNode();
        ListNode now = head;
        while(l1 != null && l2 != null){
            if(l1.val < l2.val){
                now.next = l1;
                //指针移到下一节点
                now = now.next;
                l1=l1.next;
            }else{
                now.next = l2;
                now = now.next;
                l2 = l2.next;
            }
        }
        if (l1 == null) {
            now.next = l2;
        } else {
            now.next = l1;
        }
        return head.next;
    }

     public class ListNode {
      int val;
      ListNode next;
      ListNode() {}
      ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 }
}


