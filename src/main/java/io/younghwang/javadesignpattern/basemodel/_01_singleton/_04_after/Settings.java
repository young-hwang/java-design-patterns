package io.younghwang.javadesignpattern.basemodel._01_singleton._04_after;

/**
 * Thread Safe 하도록 수정
 * double checked locking 사용
 * Setting Class 동기화 후 instance 존재 여부 확인
 * volatile 명령어를 반드시 사용해야 함(jdk 1.5 이상 부터)
 * getInstance 메소드를 동기화하지 않아 좀 더 효율적으로 처리
 * 복잡한 방법
 */
public class Settings {
    private static volatile Settings settings;

    public static Settings getInstance() {
        if (settings == null) {
            synchronized (Settings.class) {
                if (settings == null) {
                    settings = new Settings();
                }
            }
        }
        return settings;
    }
}
