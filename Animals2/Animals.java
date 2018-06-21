
package Animals2;

public interface Animals 
{
    void speak();
    void eat();
    
    public static void main(String[] args)
    {
        Dog D = new Dog();
        D.speak();
        D.eat();
        
        Cat C = new Cat();
        C.speak();
        C.eat();
    }  
}
   