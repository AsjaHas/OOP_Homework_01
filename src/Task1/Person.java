package Task1;

public class Person {
    private String firstName;
    private String lastName;
    private int age;
    private boolean isActive;

    public Person(final String firstName, final String lastName, final boolean isActive) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.isActive = isActive;
    }

    public Person(final String firstName, final String lastName, final int age, final boolean isActive) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.age = age;
        this.isActive = isActive;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(final String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(final String lastName) {
        this.lastName = lastName;
    }

    public int getAge() {
        return age;
    }

    public void setAge(final int age) {
        this.age = age;
    }

    public boolean getIsActive() {
        return isActive;
    }

    public void setIsActive(final boolean isActive) {
        this.isActive = isActive;
    }

    public boolean isAdult() {
        return age > 18;
    }

    public void printPerson() {
        if (this.age == 0) {
            System.out.println("User: " + this.firstName + " " + this.lastName + "; Age: Unknown " + "; Status active: " + this.isActive);
            return;
        }
        if (isAdult()) {
            System.out.println("User: " + this.firstName + " " + this.lastName + "; Age: " + this.age + "/over 18" + "; Status active: " + this.isActive);
            return;
        }
        System.out.println("User: " + this.firstName + " " + this.lastName + "; Age: " + this.age + "/under 18" + "; Status active: " + this.isActive);
    }
}
