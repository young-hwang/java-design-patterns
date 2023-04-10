package io.younghwang.basemodel._01_singleton._02_after;

/**
 * Thread Safe 하도록 수정
 * synchronized 사용하여 메소드를 동기화
 * 동기화 처리로 인한 성능 저하
 */
public class Settings {
    private static Settings settings;

    public static synchronized Settings getInstance() {
        if (settings == null) {
            settings = new Settings();
        }
        return settings;
    }
}
