package org.example.chapter06;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class PersonTest {

    @Test
    void isTeenTest() {

        {
            Person person = new Person();
            person.setAge(10);
            Assertions.assertFalse(person.isTeen());
        }


        {
            Person person = new Person();
            person.setAge(18);
            Assertions.assertTrue(person.isTeen());
        }

        {
            Person person = new Person();
            person.setAge(-1);
            Assertions.assertEquals(0, person.getAge());
        }
    }

    @Test
    void getFullNameTest() {

        {
            Person person = new Person();
            Assertions.assertEquals("", person.getFullName());
        }

        {
            Person person = new Person();
            person.setFirstName("John");
            Assertions.assertEquals("John", person.getFullName());
        }

        {
            Person person = new Person();
            person.setLastName("Smith");    // lastName is set to Smith
            Assertions.assertEquals("Smith", person.getFullName());
        }

        {
            Person person = new Person();
            person.setFirstName("John");    // firstName is set to John
            person.setLastName("Smith");    // lastName is set to Smith
            Assertions.assertEquals("John Smith", person.getFullName());
        }
    }

}