import annotations.ImportantString;
import annotations.RunImmediately;
import annotations.VeryImportant;
import entities.Cat;

import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public class CreatingAnnotations {

    public static void main(String[] args) throws InvocationTargetException, IllegalAccessException {
        Cat cat = new Cat("Miau", 3);

        if(cat.getClass().isAnnotationPresent(VeryImportant.class)) {
            System.out.println("This thing is very important");
        } else {
            System.out.println("This thing is not very important");
        }

        for (Method method : cat.getClass().getDeclaredMethods()) {
            if (method.isAnnotationPresent(RunImmediately.class)) {
                RunImmediately annotation = method.getAnnotation(RunImmediately.class);
                for (int i = 0; i < annotation.times(); i++) {
                    method.invoke(cat);
                }
            }
        }

        for (Field field : cat.getClass().getDeclaredFields()) {
            if (field.isAnnotationPresent(ImportantString.class)) {
               Object objectValue = field.get(cat);

               if(objectValue instanceof String stringvalue) {
                   System.out.println(stringvalue.toUpperCase());
               }
            }
        }
    }
}
