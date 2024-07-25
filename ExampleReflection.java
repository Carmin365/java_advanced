import java.lang.reflect.Method;

public class ExampleReflection {
    public static void main(String[] args) throws Exception {
        Class<?> clazz = String.class;
        Method method = clazz.getMethod("length");
        int length = (int) method.invoke("Hey");
        System.out.println(length);
    }
}