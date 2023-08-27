package InvertePilhaIndex;

import java.util.Scanner;

public class Pilha{

    private int[] pilha;
    private int topo;
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        int tamanho = sc.nextInt();
        sc.nextLine();

        Pilha pilha = new Pilha(tamanho);

        String[] entrada = sc.nextLine().split(" ");

        //Colocando os numeros na fila
        for (int i = 0; i < entrada.length; i++){
            pilha.push(Integer.parseInt(entrada[i]));
        }
        
        int indexInversao = sc.nextInt();
        invertePilha(pilha, indexInversao);

        System.out.println("-");

        for (int i = 0; i < tamanho; i++){
            System.out.println(pilha.pop());
        }

        sc.close();

    }

    public static void invertePilha(Pilha pilha, int index){
        int[] aux = new int[index + 1];

        for (int i = 0; i <= index; i++){
            aux[i] = pilha.pop();
        } 

        for (int i = 0; i <= index; i++){
            pilha.push(aux[i]);
        }
    }
    // Códigos para funcionamento da pilha
    
    public Pilha (int capacity){
        this.pilha = new int[capacity];
        this.topo = -1;
    }

    public boolean isEmpty(){
        return this.topo == -1;
    }

    public boolean isFull(){
        return this.topo == this.pilha.length - 1;
    }

    public int peek(){
        if (isEmpty()){
            throw new RuntimeException("Pilha vazia");
        }

        return pilha[topo];
    }

    public int pop(){
        if (isEmpty()){
            throw new RuntimeException("Pilha vazia");
        }

        return pilha[topo--];
    }

    public void push(int i){
        if (isFull()){
            throw new RuntimeException("Pilha cheia");
        }

        this.pilha[++topo] = i; 
    
}
}
