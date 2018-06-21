
package Animals3;

public class Main 
{
    public static void main(String[] args) 
    {
        Animals3 d1 = new Dog("Tommy", "Pitbul", "Black");
        Dog d2 = new Dog("Tommy", "Pitbul", "Black");
        d1.dog();
        d2.eat();
        d2.speak();
        
        Animals3 c1 = new Cat("Shila","Persian", "White");
        Cat c2 = new Cat("Shila","Persian", "White");
        c1.cat();
        c2.eat();
        c2.speak();
        
        
        
        
        
    }
    
}
