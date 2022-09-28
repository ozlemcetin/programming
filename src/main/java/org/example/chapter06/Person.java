package org.example.chapter06;

public class Person {

    private String firstName;
    private String lastName;
    private int age;

    /*
    Method named isTeen without any parameters, it needs to return true if the value of the age field is greater than 12 and less than 20, otherwise, return false.
     */
    public boolean isTeen() {
        return (this.age > 12 && this.age < 20);
    }

    /*
    Method named getFullName without any parameters, it needs to return the full name of the person.
     */
    public String getFullName() {

        boolean isFirstNameAvailable = (this.firstName != null && !this.firstName.isEmpty());
        boolean isLastNameAvailable = (this.lastName != null && !this.lastName.isEmpty());

        //In case both firstName and lastName fields are empty, Strings return an empty String.
        if (isFirstNameAvailable && isLastNameAvailable) return (this.firstName + " " + this.lastName);

        //In case lastName is an empty String, return firstName.
        if (isFirstNameAvailable) return this.firstName;

        //In case firstName is an empty String, return lastName.
        if (isLastNameAvailable) return this.lastName;

        return "";
    }

    /*
    ===
     */

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public int getAge() {
        return age;
    }

    /*
    Method named setAge with one parameter of type int, it needs to set the value of the age field.
    If the parameter is less than 0 or greater than 100, it needs to set the age field value to 0.
     */
    public void setAge(int age) {
        if (age < 0 || age > 100) age = 0;
        this.age = age;
    }
}
