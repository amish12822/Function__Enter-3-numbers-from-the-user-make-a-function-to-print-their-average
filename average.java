import java.util.Scanner;

/**
 * average
 */
public class average {

    public static float AverageNo(float a, float b, float c){

        float AverageToNo = ( a+b+c) / 3;
        
        return AverageToNo ;
    } 

    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a value = ");int a = sc.nextInt();

        System.out.print("Enter b value = ");int b = sc.nextInt();

        System.out.print("Enter c value = ");int c = sc.nextInt();

        System.out.println("Average of no. a b c = " + AverageNo(a, b, c) );

    }

}
