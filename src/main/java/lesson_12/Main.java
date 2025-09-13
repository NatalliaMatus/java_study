package lesson_12;

public class Main {
    public static void main(String[] args) {
        //MyArrayList<Object> list = new MyArrayList<>();
        MyArrayList<Object> list = new MyArrayList<>();

        System.out.println("Starting size " + list.size());

        list.add("Hello");
        list.add(123);
        list.add(45.6);
        list.add(true);
        System.out.println(list);

        System.out.println("Final size " + list.size());

        list.remove(1);
        System.out.println("After removal: " + list);

        System.out.println("Contains 'Hello'? " + list.contains("Hello"));
        System.out.println("Element with index 1 : " + list.get(1));

        list.clear();
        System.out.println("After cleaning: " + list);
    }
}
