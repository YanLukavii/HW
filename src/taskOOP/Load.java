package taskOOP;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;

public class Load {

    public static Object load(String filePath) {

        ObjectInputStream ois = null;
        Object result = null;
        try {
            ois = new ObjectInputStream(new FileInputStream(filePath));
            result = ois.readObject();
            ois.close();

        } catch (IOException | ClassNotFoundException e) {
            e.printStackTrace();
        }
        return result;
    }
}
