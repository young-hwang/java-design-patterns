package io.github.younghwang.gofbasic._01_singleton._01_after;

/**
 * Thread Safe 하지 않음
 * Multi Thread 시 Instance가 생성 전 동시에 getInstance() 진입하여 Instanace 생성 가능
 */
public class Settings {
    private static Settings settings;

    public static Settings getInstance() {
        if (settings == null) {
            settings = new Settings();
        }
        return settings;
    }
}
