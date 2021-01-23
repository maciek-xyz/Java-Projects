package aa.DemkaZLekcji;

public class LambdaPrzykład3 {
    public static void main(String[] args) {
        Animal animal = new Animal() {
            @Override
            public void speak() {
                System.out.println("Meeeow");
            }
        };
        animal.speak();

    }

    interface Animal{
        void speak();
    }

//    public static class Cat implements Animal {
//        public void speak(){
//            System.out.println("Meeeow");
//        }
//    }
}
