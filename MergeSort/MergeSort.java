package MergeSort;

import java.util.Arrays;
import java.util.Scanner;

class MergeSort{
    public static void mergeSort(int[] v, int left, int right){
        if (left >= right){
            imprimeArray(v, left, right);
            return;
        }

        
        else{
            imprimeArray(v, left, right);
            int middle = (left + right) / 2;
            mergeSort(v, left, middle);
            mergeSort(v, middle + 1, right);
            merge(v, left, middle, right);
            
        }
    }

    public static void merge(int[] v, int left, int middle, int right){
        int[] aux = new int[v.length];

        for (int i = 0; i < v.length; i++){
            aux[i] = v[i];
        }

        int i = left;
        int j = middle + 1;
        int k = left;

        while(i <= middle && j <= right){
            if (aux[i] < aux[j]){
                v[k] = aux[i];
                i++;
            }

            else {
                v[k] = aux[j];
                j++;
            }
            k++;
        }

        while (i <= middle){
            v[k++] = aux[i++];
        }

        while (j <= right){
            v[k++] = aux[j++]; 
        }
        
        imprimeArray(v, left, right);
    }

    public static void imprimeArray(int[] v, int left, int right){
        System.out.println(Arrays.toString(Arrays.copyOfRange(v, left, right + 1)));
    }

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String[] vetor = sc.nextLine().split(" ");
        int[] nums = new int[vetor.length];

        for(int i = 0; i < vetor.length; i++){
            nums[i] = Integer.parseInt(vetor[i]);
        }
        mergeSort(nums, 0, nums.length - 1);
        sc.close();

    }
}