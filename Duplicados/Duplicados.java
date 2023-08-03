/**
Escreva um programa que recebe uma sequência e verifica se esta possui ou não elementos duplicados.

Restrições: não é permitido a utilização de nenhum método do Collections ou outra estrutura de dados diferente de array.

Entrada
Seu programa recebe uma sequência qualquer, com os elementos separados por espaço.

Saída
Seu programa deve imprimir true se a sequência possuir elementos duplicados e false caso contrário.
 */

import java.util.Scanner;

class Duplicados{
public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    String[] elementos = sc.nextLine().split(" ");
    int[] nums = new int[elementos.length];

    for (int i = 0; i < elementos.length; i++){
        nums[i] = Integer.parseInt(elementos[i]);
    }

    System.out.println(checaRepetido(nums));

}

private static boolean checaRepetido(int[] nums){
    for (int i = 0; i < nums.length; i++){
        for (int j = 0; j < nums.length; j++){
            if (i != j && nums[i] == nums[j]){
                return true;
            }
        }
    }
    return false;
}

}