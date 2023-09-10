package me._01_singleton.gof._06_broken;

/**
 * Thread Safe 하도록 수정
 * inner class 사용
 * 원하는 시점 getInstance 호출 시 instance 생성 가능
 */
public class Settings {
    public Settings() {
    }

    private static class SettingsHolder {
        private static final Settings INSTANCE = new Settings();
    }

    public static Settings getInstance() {
        return SettingsHolder.INSTANCE;
    }
}
