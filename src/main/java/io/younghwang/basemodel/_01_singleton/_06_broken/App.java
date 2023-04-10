package io.younghwang.basemodel._01_singleton._06_broken;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;

/**
 * reflection 사용하여 singleton 깨기
 */
public class App {
    public static void main(String[] args) throws NoSuchMethodException, InvocationTargetException, InstantiationException, IllegalAccessException {
        Settings settings1 = Settings.getInstance();
        Constructor<Settings> constructor = Settings.class.getDeclaredConstructor();
        constructor.setAccessible(true);
        Settings settings2 = constructor.newInstance();
        System.out.println(settings1 == settings2);
    }
}
