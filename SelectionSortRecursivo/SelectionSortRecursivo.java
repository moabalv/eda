package SelectionSortRecursivo;

import java.util.Arrays;
import java.util.Scanner;

class SelectionSortRecursivo{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String[] entrada = sc.nextLine().split(" ");

        int[] nums = new int[entrada.length];
        for (int i = 0; i < entrada.length; i++){
            nums[i] = Integer.parseInt(entrada[i]);
        }
        selectionSort(nums, 0);
        sc.close();
    }


    public static void selectionSort(int[] v, int ini){
        if (ini < v.length){
        // ini: inicio do array, onde assumimos que está o id do menor elemento
        // (ini + 1): a partir de onde ele vai começar a procurar

            int idMenor = procuraId(v, ini + 1, ini);
            swap(v, ini, idMenor);
            System.out.println(Arrays.toString(v));

            //se o array não estiver ordenado, segue a recursão
            if (!estaOrdenado(v)){
                ini++;
                selectionSort(v, ini);
            }
        }
    }
    public static int procuraId(int[] v, int i, int idMenor){
        if (i < v.length){
            if (v[i] < v[idMenor]){
                idMenor = i;
            }
            i++;
            procuraId(v, i, idMenor);
        }
        return idMenor;
    }

    public static boolean estaOrdenado(int[] v){
        boolean ordenado = true;
        for(int i = 0; i < v.length - 1; i++){
            if (v[i] > v[i + 1]){
                ordenado = false;
                break;
            }
        }
        return ordenado;
    }

    public static void swap(int[] v, int i, int j){
        int aux = v[j];
        v[j] = v[i];
        v[i] = aux;
    }
}