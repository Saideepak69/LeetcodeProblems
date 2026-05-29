class ListNode {
    int value;
    ListNode next;

    public ListNode(int value) {
        this.value = value;
        this.next = null;
    }
}

class MyLinkedList {

    ListNode head;

    public MyLinkedList() {
        head = new ListNode(0); // dummy node
    }

    public int get(int index) {
        ListNode curr = head.next;

        while (curr != null && index > 0) {
            curr = curr.next;
            index--;
        }

        return (curr == null) ? -1 : curr.value;
    }

    public void addAtHead(int val) {
        ListNode node = new ListNode(val);

        node.next = head.next;
        head.next = node;
    }

    public void addAtTail(int val) {
        ListNode curr = head;

        while (curr.next != null) {
            curr = curr.next;
        }

        curr.next = new ListNode(val);
    }

    public void addAtIndex(int index, int val) {
        ListNode curr = head;

        while (curr != null && index > 0) {
            curr = curr.next;
            index--;
        }

        if (curr == null) return;

        ListNode node = new ListNode(val);
        node.next = curr.next;
        curr.next = node;
    }

    public void deleteAtIndex(int index) {
        ListNode curr = head;

        while (curr.next != null && index > 0) {
            curr = curr.next;
            index--;
        }

        if (curr.next == null) return;

        curr.next = curr.next.next;
    }
}