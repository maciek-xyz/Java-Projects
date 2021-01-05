package Lesson7;

public class Bird {
    private static int kilometers;
    private int km;

    public void fligth(int km){
        this.km += km;
        kilometers += km;
    }

    public static int getKilometers(){
        return kilometers;
    }

    public int getKm(){
        return km;
    }
}
