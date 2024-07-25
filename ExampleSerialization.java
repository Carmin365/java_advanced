import java.io.*;

class Person implements Serializable {
    
}

public class ExampleSerialization {
    public static void main(String[] args) throws IOException {
        Person person = new Person();
        
        FileOutputStream fos = new FileOutputStream("person.tobe");
        ObjectOutputStream oos = new ObjectOutputStream(fos);
        oos.writeObject(person);
        oos.close();
    }
}


