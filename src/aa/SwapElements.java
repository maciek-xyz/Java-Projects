package aa;

public class SwapElements {
    public static void main(String[] args) {

        int[] ints = new int[2];
        ints[0] = 10;
        ints[1] = 20;

        System.out.println("Before swapping: " + ints[0] + ", " + ints[1]);

        int temp = ints[0];
        ints[0] = ints[1];
        ints[1] = temp;

        System.out.println("After swapping: " + ints[0] + ", " + ints[1]);


    }
}
