package InserePrimeiro;

import java.util.Arrays;
/**
 * Implemente um programa em Java que posiciona o primeiro elemento de uma sequência de forma a ordená-la. A sequência de entrada sempre está ordenada de forma crescente (exceto pelo primeiro número).

 Entrada
 Seu programa deve ler uma sequência de inteiros da entrada.

 Saída
 Seu programa deve imprimir a sequência ordenada.
 */
import java.util.Scanner;
public class InserePrimeiro {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String[] nums = sc.nextLine().split(" ");

        int ind = 0;
        int max = nums.length - 1;
        while(ind < max && Integer.parseInt(nums[ind]) > Integer.parseInt(nums[ind + 1])){
            swap(nums, ind, ind + 1);
            ind++;
        }
        sc.close();

        System.out.println(Arrays.toString(nums));
    }

    public static void swap(String[] v, int i, int j){
        String aux = v[j];
        v[j] = v[i];
        v[i] = aux;
    }
}
