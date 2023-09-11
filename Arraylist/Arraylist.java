package Arraylist;

class Arraylist{
    private int[] list;
    int head;
    int tamanho_padrao = 20;

    public Arraylist(int tamanho){
        list = new int[tamanho];
    }

    public Arraylist(){
        list = new int[tamanho_padrao];
    }

    public boolean add(int n){
        if (isFull()){
            resize();
        }

        this.list[head++] = n;
        return true;
    }

    public boolean add(int n, int index){
        shiftDireita(index);
        this.list[index] = n;
        return true;
    }

    public int get(int index){
        if (index < 0 || index > this.list.length){
            throw new RuntimeException("Index invalido");
        }
        return this.list[index];
    }

    public boolean contains(int n){
        for(int i = 0; i < head; i++){
            if (this.list[i] == n){
                return true;
            }
        }
        return false;
    }

    public int indexOf(int n){
        for (int i = 0; i < head; i++){
            if (this.list[i] == n){
                return i;
            }
        }
        return -1;
    }

    public int remove(int index){
        if (index < 0 || index > this.list.length){
            throw new RuntimeException("Indice invalido.");
        }
        int n = this.list[index];
        shiftEsquerda(index);
        this.head--;
        return n;
    }

    public int size(){
        return this.head;
    }

    public int capacity(){
        return this.list.length;
    }

    private boolean isFull(){
        return head == list.length - 1;
    }

    private void resize(){
        int[] nova_lista = new int[this.list.length * 2];
        for (int i = 0; i < this.list.length; i++){
            nova_lista[i] = this.list[i];
        }
        list = nova_lista;
    }

    private void shiftDireita(int index){
        if (isFull()){
            resize();
        }
        for (int i = head; i >= index; i--){
            this.list[i+1] = this.list[i];
        }
    }

    private void shiftEsquerda(int index){
        for (int i = index; i < this.list.length - 1; i++){
            this.list[i] = this.list[i+1];
        }
    }
}