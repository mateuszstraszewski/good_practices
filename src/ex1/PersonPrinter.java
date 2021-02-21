package ex1;

public class PersonPrinter {
    public static void printPerson(Person person, boolean isMale) {
        if (isMale) {
            printPersonOfGivenGender(person, Gender.MALE);
        } else {
            printPersonOfGivenGender(person, Gender.FEMALE);

        }
    }

    private static void printPersonOfGivenGender(Person person, Gender male) {
        System.out.println(String.format("%s %s jest %s.", person.getName(), person.getSurname(), male));
    }


}
