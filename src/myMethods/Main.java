package myMethods;

public class Main {
    public static void main(String[] args) {
        MyList myArrayList = new MyList();
        for (int i = 0; i < 11; i++) {
            myArrayList.add(i);
        }
        System.out.println(myArrayList);
        System.out.println(myArrayList.size());
        myArrayList.remove(2);
        System.out.println(myArrayList);


        System.out.println(myArrayList.get(2));
        System.out.println(myArrayList.size());
        System.out.println(myArrayList.contains(9));
        System.out.println(myArrayList.contains(22));

        myArrayList.clear();
        System.out.println(myArrayList);
        System.out.println(myArrayList.size());



    }
}
