package io.younghwang.javadesignpattern.basemodel._01_singleton._09_java;

/**
 * Java Singleton 사용 예제
 */
public class App {
    public static void main(String[] args) {
        // 실행 환경 정보
        Runtime runtime = Runtime.getRuntime();
        System.out.println(runtime.maxMemory());
    }
}
