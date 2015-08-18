import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/**
 * Created by Oleksii on 18.08.2015.
 */
public class Text {

    @SaveTo(path = "text.txt")
    static private final class TextContainer {
        private final String s = "To write in FILE";

        @Saver
        public void save(String path) {
            try {
                File file = new File(path);
                if (!file.exists()) {
                    file.createNewFile();
                }
                FileWriter fw = new FileWriter(file.getAbsoluteFile());
                BufferedWriter bw = new BufferedWriter(fw);
                bw.write(s);
                bw.close();
                System.out.println("File created successfully");

            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }

    public static void main(String[] args) throws NoSuchMethodException, InvocationTargetException, IllegalAccessException {
        TextContainer obj = new TextContainer();
        final Class<?> cls = TextContainer.class;
        SaveTo st = cls.getAnnotation(SaveTo.class);

        Method[] methods = cls.getMethods();
        for (Method m: methods){
            if(m.isAnnotationPresent(Saver.class)){
                m.invoke(obj, st.path());
            }
        }
        System.out.println(st.path());
    }
}
