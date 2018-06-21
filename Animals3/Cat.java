
package Animals3;

public class Cat extends Animals3
{
    Cat(String name,String breed, String color)
    {
        this.name = name;
        this.breed = breed;
        this.color = color;
        
    }
    void cat()
    {
        System.out.println("Name of cat : " + name);
        System.out.println("Breed of cat : " +breed);
        System.out.println("Color of cat : " +color);

    }
   
    
    void eat() 
    {
        System.out.println("Drinks milk");
                
    }
    
}
