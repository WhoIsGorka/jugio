package proiektua;
 
import java.util.NoSuchElementException;
 
public class MahaiKartak<Karta> {
 
    private Node first;
    private Node last;
    private int tamaina;
 
    
    public MahaiKartak() {
        tamaina = 0;
        first=null;
        last=null;
    }
  
    private class Node {
        Karta karta;
        Node next;
        Node prev;
 
        public Node(Karta pKarta, Node next, Node prev) {
            this.karta = pKarta;
            this.next = next;
            this.prev = prev;
        }
    }
    public Node getFirst(){
    	return this.first;
    }
    public boolean isEmpty() { 
    	return tamaina == 0;
    }
    public void addFirst(Karta pKarta) {
        Node tmp = new Node(pKarta, first, null);
        if(first != null ) {first.prev = tmp;}
        first = tmp;
        if(last == null) { last = tmp;}
        tamaina++;
    }
    public void addLast(Karta pKarta) {
        
        Node tmp = new Node(pKarta, null, last);
        if(last != null) {last.next = tmp;}
        last = tmp;
        if(first == null) { first = tmp;}
        tamaina++;
    }
    }
