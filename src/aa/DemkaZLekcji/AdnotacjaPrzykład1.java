package aa.DemkaZLekcji;

import java.util.ArrayList;
import java.util.List;

public class AdnotacjaPrzykład1 {
    public static void main(String[] args) {
        List listOfUndefinedObjects = new ArrayList();
        List<Integer> listOfIntegers = (List<Integer>) listOfUndefinedObjects;
    }
}
