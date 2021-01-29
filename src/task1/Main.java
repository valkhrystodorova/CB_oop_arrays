package task1;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        ArrayList <Teacher> arrayList = new ArrayList<>();
        Teacher teacher1 = new Teacher("Nadiia");
        Teacher teacher2 = new Teacher("Svitlana");
        Teacher teacher3 = new Teacher("Serhii");
        Teacher teacher4 = new Teacher("Oksana");
        arrayList.add(teacher1);
        arrayList.add(teacher2);
        arrayList.add(teacher3);
        arrayList.add(teacher4);
        System.out.println("Index of  the best teacher: " + arrayList.indexOf(teacher2));
        System.out.println("Index of the worst teacher: " + arrayList.indexOf(teacher1));

        for (int i = 0; i < arrayList.size(); i++) {
            System.out.println(arrayList.get(i).getFirstName());
        }

    }
}
