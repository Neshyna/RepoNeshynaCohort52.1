package hw27;

public class Person {
    private String email;
    private String password;

    public Person(String email, String password) {
        this.email = email;
        this.password = password;
    }

    public String getEmail() {
        return email;
    }

    public String getPassword() {
        return password;
    }

    public void setEmail(String email) {
        if (isEmailValid(email)){
            this.email = email;
        }
    }

    private boolean isEmailValid(String email) {
    /*
    Task 1
    Закончить реализацию метода проверки email на валидность в классе Person
    Требования к email:
    test@email.com.net
    1. Должна присутствовать @ и только одна
    2. Точка после собаки
    3. После последней точки есть 2 или более символов
    4. Алфавит, цифры, '-', '_', '.', '@'
    5. До собаки должен быть хотя бы 1 символ
    6. Первый символ - должна быть буква
     */

        //6
        char firstSymbol = email.charAt(0);
        if (!Character.isLetter(firstSymbol)) return false;

        //1
        int indexAt = email.indexOf("@");
        if (indexAt == -1 || indexAt != email.lastIndexOf("@")) return false;

        //5
        if (indexAt == 0) return false;

        //2
        int dotIndexAfterAt = email.indexOf(".",indexAt +1);
        if (dotIndexAfterAt == -1) return false;

        //3
        int countAfterDot = email.length() - dotIndexAfterAt - 1;
        if (countAfterDot < 2) return false;

        //4
        if(! hasLettersAndNumerals(email)) return false;
        if(! containsSpecialCharacters(email)) return false;


        return true;

    }
    public boolean hasLettersAndNumerals(String email) {
        boolean hasLetter = false;
        boolean hasNumber = false;

        for (int i = 0; i < email.length(); i++) {
            char ch = email.charAt(i);

            if (Character.isLetter(ch)) {
                hasLetter = true;
            } else if (Character.isDigit(ch)) {
                hasNumber = true;
            }
            if (hasLetter && hasNumber) {
                return true;
            }
        }
        return false;
    }

    public boolean containsSpecialCharacters(String email) {
        for (int i = 0; i < email.length(); i++) {
            char ch = email.charAt(i);
            if (ch == '-' || ch == '_' || ch == '.' || ch == '@') {
                return true;
            }
        }
        return false;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public static void main(String[] args) {

        Person person = new Person("email","password");

        System.out.println("is email valid?  " + person.isEmailValid("t123_ext@gmail.com"));

    }
}
/*

Task 2
Написать в классе Person метод для проверки валидности Password

Требование к паролю:
длина >= 8
Должна быть мин 1 цифра
Должна быть мин 1 маленькая буква
Должна быть мин 1 большая буква
Должна быть мин 1 спец. символ (!%$@&*()[].,-)

5 boolean переменных. Каждая "отвечает за свой пункт".
Пароль будет подходить только если все пять - true
return b1 && b2 && b3 && b4 && b5;
 */