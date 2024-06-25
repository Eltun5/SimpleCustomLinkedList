import java.util.Arrays;
import java.util.LinkedList;

public class Main {
    public static void main(String[] args) {
        System.out.println("                    Custom List\n");

        Linkedlist<Integer> a=new Linkedlist<>();

        a.add(12);
        a.add(1,13);
        a.addFirst(11);
        a.addLast(14);

        System.out.println("1.add(12),2.add(1,13),3.addFirst(11),4.addLast(14):"+a);

        System.out.println("size :"+a.size());

        a.offer(15);
        a.offerLast(16);
        a.offerFirst(10);

        System.out.println("1.offer(15),2.offerFirst(10),offerLast(16):"+a);

        System.out.println("peek :"+a.peek());

        System.out.println("peekFirst :"+a.peekFirst());

        System.out.println("peekLast :"+a.peekLast());

        System.out.println("Now list :"+a);

        System.out.println("get(2) :"+a.get(2));

        System.out.println("getFirst :"+a.getFirst());

        System.out.println("getLast :"+a.getLast());

        System.out.println("indexOf(13) :"+a.indexOf(13));

        System.out.println("lastIndexOf :"+a.lastIndexOf(17));

        System.out.println("contains(11) :"+a.contains(11));

        System.out.println("remove "+a.remove()+":"+a);
        System.out.println("removeFirst "+a.removeFirst() +":"+a);
        System.out.println("removeLast "+a.removeLast()+":"+a);

        System.out.println("remove(3) "+a.remove(3)+":"+a);

        a.remove((Integer) 13);

        System.out.println("remove(13) :"+a);

        a.add(15);
        a.addFirst(12);
        a.addFirst(11);
        a.add(2,13);
        a.add(16);
        a.add(17);
        a.add(18);
        a.add(19);
        a.add(20);

        System.out.println("I add number for complete list (11-20) :"+a);

        System.out.println("poll "+ a.poll()+":"+a);

        System.out.println("pollFirst "+ a.pollFirst()+":"+a);

        System.out.println("pollLast "+ a.pollLast()+":"+a);

        System.out.println("pop "+ a.pop()+":"+a);

        a.remove();
        a.removeLast();

        System.out.println("remove and removeLast :"+a);

        System.out.println("isEmpty :"+a.isEmpty());

        a.push(13);

        System.out.println("push(13) :"+a);

        System.out.println("toArray(with Arrays.toString) :" + Arrays.toString(a.toArray()));

        a.add(16);
        a.add(17);

        System.out.println("I add 16 and 17 :"+a);

        a.removeFirstOccurrence(16);

        System.out.println("removeFirstOccurrence(16) :"+a);

        a.removeLastOccurrence(17);

        System.out.println("removeLastOccurrence(17) :"+a);

        System.out.println("reversed :"+a.reversed());

        System.out.println("set(0,19) old value :"+a.set(0,19)+" new list :"+a);

        System.out.println("sublist(0,3) :"+a.subList(0,3));

        a.clear();

        System.out.println("clear :"+a);

        System.out.println("                     Real List");

        LinkedList<Integer> b=new LinkedList<>();

        b.add(12);
        b.add(1,13);
        b.addFirst(11);
        b.addLast(14);

        System.out.println("1.add(12),2.add(1,13),3.addFirst(11),4.addLast(14):"+b);

        System.out.println("size :"+b.size());

        b.offer(15);
        b.offerLast(16);
        b.offerFirst(10);

        System.out.println("1.offer(15),2.offerFirst(10),offerLast(16):"+b);

        System.out.println("peek :"+b.peek());

        System.out.println("peekFirst :"+b.peekFirst());

        System.out.println("peekLast :"+b.peekLast());

        System.out.println("Now list :"+b);

        System.out.println("get(2) :"+b.get(2));

        System.out.println("getFirst :"+b.getFirst());

        System.out.println("getLast :"+b.getLast());

        System.out.println("indexOf(13) :"+b.indexOf(13));

        System.out.println("lastIndexOf :"+b.lastIndexOf(17));

        System.out.println("contains(11) :"+b.contains(11));

        System.out.println("remove "+b.remove()+":"+b);
        System.out.println("removeFirst "+b.removeFirst() +":"+b);
        System.out.println("removeLast "+b.removeLast()+":"+b);

        System.out.println("remove(3) "+b.remove(3)+":"+b);

        b.remove((Integer) 13);

        System.out.println("remove(13) :"+b);

        b.add(15);
        b.addFirst(12);
        b.addFirst(11);
        b.add(2,13);
        b.add(16);
        b.add(17);
        b.add(18);
        b.add(19);
        b.add(20);

        System.out.println("I add number for complete list (11-20) :"+b);

        System.out.println("poll "+ b.poll()+":"+b);

        System.out.println("pollFirst "+ b.pollFirst()+":"+b);

        System.out.println("pollLast "+ b.pollLast()+":"+b);

        System.out.println("pop "+ b.pop()+":"+b);

        b.remove();
        b.removeLast();

        System.out.println("remove and removeLast :"+b);

        System.out.println("isEmpty :"+b.isEmpty());

        b.push(13);

        System.out.println("push(13) :"+b);

        System.out.println("toArray(with Arrays.toString) :" + Arrays.toString(b.toArray()));

        b.add(16);
        b.add(17);

        System.out.println("I add 16 and 17 :"+b);

        b.removeFirstOccurrence(16);

        System.out.println("removeFirstOccurrence(16) :"+b);

        b.removeLastOccurrence(17);

        System.out.println("removeLastOccurrence(17) :"+b);

        System.out.println("reversed :"+b.reversed());

        System.out.println("set(0,19) old value :"+b.set(0,19)+" new list :"+b);

        System.out.println("sublist(0,3) :"+b.subList(0,3));

        b.clear();

        System.out.println("clear :"+b);
    }
}