package aa.DemkaZLekcji;

import java.lang.annotation.Annotation;
import java.lang.reflect.InvocationTargetException;

public class AnnotatedAnimalDemo {
    public static void main(String[] args) throws NoSuchMethodException, IllegalAccessException, InvocationTargetException, InstantiationException {
        Animal dog = new Animal("Dog");
        Class<? extends Animal> clazz = dog.getClass();
        Annotation[] annotations = clazz.getAnnotations();
        for (Annotation annotation : annotations) {
            if (annotation instanceof Mammal) {
                Mammal mammal = (Mammal) annotation;
                System.out.println(mammal.hunter());
            }
        }
    }
}
