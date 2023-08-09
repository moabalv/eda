package Selection;

import java.util.Arrays;
import java.util.Scanner;

class selectionSort{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String[] entrada = sc.nextLine().split(" ");

        int[] nums = new int[entrada.length];
        for(int i = 0; i < entrada.length; i++){
            nums[i] = Integer.parseInt(entrada[i]);
        }

        selectionSortp(nums);
        sc.close();

    }

    public static void selectionSortp(int[] v){

        for (int i = 0; i < v.length; i++){
        if (estaOrdenado(v)){
         break;
        }
            int idMenor = i;
            for (int j = i + 1; j < v.length; j++){
                if (v[j] < v[idMenor]){
                    idMenor = j;
                }
            }
            if(idMenor != i){
            swap(v, idMenor, i);
            System.out.println(Arrays.toString(v));
        }
        
    }
    }

    public static void swap(int[] v, int idMenor, int i){
        int aux = v[i];
        v[i] = v[idMenor];
        v[idMenor] = aux;
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
}