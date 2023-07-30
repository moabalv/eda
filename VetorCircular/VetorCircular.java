/**
Escreva um programa que imprime um vetor de maneira circular. Seu programa deve receber uma sequência de valores e um inteiro N e deve imprimir as N posições da sequência lida. Naturalmente, N pode ser maior do que o tamanho da sequência lida.
Nesses casos, você deve reiniciar a impressão partindo novamente do início do vetor.

Exemplo
4 5 6 1
6

4 5 6 1 4 5

 */


import java.util.Scanner;

class VetorCircular{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String[] valores = sc.nextLine().split(" ");
        int n = sc.nextInt();

        String saida = "";
        for (int i = 0; i < n; i++){
            saida += valores[i % valores.length] + " ";
        }

        System.out.println(saida.trim());
    }
}