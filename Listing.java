/* Lab1 IT-2660
Jeff Jones
Ch.1 #41-42 */
import java.util.Scanner;
 
public class Listing 
{
	public static void main(String[] args) 
	{
        Listing[] threeListings = new Listing[3];
        for(int j = 0; j < threeListings.length; j++) 
        	{
        	 threeListings[j] = new Listing();
        	 threeListings[j].input();
        	}

        for(int j = threeListings.length-1;j >= 0; j--) 
        {
            System.out.println( threeListings[j]);
        }		
          
	}		
    String name;
    int age;
    
    public Listing() 
    {
        name = " ";
        age = 0;
    }
    
    public Listing(String name, int age) 
    {
        this.name = name;
        this.age = age;
    }
    
    public String toString() 
    {
        return "Name: " + name  + "; Age: " + age +";";
    }
    
    public void input() 
    {
        Scanner Scanner = new Scanner(System.in);
        System.out.print("Enter a Name: ");
        name = Scanner.nextLine();
        System.out.print("Enter their Age: ");
        age = Scanner.nextInt();   
    }
    
    public void setName(String name) 
    {
        this.name = name;
    }
    public void setAge(int age) 
    {
        this.age = age;
    }
    public String getName() 
    {
        return name;
    }
    public int getAge() 
    {
        return age;
    }   
}
