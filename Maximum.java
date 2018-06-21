
import java.util.Scanner;


public class Maximum 
{
    Scanner sc = new Scanner(System.in);

    String str1 = sc.next();
    String str2 = sc.next();
    
    public void max()
    {
        if(Integer.parseInt(str1) > Integer.parseInt(str2))
        {
            System.out.println("Str1 is maximum");
        }
        else
        {
            System.out.println("Str2 is maximum");          
        }
    }
    public static void main(String[] args) 
    {
        Maximum str = new Maximum();
        str.max();
        
    }  
}

