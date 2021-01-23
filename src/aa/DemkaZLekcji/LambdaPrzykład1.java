package aa.DemkaZLekcji;

public class LambdaPrzykład1 {
    public static void main(String[] args) {
        System.out.println("Czy 33 jest mniejsze od 50: " + isLessThan50(33));
        System.out.println("Czy 66 jest większe od 50: " + isLessThan50(66));
        System.out.println("Czy 33 jest parzyste: " + isNumberEven(33));
        System.out.println("Czy 66 jest parzyste: " + isNumberEven(66));

    }

    static boolean isLessThan50(int number){
        return number < 50;
    }

    static boolean isNumberEven(int number) {
        return number % 2 == 0;
    }
}
