package org.AsjaHas.qamp.oop.homework1.Task1;

public class PersonMain {
    public static void main(String[] args) {
        final Person person = new Person("Asja", "Hasanovic", 30, true);
        final Person person1 = new Person("Tarik", "Basic", false);
        person.printPerson();
        person1.printPerson();
        person1.setIsActive(true);
        person1.setAge(15);
        person1.printPerson();
    }
}
