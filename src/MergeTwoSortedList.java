public class MergeTwoSortedList {

    public static void main(String[] args)
    {
        ListNode list1 =  new ListNode(1, new ListNode(2, new ListNode(4, null)));
        ListNode list2 =  new ListNode(1, new ListNode(3, new ListNode(4, null)));

        System.out.println( function(list1,list2));
    }


    public static ListNode function(ListNode list1, ListNode list2) {

        ListNode temp = new ListNode();
        ListNode newList = temp;
        while(list1 !=null && list2 !=null)
        {
           if(list1.val > list2.val)
           {
               newList.next = list2;
               list2 = list2.next;
           }
           else
           {
               newList.next = list1;
               list1 = list1.next;
           }
           newList = newList.next;
        }
        newList.next =  list1 ==null?list2:list1;
        return temp.next;
    }
}
 class ListNode {
     int val;
     ListNode next;
     ListNode() {}
     ListNode(int val) { this.val = val; }
     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 }