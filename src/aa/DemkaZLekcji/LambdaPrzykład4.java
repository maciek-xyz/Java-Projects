package aa.DemkaZLekcji;

public class LambdaPrzykład4 {
    public static void main(String[] args) {
        System.out.println("Less than 50 conditions: ");
       printNumbers(x -> x < 50);

        System.out.println("Even Condition: ");
        printNumbers(x -> x % 2 == 0);
    }

    public static void printNumbers(LambdaPrzykład2.NumberCondition numberCondition) {
        for (int i = 40; i < 61 ; i++) {
            if (numberCondition.checkCondition(i)) {
                System.out.println(i);
            }
        }
    }


    interface NumberCondition {
        boolean checkCondition(int number);
    }
}

