import java.util.NoSuchElementException;

public class Linkedlist<T> {
    private Node head;
    private Node tail;
    private int size=0;

    public Linkedlist() {
        this.head=null;
        this.tail=null;
    }
    public class Node{
        private Node next;
        private Node prev;
        private T data;
        public Node() {
            this.next = null;
            this.prev = null;
        }
    }
    public int size(){
        return size;
    }
    public void add(T a){
        Node newNode =new Node();
        if(head == null){
            head=newNode;
        }else {
            tail.next=newNode;
            newNode.prev=tail;
        }
        tail=newNode;
        newNode.data=a;
        size++;
    }
    public void add(int a,T t){
        if(a>size)
            throw new IndexOutOfBoundsException();
        Node newNode=new Node();
        if (a==size){
            add(t);
        }else {
            Node next =findNode(a);
            Node prev =next.prev;
            prev.next=newNode;
            newNode.next=next;
            newNode.prev=prev;
            next.prev=newNode;
            newNode.data=t;
            size++;
        }
    }
    public void addLast( T t){
        add(t);
    }
    public void addFirst(T t){
        Node a =new Node();
        if (head==null){
            head=a;
            tail=head;
        }else {
            a.next=head;
            head.prev=a;
            head=a;
        }
        a.data=t;
        size++;
    }
    public void offer(T t){
        add(t);
    }
    public void offerFirst(T t){
        addFirst(t);
    }
    public void offerLast(T t){
        add(t);
    }
    public T peek(){
        Node n = head;
        return n == null ? null : n.data;
    }
    public T peekFirst(){
        return peek();
    }
    public T peekLast(){
        Node n = tail;
        return n == null ? null : n.data;
    }
    public T get(int a){
        return findNode(a).data;
    }
    private Node findNode(int a){
        Node n;
        if (a>size-1||a<0)
            throw new NoSuchElementException();
        if (size/2>=a) {
            n=head;
            for (int i = 0; i < a; i++) {
                n=n.next;
            }
            return n;
        } else {
            n = tail;
            for (int i = size - 2; i > a - 1; i--) {
                n = n.prev;
            }
            return n;
        }
    }
    public T getFirst(){
        return head.data;
    }
    public T getLast(){
        return tail.data;
    }
    public int indexOf(T t){
        Node n=head;
        for (int i = 0; i < size; i++) {
            if (n.data==t){
                return i;
            }else {
                n=n.next;
            }
        }
        return -1;
    }
    public int lastIndexOf(T t){
        Node n= tail;
        for (int i = size; i >0 ; i--) {
            if (n.data==t){
                return i;
            }else {
                n=n.prev;
            }
        }
        return -1;
    }
    public boolean contains(T t){
        return findNode(t)!=null;
    }
    private Node findNode(T t){
        Node n=head;
        for (int i = 0; i < size; i++) {
            if (n.data==t){
                return n;
            }else {
                n=n.next;
            }
        }
        return null;
    }
    public void clear(){
        head=null;
        tail=null;
        size=0;
    }
    public T remove(){
        if (head==null)
            throw new NoSuchElementException();
        T t=head.data;
        Node n=head.next;
        if (n!=null) n.prev=null;
        if (size==1) tail=null;
        head=n;
        size--;
        return t;
    }

    public T removeFirst() {
        return remove();
    }
    public T removeLast(){
        if (tail==null)
            throw new NoSuchElementException();
        T t=tail.data;
        Node n=tail.prev;
        n.next=null;
        tail=n;
        size--;
        return t;
    }
    public T remove(int i){
        Node n= findNode(i);
        if (n==head){
            return remove();
        }else if(n==tail){
            return removeLast();
        }
        Node next=n.next;
        Node prev=n.prev;
        next.prev=prev;
        prev.next=next;
        size--;
        return n.data;
    }
    public void remove(T t){
        remove(indexOf(t));
    }
    public T poll(){
        return remove();
    }
    public T pollFirst(){
        return remove();
    }
    public T pollLast(){
        return removeLast();
    }
    public T pop(){
        return remove();
    }
    public boolean isEmpty(){
        return head==null;
    }
    public void push(T t){
        addFirst(t);
    }
    public Object[] toArray(){
        Object[] arr=new Object[size];
        Node n=head;
        for (int i = 0; i < size; i++) {
            arr[i]=n.data;
            n=n.next;
        }
        return arr;
    }
    public void removeFirstOccurrence(T t){
        remove(t);
    }
    public void removeLastOccurrence(T t){
        Node n=tail;
        for (int i = size-1; i >-1; i++) {
            if (n.data==t){
                remove(i);
                return;
            }else {
                n=n.prev;
            }
        }
        throw new NoSuchElementException();
    }
    public Linkedlist reversed(){
        for (Node n=head;n!=null;n=n.prev){
            Node a=n.prev;
            n.prev=n.next;
            n.next=a;
        }
        Node a=head;
        head=tail;
        tail=a;
        return this;
    }

    @Override
    public String toString() {
        StringBuilder a=new StringBuilder();
        for (Node n=head;n!=null;n=n.next){
            a.append(n.data).append(", ");
        }
        if (!a.isEmpty()) a.delete(a.length()-2,a.length());
        a.append("]");
        return "[" + a;
    }
    public T set(int i,T t){
        Node n=findNode(i);
        T d=n.data;
        n.data=t;
        return d;
    }
    public Linkedlist subList(int f,int l){
        if (f>=l||l>size-1||f<0||head==null||head.next==null)
            throw new IndexOutOfBoundsException();
        Linkedlist<T> a=this;
        a.head=findNode(f);
        a.head.prev=null;
        a.tail=findNode(l).prev;
        a.tail.next=null;
        return a;
    }
}