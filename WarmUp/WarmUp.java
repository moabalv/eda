/**
 * Seu programa deve ler duas linhas. Na primeira linha, deve ler um inteiro N. Na segunda, uma sequência de inteiros separados por espaço.
 * 
 * Seu programa deve imprimir na saída a sequência de inteiros resultante da multiplicação entre N e cada elemento da sequência original.
 */
import java.util.Scanner;

class WarmUp{
    public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    int N = sc.nextInt();
    sc.nextLine();
    String[] numeros = sc.nextLine().split(" ");

    String produtos = "";
    for (int i = 0; i < numeros.length; i++){
        int produto = Integer.parseInt(numeros[i]) * N;
        produtos += Integer.toString(produto) + " ";
    }

    System.out.println(produtos.trim());
    sc.close();
}
}