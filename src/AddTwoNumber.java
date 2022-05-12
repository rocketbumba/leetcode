import java.util.HashSet;
import java.util.Set;

public class AddTwoNumber {

    public class ListNode {
        int val;
        ListNode next;
        ListNode() {}
        ListNode(int val) { this.val = val; }
        ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 }

    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode toReturn = new ListNode();
        ListNode temp = toReturn;
        int soNho = 0;
        while(l1 != null || l2 != null) {
            int sum = 0;
            if(l1 !=null) {
                sum = sum + l1.val;
                l1 = l1.next;
            }

            if(l2 != null) {
                sum = sum +l2.val;
                l2 = l2.next;
            }

            sum = sum + soNho;
            soNho = 0;

            if(sum > 9) {
                soNho = sum / 10;
                sum = sum % 10;
            }

            ListNode node = new ListNode(sum);
            temp.next = node;
            temp = node;
        }

        if(soNho != 0) {
            ListNode temp1 = new ListNode(soNho);
            temp.next = temp1;
        }

        return toReturn.next;
    }

    public static void main(String[] args) {

    }
}
