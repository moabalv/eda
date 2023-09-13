package TrimLinkedList;

import java.util.Scanner;

class TrimLinkedList {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        Linkedlist lista = new Linkedlist();
        String[] in = sc.nextLine().split(" ");
        for (int i = 0; i < in.length; i++){
            lista.addLast(Integer.parseInt(in[i]));
            
        }
        int trimNum = sc.nextInt();

        for (int i = 0; i < trimNum; i++){
            lista.remove(0);
            lista.remove(lista.size() - 1);
        }
        System.out.println(lista.toString());

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

class Linkedlist {
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
        if (index == this.size - 1){
            aux.prev.next = null;
            tail = aux.prev;
        }
        else{
        aux.prev.next = aux.next;
        aux.next.prev = aux.prev;
        }
        this.size--;
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
        return size;
    }

    @Override
    public String toString(){
        String out = "";
        Node aux = head;
        while (aux != null){
            out += aux.object + " ";
            aux = aux.next;
        }
        return out.trim();
    }
}
