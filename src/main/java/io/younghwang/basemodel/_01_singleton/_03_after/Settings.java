package io.younghwang.basemodel._01_singleton._03_after;

/**
 * Thread Safe 하도록 수정
 * eager initialization(이른 초기화) 사용
 * 대상 instance 생성이 오래 걸리는 경우 로딩 속도 저하
 * instance 사용하지 않는 경우 불필요한 리소스 투입
 */
public class Settings {
    private static final Settings SETTINGS = new Settings();

    public static Settings getInstance() {
        return SETTINGS;
    }
}
