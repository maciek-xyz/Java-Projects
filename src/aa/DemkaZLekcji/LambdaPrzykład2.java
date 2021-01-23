package aa.DemkaZLekcji;

public class LambdaPrzykład2 {
    public static void main(String[] args) {
        System.out.println("Less than 50 conditions: ");
        printNumbers(new NumberCondition() {
            @Override
            public boolean checkCondition(int number) {
                return number < 50;
            }
        });

        System.out.println("Even Condition: ");
        printNumbers(new NumberCondition() {
            @Override
            public boolean checkCondition(int number) {
                return number % 2 == 0;
            }
        });


    }

    public static void printNumbers(NumberCondition numberCondition) {
        for (int i = 40; i < 61 ; i++) {
            if (numberCondition.checkCondition(i)) {
                System.out.println(i);
            }
        }
    }


    interface NumberCondition {
        boolean checkCondition(int number);
    }

//    static class LessThan50Condition implements NumberCondition {
//        @Override
//        public boolean checkCondition(int number) {
//            return number < 50;
//        }
//    }
//
//    static class EvenCondition implements NumberCondition {
//        @Override
//        public boolean checkCondition(int number) {
//            return number % 2 == 0;
//        }
//    }
}
