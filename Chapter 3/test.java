import java.util.Scanner;

public class test
{    
    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);
        
        System.out.print("X: ");
        int x = in.nextInt();
        
        if(x < 0);
        {
            x = -x;
        }
        
        System.out.println(x);
    }
}