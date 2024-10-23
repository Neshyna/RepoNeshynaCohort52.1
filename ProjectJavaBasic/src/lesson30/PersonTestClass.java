package lesson30;

import hw27.Person;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

public class PersonTestClass {

    hw27.Person person;
    String startEmail = "john@test.com";
    String startPassword = "qwerty10$";

    @BeforeEach
    void setUp() {
        person = new Person(startEmail, startPassword);
    }
    /*
    1 Take valid email
    2 set valid email person
    3 expected : persons email  in the field email is valid equals set email
    4 check equality person.getEmail with valid email we've set

     */

    @Test
    void testValidEmailSet() {
        String validEmail = "valid@test.com";
        person.setEmail(validEmail);
        System.out.println("getEamil: " + person.getEmail());
        Assertions.assertEquals(validEmail, person.getEmail());
    }

    /*
    1. take invalid email
    2. set invalid email with setter
    3. expected: email is not set, person email not equal invalid email
    4. expected: email is the same

     */
    @ParameterizedTest
    @MethodSource("invalidEmailData")
    void testInvalidEmailSet(String invalidEmail) {
        person.setEmail(invalidEmail);
        Assertions.assertNotEquals(invalidEmail, person.getEmail());
        Assertions.assertEquals(startEmail, person.getEmail());
    }
    static Stream<String> invalidEmailData(){
        return Stream.of(
                "testmail.net",
                "test@mail.net",
                "test@mai@l.net",
                "test@mailnet",
                "test@mail.net.t",
                "test@mail.net.",
                "test@mailne.t",
                "test@mail.?net",
                "@testmail.net",
                "123Test@net",
                "_t@mail.ru"
        );
    }
    @Test
    void testValidPasswordSet(){
        String validEmail = "Test_123";
    }

}
