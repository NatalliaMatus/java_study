package lesson_9;

class WrongLoginException extends Exception {

    public WrongLoginException() {
        super();
    }

    public WrongLoginException(String message) {
        super(message);
    }
}
