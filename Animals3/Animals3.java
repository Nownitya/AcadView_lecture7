
package Animals3;

abstract class Animals3 
{
    String name, breed, color;
    abstract void eat();
    void speak()
    {
        System.out.println("Dog --- Bark & Cat --- Meow");
    }    

    void dog() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    void cat() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
