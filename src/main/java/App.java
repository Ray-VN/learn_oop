import model.*;
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
        Animal a = new Animal();
        System.out.println(a.makeSound());
        Animal d = new Dog();
        System.out.println(d.makeSound());
        Animal c = new Cat();
        System.out.println(c.makeSound());

        List<Animal> list = new ArrayList<Animal>();
        list.add(a);
        list.add(d);
        list.add(c);

        for (Animal x : list ) {
            System.out.println(x.makeSound());
        }

    }
}
