package OrdenaPilhaInvertendo;
import java.util.Scanner;

class OrdenaPilhaInvertendo{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        int size = sc.nextInt();
        sc.nextLine();

        String[] entrada = sc.nextLine().split(" ");

        Pilha pilha = new Pilha(size);

        for(int i = 0; i < size; i++){
            pilha.push(Integer.parseInt(entrada[i]));
        }

        sc.close();
        System.out.println("-");

        Pilha aux = new Pilha(size);

        int index = size - 1;

        for (int i = 0; i < size; i++){
            aux.push(pilha.getMax(index));
            maiorTopo(pilha, index, size);
            pilha.pop();
            index--;
        }

        for (int i = 0; i < size; i++){
            System.out.println(aux.pop());
        }



    }
    public static void maiorTopo(Pilha pilha, int index, int tam){
        int maior = pilha.getMax(index);
        int i = 0;
        while (pilha.peek() != maior){
            i++;
            pilha.invertePilha(i % tam);
        } 
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
        public int getMax(int index){
            Pilha aux = new Pilha(index + 1);

            int maior = this.pop();
            aux.push(maior);

            for (int i = 1; i <= index; i++){
                int atual = this.pop();
                aux.push(atual);

                if (atual > maior){
                    maior = atual;
                }
            }

            for (int i = 0; i <= index; i++){
                this.push(aux.pop());
            }

            return maior;
        }
    
        public void invertePilha(int index){
            int[] aux = new int[index + 1];

            for (int i = 0; i <= index; i++){
                aux[i] = this.pop();
            }

            for (int i = 0; i <= index; i++){
                this.push(aux[i]);
            }

            
        }
}




