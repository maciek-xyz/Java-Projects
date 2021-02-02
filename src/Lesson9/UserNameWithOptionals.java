package Lesson9;

import java.time.LocalDate;
import java.util.Optional;

public class UserNameWithOptionals {

    private static UserName userName1 = new UserName("Jan", "Kowalski", LocalDate.of(1996,04,26));

    public static void main(String[] args) {
        String firstLetter = generateUserName(userName1.getName(), x -> String.valueOf(x.charAt(0))).toLowerCase();
        String secondName = generateUserName(userName1.getSecondName(), x -> x.toLowerCase());
        int year = getYearBirdth()
                .orElseThrow();

        System.out.println("Username: " + firstLetter + secondName + year);
    }

    static String generateUserName(String string, GenerateUserName generateUserName) {
        return generateUserName.doSomething(string);
    }

    private static Optional<Integer> getYearBirdth(){
        if (userName1.getDate() == null) {
            return Optional.of(LocalDate.now().getYear());
        } else {
            return Optional.of(userName1.getDate().getYear());
        }
    }


}
