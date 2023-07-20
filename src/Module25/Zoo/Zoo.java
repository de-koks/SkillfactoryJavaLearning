package Module25.Zoo;

import java.util.Arrays;

public class Zoo {
    Object[] objects;

    public Zoo() {
        // here we do not create animals yet
        objects = new Object[3];
        // filling up the array with specific animals
        objects[0] = new Dog();
        objects[1] = new Cat();
        objects[2] = new Reptile();
    }

    public void print() {
        // using a cycle!
        // Every animal is printed on its own
        for (Object a : objects) {
            System.out.println(a);
        }
    }

    public void sound() {
        for (Object a : objects) {
            if (a instanceof Soundable) {
                ((Soundable) a).sound();
            }
        }
    }

    public void change(Object a, int i) {
        if (i >= 0 && i < objects.length)
            objects[i] = a;
    }

    public String toString() {
        return "Zoo: " + Arrays.toString(objects);
    }
}

