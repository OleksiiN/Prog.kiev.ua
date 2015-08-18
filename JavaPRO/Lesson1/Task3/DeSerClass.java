import java.io.Serializable;

/**
 * Created by Oleksii on 18.08.2015.
 */
public class DeSerClass implements Serializable {

    @Save
    public String s = "String";

    @Save
    public int i = 1;

    @Save
    public boolean b = true;

    public String st = "do not seralize/deserialize";
}
