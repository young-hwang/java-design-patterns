package io.github.younghwang.gofbasic._01_singleton._08_broken;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectInputStream;
import java.io.ObjectOutput;
import java.io.ObjectOutputStream;
import java.lang.reflect.InvocationTargetException;

/**
 * Reflection 사용에 따른 singleton 깨짐 방지
 * enumerate 사용
 * singleton을 만드는 방법 중 하나
 * 미리 만들어진 인스턴스 사용 단점
 * 상속 할 수 없음
 * enumerate serializable 구현
 * 안전하게 역직릴화 가능
 */
public class App {
    public static void main(String[] args) throws InvocationTargetException, InstantiationException, IllegalAccessException, IOException, ClassNotFoundException {
        Settings settings1 = Settings.INSTANCE;
        Settings settings2 = null;
        Settings settings3 = null;
        // reflection test
//        Constructor<?>[] declaredConstructors = Settings.class.getDeclaredConstructors();
//        for (Constructor constructor : declaredConstructors) {
//            constructor.setAccessible(true);
//            settings2 = (Settings) constructor.newInstance("INSTANCE");
//        }

        // serializable test
        try (ObjectOutput out = new ObjectOutputStream(new FileOutputStream("settings.obj"))) {
            out.writeObject(settings1);
        }
        try (ObjectInput in = new ObjectInputStream(new FileInputStream("settings.obj"))) {
            settings3 = (Settings) in.readObject();
        }

//        System.out.println(settings1 == settings2);
        System.out.println(settings1 == settings3);
    }
}
