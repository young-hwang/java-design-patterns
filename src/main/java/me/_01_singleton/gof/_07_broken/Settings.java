package me._01_singleton.gof._07_broken;

import java.io.Serializable;

/**
 * Thread Safe 하도록 수정
 * inner class 사용
 * 원하는 시점 getInstance 호출 시 instance 생성 가능
 */
public class Settings implements Serializable {
    private Settings() {
        System.out.println("Settings");
    }

    private static class SettingsHolder {
        private static final Settings INSTANCE = new Settings();
    }

    public static Settings getInstance() {
        System.out.println("getInstance");
        return SettingsHolder.INSTANCE;
    }

    // 역직렬화 시 getInstance 호출하여 singleton 유지
    protected Object readResolve() {
        return getInstance();
    }
}
