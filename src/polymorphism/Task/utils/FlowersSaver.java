package polymorphism.Task.utils;

import polymorphism.Task.entities.Flower;

import java.io.FileWriter;

public abstract class FlowersSaver {

    public static void save(String fileName, Flower[] bouquet) {
        try {
            FileWriter writer = new FileWriter(fileName);
            for (int i = 0; i < bouquet.length; i++) {
                if (i == bouquet.length - 1) writer.write("" + bouquet[i].getClass().getSimpleName());
                else writer.write(bouquet[i].getClass().getSimpleName() + ", ");
            }
            writer.flush();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}