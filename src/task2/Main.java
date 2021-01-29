package task2;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {


        ArrayList<Zoo> animals = new ArrayList<>();
        animals.add(0, new Zoo("elephant1"));
        animals.add(1, new Zoo("elephant2"));
        animals.add(2, new Zoo("cat1"));
        animals.add(3, new Zoo("seal1"));
        animals.add(4, new Zoo("horse1"));
        animals.add(5, new Zoo("cat2"));
        animals.add(6, new Zoo("dog1"));
        animals.add(7, new Zoo("bird"));

        for (int i = 0; i < animals.size(); i++) {
            System.out.println(animals.get(i).getName());
        }
        System.out.println();

        animals.remove(7);
        animals.remove(4);
        animals.remove(2);

        for (int i = 0; i < animals.size(); i++) {
            System.out.println(animals.get(i).getName());
        }
        System.out.println(animals.size());
    }
}
