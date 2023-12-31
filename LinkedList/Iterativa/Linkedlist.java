package LinkedList.Iterativa;

public class Linkedlist {
    private Node head;
    private Node tail;
    private int size;

    public Linkedlist(){
        head = null;
        tail = null;
        size = 0;
    }

    public void addLast(int i){
        Node node = new Node(i);
        if (size == 0){
        this.head = node;
        this.tail = node;
        }
        else{
            node.prev = tail;
            this.tail.next = node;
            this.tail = node;
        }
        size++;
        }

    public void addFirst(int i){
        Node node = new Node(i);
        if (size == 0){
        this.head = node;
        this.tail = node;
        }
        else{
        node.next = head;
        head.prev = node;
        head = node;
        }
        size++;
    }

    public void add(int i, int index){
        Node node = new Node(i);
        Node aux = head;
        for (int j = 0; j < index; j++){
            aux = aux.next;
        }
        node.next = aux.next;
        node.prev = aux;
        aux.next.prev = node;
        aux.next = node;
        size++;
    }

    public int remove(int index){
        if (index < 0 || index >= size){
            throw new RuntimeException("Indice invalido.");
        }
        if (index == 0){
            return removeFirst();
        }
        Node aux = head;
        for (int i = 0; i < index - 1; i++){
            aux = aux.next;
        }
        aux.prev.next = aux.next;
        aux.next.prev = aux.prev;
        return aux.object; 
    }
    public int removeFirst(){
        Integer i = null;
        if(!isEmpty()){
            i = this.head.object;
            this.head = head.next;
        }
        return i;
    }
    public boolean isEmpty(){
        return this.head == null;
    }

    public int get(int index){
        if (index < 0 || index >= size){
            throw new RuntimeException("Indice invalido.");
        }
        Node aux = head;
        for (int i = 0; i < index - 1; i++){
            aux = aux.next;
        }
        return aux.object;
    }
    
    public int size(){
        return size + 1;
    }

    @Override
    public String toString(){
        String out = "";
        Node aux = head;
        while (aux != null){
            out += aux.object;
            aux = aux.next;
        }
        return out;
    }
}

class Node{
    Integer object;
    Node next;
    Node prev;

    public Node(Integer i){
        this.object = i;
        this.next = null;
        this.prev = null;
    }
}
