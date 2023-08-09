package InsereUltimo;
/**
 *Implemente um programa em Java que posiciona o último elemento de uma sequência de forma a ordená-la. A sequência de entrada sempre está ordenada de forma crescente (exceto pelo último número).

  Entrada
  Seu programa deve ler uma sequência de inteiros da entrada.

  Saída
  Seu programa deve imprimir a sequência ordenada.
 * 
 */

import java.util.Arrays;
import java.util.Scanner;
class InsereUltimo {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String[] nums = sc.nextLine().split(" ");

        int i = nums.length - 1;

        while(i > 0 && Integer.parseInt(nums[i]) < Integer.parseInt(nums[i - 1])){
            String aux = nums[i - 1];
            nums[i - 1] = nums[i];
            nums[i] = aux;
            i--;
        }
    

        System.out.println(Arrays.toString(nums));
        sc.close();
    }
}

