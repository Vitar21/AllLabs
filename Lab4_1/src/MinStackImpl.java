public class MinStackImpl implements MinStack<Integer>{
    private Node head;

    @Override
    public void push(Integer value){
        if (head == null){
            head = new Node(value, value, null);
        }
        else{
            int thisMin = Math.min(value, head.min);
            head = new Node(value, thisMin, head);
        }
    }

    @Override
    public Integer pop(){
        if (head == null){
            return null;
        }
        int delVal = head.value;
        head = head.next;
        return delVal;
    }

    @Override
    public Integer top(){
        if (head == null){
            return null;
        }
        return head.value;
    }

    @Override
    public Integer min(){
        if (head == null){
            return null;
        }

        return head.min;
    }
}
