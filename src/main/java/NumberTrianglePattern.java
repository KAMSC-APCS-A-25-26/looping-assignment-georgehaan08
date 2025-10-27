import java.util.Scanner;

public class NumberTrianglePattern {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a positive integer: ");
        int rows = sc.nextInt();
        int count = 1;

        while(count<=rows)
        {
            for(int i=1; i<=count; i++)
            {
                if(i == count)
                {
                    System.out.print(i);
                }
                else
                {
                    System.out.print(i + " ");
                }
            }
            System.out.println();
            count += 1;
        }

    }
}
