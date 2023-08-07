import java.util.Scanner;

class Selection{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String[] entrada = sc.nextLine().split(" ");

        int[] nums = new int[entrada.length];

        for(int i = 0; i < entrada.length; i++){
            nums[i] = Integer.parseInt(entrada[i]);
        }

        

    }
}