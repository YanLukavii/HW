package taskException;

import java.util.Scanner;

public class User {

    private int age;

    public User(int age) {
        this.age = age;
    }

    public void setAge(int age) {

        if (age < 0 || age > 150) {
            try {
                throw new Exception();
            } catch (Exception e) {
                throw new RuntimeException(e);
            }
        }

        this.age = age;
    }

    public String readName() {

        try (Scanner scan = new Scanner(System.in)) {

            String text = scan.nextLine();

            if (!isName(text)) {

                try {
                    throw new RuntimeException("Бросили анчект исключение");
                } catch (RuntimeException e) {
                    System.err.println(e.getMessage());
                }
            }
            return text;
        }
    }


    public boolean isName(String text) {

        return text != null && text.matches("^[a-zA-Z]*$");
    }


}
