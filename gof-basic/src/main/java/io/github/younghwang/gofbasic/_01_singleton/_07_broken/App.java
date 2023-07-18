package io.github.younghwang.gofbasic._01_singleton._07_broken;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectInputStream;
import java.io.ObjectOutput;
import java.io.ObjectOutputStream;
import java.lang.reflect.InvocationTargetException;

/**
 * 직렬화 역직렬화를 사용하여 깨기
 */
public class App {
    public static void main(String[] args) throws NoSuchMethodException, InvocationTargetException, InstantiationException, IllegalAccessException, IOException, ClassNotFoundException {
        Settings settings1 = Settings.getInstance();
        Settings settings2;
        try (ObjectOutput out = new ObjectOutputStream(new FileOutputStream("settings.obj"))) {
            out.writeObject(settings1);
        }

        try (ObjectInput in = new ObjectInputStream(new FileInputStream("settings.obj"))) {
            settings2 = (Settings) in.readObject();
        }
        System.out.println(settings1 == settings2);
    }
}
