import java.io.*;
import java.lang.reflect.Field;

/**
 * Created by Oleksii on 18.08.2015.
 */
public class Main {

    public static void Ser () throws IOException, IllegalAccessException {

        DeSerClass obj = new DeSerClass();
        final Class<?> cls = DeSerClass.class;

        FileOutputStream fos = new FileOutputStream("temp.out");
        ObjectOutputStream oos = new ObjectOutputStream(fos);
        DeSerClass st = new DeSerClass();

        Field[] fields = cls.getFields();
        for (Field m: fields) {
            if (m.isAnnotationPresent(Save.class)) {
                oos.writeObject(m.get(obj));
            }
        }
        oos.flush();
        oos.close();
    }

    private static void DeSer() throws IOException, ClassNotFoundException, IllegalAccessException {
        DeSerClass obj = new DeSerClass();
        final Class<?> cls = DeSerClass.class;

        ObjectInputStream in =  new ObjectInputStream (new FileInputStream("temp.out"));

        Field[] fields = cls.getFields();
        for (Field m: fields) {
            if (m.isAnnotationPresent(Save.class)) {
                System.out.println(in.readObject());
            }
        }
    }

    public static void main(String[] args) throws IOException, ClassNotFoundException, IllegalAccessException {
        Ser();
        DeSer();
    }

}
