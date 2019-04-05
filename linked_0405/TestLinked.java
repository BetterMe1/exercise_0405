package linked.linked_0405;

public class TestLinked {
}
/**
 * Definition for singly-linked list.
 * class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) {
 *         val = x;
 *         next = null;
 *     }
 * }
 */
/*
141. 环形链表
给定一个链表，判断链表中是否有环。
为了表示给定链表中的环，我们使用整数 pos 来表示链表尾连接到链表中的位置（索引从 0 开始）。 如果 pos 是 -1，则在该链表中没有环。
示例 1：
输入：head = [3,2,0,-4], pos = 1
输出：true
解释：链表中有一个环，其尾部连接到第二个节点。
示例 2：
输入：head = [1,2], pos = 0
输出：true
解释：链表中有一个环，其尾部连接到第一个节点。
示例 3：
输入：head = [1], pos = -1
输出：false
解释：链表中没有环。
进阶：
你能用 O(1)（即，常量）内存解决此问题吗？
 */
/*
public class Solution {
    public boolean hasCycle(ListNode head) {
        ListNode fastNode = head;
        ListNode slowNode = head;
        while(fastNode != null && fastNode.next != null){
            slowNode = slowNode.next;
            fastNode = fastNode.next.next;
            if(slowNode == fastNode){
                return true;
            }
        }
        return false;
    }
}*/

/*
160. 相交链表
编写一个程序，找到两个单链表相交的起始节点。
注意：
如果两个链表没有交点，返回 null.
在返回结果后，两个链表仍须保持原有的结构。
可假定整个链表结构中没有循环。
程序尽量满足 O(n) 时间复杂度，且仅用 O(1) 内存。
 */

/*
public class Solution {
    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
        if(headA == null || headB == null){
            return null;
        }
        int lenA = getLength(headA);
        int lenB = getLength(headB);
        int d = Math.abs(lenA-lenB);
        ListNode cur1;//长
        ListNode cur2;
        if(lenA >= lenB){
            cur1 = headA;
            cur2 = headB;
        }else{
            cur1 = headB;
            cur2 = headA;
        }
        for(int i=0; i<d; i++){
            cur1 = cur1.next;
        }
        while(cur1 != cur2){
            cur1 = cur1.next;
            cur2 = cur2.next;
        }
        return cur1;
    }
    private int getLength(ListNode head){
        ListNode cur = head;
        int count = 0;
        while(cur != null){
            count++;
            cur = cur.next;
        }
        return count;
    }
}*/
