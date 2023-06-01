package io.younghwang.basemodel._12_proxy._04_java;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

public class DynamicProxyInJava {
    public static void main(String[] args) {
        DynamicProxyInJava dynamicProxyInJava = new DynamicProxyInJava();
        dynamicProxyInJava.dynamicProxy();
    }

    private void dynamicProxy() {
        GameService gameServiceProxy = getGameServiceProxy(new GameServiceReal());
        gameServiceProxy.startGame();
    }

    private GameService getGameServiceProxy(GameService target) {
        return (GameService) Proxy.newProxyInstance(this.getClass().getClassLoader(), new Class[]{GameService.class}, (proxy, method, args) -> {
            System.out.println("Dynamic Proxy");
            method.invoke(target, args);
            return null;
        });
    }
}
