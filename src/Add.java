class Add {
    public static void main(String args[])
    {
        Add obj = new Add();
        ListNode e = new ListNode(2, null);     // last node
        ListNode d = new ListNode(4, e);
        ListNode c = new ListNode(3, d);
        ListNode b = new ListNode(5, null);
        ListNode a = new ListNode(6, b);
        ListNode f = new ListNode(4, a);

        ListNode l1 = a;
        ListNode l2 = f;

        obj.addTwoNumbers(l1,l2);

    }

    public static class ListNode {
        int val;
        ListNode next;
        ListNode() {}
        ListNode(int val) { this.val = val; }
        ListNode(int val, ListNode next) { this.val = val; this.next = next; }
    }

        public  ListNode addTwoNumbers(ListNode l1, ListNode l2) {
            int carry = 0;
            int total = 0;
            ListNode output = new ListNode();
            while(l2.next!=null) {


                total = l1.val + l2.val +  carry;

                carry = total > 10 ? 1 : 0;
                 if(total>10)
                  {
                      carry = 1;
                      output = new ListNode(total % 10, output.next);
                  }
                 else
                 {
                     output = new ListNode(total, output.next);
                 }
                 //output = output.next;
                 l1 = l1.next;
                 l2 = l2.next;

            }
            return output;
        }
    }
