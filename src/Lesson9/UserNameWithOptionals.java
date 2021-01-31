package Lesson9;

import java.time.LocalDate;

public class UserNameWithOptionals {
    public static void main(String[] args) {
        UserName userName1 = new UserName("Jan", "Kowalski", null);
        String firstLetter = generateUserName(userName1.getName(), x -> String.valueOf(x.charAt(0))).toLowerCase();
        String secondName = generateUserName(userName1.getSecondName(), x -> x.toLowerCase());
        int year = generateBirthday(userName1.getDate(),x -> x.getYear());
        System.out.println("Username: " + firstLetter + secondName + year);
    }

    static String generateUserName(String string, GenerateUserName generateUserName) {
        return generateUserName.doSomething(string);
    }

    static int generateBirthday(LocalDate year, GenerateBirthday generateBirthday){
        if (year == null) {
            return LocalDate.now().getYear();
        } else {
           return year.getYear();
        }
    }


}
