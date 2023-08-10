package MarianaEOsLivros;

import java.util.Scanner;

class Livros {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String[] livros = sc.nextLine().split(",");
        System.out.println(formataArray(livros));
        insertionSort(livros);
        sc.close();
    }

    public static void insertionSort(String[] v){
        for(int i = 1; i < v.length; i++){
            insercaoOrdenada(v, i);
            System.out.println(formataArray(v));
        }

    }

    public static void insercaoOrdenada(String[] v, int index){
        while (index > 0 && v[index].compareTo(v[index - 1]) < 0){
            swap(v, index, index -1);
            index--;           
        }
    }

    public static void swap(String[] v, int i, int j){
        String aux = v[i];
        v[i] = v[j];
        v[j] = aux;
    }

    public static String formataArray(String[] v){
        String r = "";
        for (int i = 0; i < v.length - 1; i++){
            r += v[i] + ", ";
        }
        r += v[v.length - 1];
        return r;
    }
}
