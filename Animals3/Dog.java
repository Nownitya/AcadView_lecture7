
package Animals3;

public class Dog extends Animals3
{

    Dog(String name,String breed, String color)
    {
        this.name = name;
        this.breed = breed;
        this.color = color;
        
    }
    void dog()
    {
        System.out.println("Name of dog : " + name);
        System.out.println("Breed of dog : " +breed);
        System.out.println("Color of dog : " +color);

    }
   

    void eat() 
    {
        System.out.println("Eat bones");
                
    }
    
    
}
