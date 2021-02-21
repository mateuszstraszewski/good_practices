package ex1;

public class Main {
    public static void main(String[] args) {
        Person person1 = new Person(args[0], args[1], Integer.parseInt(args[2]));
        PersonPrinter.printPerson(person1, GenderScanner.isMale(person1));
    }
}
