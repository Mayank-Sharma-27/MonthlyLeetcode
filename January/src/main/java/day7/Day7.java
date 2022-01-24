package day7;

import lombok.Data;

import java.util.*;

public class Day7 {

    Map<ListNode, Integer> map;
    Random R;

    public Day7(ListNode head) {
        map = new HashMap();
        R = new Random();
        while (head != null) {
            map.put(head, head.val);
            head = head.next;
        }
    }

    public int getRandom() {
        List<ListNode> keys = new ArrayList<ListNode>(map.keySet());
        return keys.get(R.nextInt(keys.size())).val;
    }

    @Data
    public class ListNode {
        int val;
        ListNode next;

        ListNode() {
        }

        ListNode(int val) {
            this.val = val;
        }

        ListNode(int val, ListNode next) {
            this.val = val;
            this.next = next;
        }
    }

}
