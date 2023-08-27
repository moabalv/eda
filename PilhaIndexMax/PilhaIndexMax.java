package PilhaIndexMax;

import java.util.Scanner;

class PilhaIndexMax{

    public static void main(String[] args){
        
        Scanner sc = new Scanner(System.in);

        String[] entrada = sc.nextLine().split(" ");

        Pilha pilha = new Pilha(entrada.length);

        for(int i = 0; i < entrada.length; i++){
            pilha.push(Integer.parseInt(entrada[i]));
        }

        int indexMax = sc.nextInt();
        int maior = pilha.pop();

        for (int i = 1; i <= indexMax; i++){
            int atual = pilha.pop();
            if (atual > maior){
                maior = atual;
            }
        }

        System.out.println(maior);
        sc.close();
    }
}

class Pilha{
        private int[] pilha;
        private int topo;
    
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



