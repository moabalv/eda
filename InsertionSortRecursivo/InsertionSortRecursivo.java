package InsertionSortRecursivo;
import java.util.Arrays;
import java.util.Scanner;

class InsertionSortRecursivo{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String[] entrada = sc.nextLine().split(" ");

        int[] nums = new int[entrada.length];
        for (int i = 0; i < entrada.length; i++){
            nums[i] = Integer.parseInt(entrada[i]);
        }
        insertionSort(nums, 1);
        sc.close();
    }

    public static void insertionSort(int[] v, int start){
        if (start < v.length){
            insercaoOrdenada(v, start);
            
            System.out.println(Arrays.toString(v));
            if(!estaOrdenado(v)){
                start++;
                insertionSort(v, start);
        }
        }
    }

    public static void insercaoOrdenada(int[] v, int index){
        if (index > 0 && v[index] < v[index - 1]){
            swap(v, index, index - 1);
            index--;
            insercaoOrdenada(v, index);
        }
        
    }

    public static void swap(int[] v, int i, int j){
        int aux = v[j];
        v[j] = v[i];
        v[i] = aux;
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