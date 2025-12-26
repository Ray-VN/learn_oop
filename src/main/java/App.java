import model.*;
import model.lesson_3.*;
import abstraction.*;
import java.util.*;

public class App {
    public static void main(String[] args) throws Exception {

        /**
         * 2. Inheritance
         */
        // Teacher t1 = new Teacher();
        // System.out.println(t1.teach());

        /**
         * 3. Porlymorphism
         */
        // Animal a = new Animal();
        // System.out.println(a.makeSound());
        // Animal d = new Dog();
        // System.out.println(d.makeSound());
        // Animal c = new Cat();
        // System.out.println(c.makeSound());

        // List<Animal> list = new ArrayList<Animal>();
        // list.add(a);
        // list.add(d);
        // list.add(c);

        // for (Animal x : list ) {
        //     System.out.println(x.makeSound());
        // }
        
        /**
         * 4. Abstraction
         */

        Shape r = new Rectangle();
        Shape c = new Circle();

        r.calculateArea(5);
        c.calculateArea(5);
    }
}
