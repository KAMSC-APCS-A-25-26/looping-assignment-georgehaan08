import java.util.Scanner;

public class SumOfEvenNumbers {
    public static void main(String[] args) {     
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter an int: ");
    int input = sc.nextInt();
    int total = 0;

    if(input<2)
    {
        System.out.println("Error: Input must be 2 or greater.");
    }

    for(int count = 2; count <= input; count++)
    {
        if(count % 2 == 0)
        {
            total += count;
        }
        else
        {
            continue;
        }
        count += 1;
    }
    System.out.println("The sum of even numbers between " + 2 + " and " + input + " is " + total+ ".");
    }
}
