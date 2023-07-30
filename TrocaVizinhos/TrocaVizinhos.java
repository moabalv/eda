/**Escreva um programa que leia uma sequência de números inteiros e troca os elementos vizinhos. 
 * Se o tamanho da sequência for impar, troque os vizinhos e mantenha o último elemento em sua posição.
 * 
 * Seu programa irá ler uma sequência e armazená-la em um array de inteiros.
 * 
 * Na saída, seu programa deve imprimir o array resultante da troca dos elementos vizinhos. Dica: use Arrays.toString() para formatar a saída.
 * 
 * Exemplo
 * 1 13 3 4 5
   [13, 1, 4, 3, 5]
 */

import java.util.Arrays;
import java.util.Scanner;

class TrocaVizinhos{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String[] numeros = sc.nextLine().split(" ");

        for (int i = 0; i < numeros.length; i = i + 2){
            //checando se a posição a ser acessada não é a última
            if (i != numeros.length - 1){
                String atual = numeros[i];
                numeros[i] = numeros[i+1];
                numeros[i+1] = atual;

            }
        }
        System.out.println(Arrays.toString(numeros));
        sc.close();
    }
}