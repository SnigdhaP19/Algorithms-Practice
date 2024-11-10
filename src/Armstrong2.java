import java.util.Scanner;
public class Armstrong2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Give me a number: ");
        int num = sc.nextInt();
        int original_num = num;
        int digit;
        int sum_cube_digits = 0;
        while (num>0){
            digit = num % 10;
            num = num / 10;
            sum_cube_digits += digit*digit*digit;
        }
        if (sum_cube_digits == original_num){
            System.out.println("It's an Armstrong number");
        }
        else{
            System.out.println("It's not an Armstrong number");
        }




    }
}
