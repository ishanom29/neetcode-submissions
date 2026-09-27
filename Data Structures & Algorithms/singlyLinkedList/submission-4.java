class ListNode{
   private int val;
   private ListNode next;
   ListNode(int val){
    this(val,null);
   }
   ListNode(int val,ListNode next){
    this.val = val;
    this.next = next;
   }

}


class LinkedList {
    private ListNode head;
    private ListNode tail;

    public LinkedList() {
        head = new ListNode(-1);
        tail = this.head;


    }

    public int get(int index) {
        ListNode curr = this.head.next;
        int i=0;
        while(curr!=null){
            if(i==index)
                return curr.val;
            curr= curr.next;
            i = i+1;
        }
        return -1;
        
    }

    public void insertHead(int val) {
        ListNode newNode = new ListNode(val);
        newNode.next = this.head.next;
        this.head.next = newNode;
        if(newNode.next==null)
        this.tail = newNode;
        
        
    }

    public void insertTail(int val) {
        this.tail.next = new ListNode(val);
        this.tail = this.tail.next;

    }

    public boolean remove(int index) {
        int i=0;
        ListNode curr = this.head;
        while(curr!=null && i<index){
            curr = curr.next;
            i= i+1;
        }
        if ( curr != null && curr.next!=null){
                
                if(curr.next == this.tail){
                    this.tail = curr;
                }
                curr.next = curr.next.next;
                return true;
        }
    return false;
    }

    public ArrayList<Integer> getValues() {
        ArrayList<Integer> arr= new ArrayList<>();
        ListNode curr = this.head.next;
        while(curr!=null){
            arr.add(curr.val);
            curr = curr.next;
        }   
        return arr;

    }
}
