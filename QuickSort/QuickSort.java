package QuickSort;

import java.util.Arrays;
import java.util.Scanner;

class QuickSort{
    public static void quickSort(int v[], int left, int right){
        if (left < right){
        int middle = particiona(v, left, right);
        System.out.println(imprime(v));
        quickSort(v, left, middle - 1);
        quickSort(v, middle+1, right);
        
        }
    }

    public static int particiona(int[] v, int left, int right){
        int i = left;
        for (int j = i + 1; j <= right; j++){
            if (v[j] < v[left]){
                i++;
                swap(v, j, i);
            }
        }
        swap(v, left , i);
        return i;
    }

    public static void swap(int[] v, int i, int j){
        int aux = v[j];
        v[j] = v[i];
        v[i] = aux;
    }

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String[] entrada = sc.nextLine().split(" ");

        int[] nums = new int[entrada.length];
        for(int i = 0; i < entrada.length; i++){
            nums[i] = Integer.parseInt(entrada[i]);
        }

        quickSort(nums, 0, nums.length - 1);
        sc.close();

    }
    public static String imprime(int[] v){
        String s = "";
        for (int i = 0; i < v.length; i++){
            s += Integer.toString(v[i]) + " ";
        }
        return s.trim();
    }
}