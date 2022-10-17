import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public class Main {
    public static void main(String[] args) throws InvocationTargetException, IllegalAccessException{
        Cat myCat = new Cat("Female",2, false);

        if(myCat.getClass().isAnnotationPresent(Important.class)){
            System.out.println("This was marked with important annotations");
        }else{
            System.out.println("This was not marked with any annotations");
        }

        for(Method method : myCat.getClass().getDeclaredMethods()){
            if (method.isAnnotationPresent(RunImmediately.class)){
                    RunImmediately annotation = method.getAnnotation(RunImmediately.class);
                    for(int i=0; i<annotation.times(); i++){
                        method.invoke(myCat);
                    }
            }
        }
    }
}

