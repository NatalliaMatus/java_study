package lesson_9;

import static lesson_9.AuthorisationValidator.*;

public class Main {
    public static void main(String[] args) {
        System.out.println(validate("java1", "test123", "test123"));
        System.out.println(validate("java 2", "test123", "test123"));
        System.out.println(validate("java3", "test", "test123"));
        System.out.println(validate("java4", "test123", "test"));
        System.out.println(validate("java5555555555555555555555", "test123", "test123"));
        System.out.println(validate("java5", "test11111111111111111", "test123"));
    }
}
