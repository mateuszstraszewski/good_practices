package ex1;

public class GenderScanner {

    public static boolean isMale(Person person) {
        String name = person.getName();
        boolean isMaleResult = true;
        if (name.endsWith("a")) {
            isMaleResult = false;
        }

        return isMaleResult;
    }
}
