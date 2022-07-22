package taskOOP;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class Save {


    public static void saveObject (Object obj, String saveFilePath) {
        ObjectOutputStream objectOutputStream = null;
        try {
            objectOutputStream = new ObjectOutputStream(new FileOutputStream(saveFilePath));
            objectOutputStream.writeObject(obj);
            objectOutputStream.close();

        } catch (IOException e) {
            e.printStackTrace();
        }

    }

}
