import java.util.Scanner;

public class Main
{

    public static void main(String[] args)
    {
        controller actual=new controller();
        query admit=new query();
        System.out.println("Welcome to admission:");
        char s;
        Scanner scn=new Scanner(System.in);
        
        for(int i=0;i<2;i++)
        {
            admit.check();
            System.out.println("Enter the seat quota \nCentac(c)\nManagement(m):\nHelp(h)\nExit(e)");
            s=scn.next().charAt(0);
            actual.selector(s);
            
        }
        
    }

}

