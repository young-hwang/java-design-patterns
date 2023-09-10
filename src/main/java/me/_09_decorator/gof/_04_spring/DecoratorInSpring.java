package me._09_decorator.gof._04_spring;

import org.springframework.beans.factory.xml.BeanDefinitionDecorator;
import org.springframework.http.server.reactive.ServerHttpRequestDecorator;
import org.springframework.http.server.reactive.ServerHttpResponseDecorator;

public class DecoratorInSpring {
    public static void main(String[] args) {
        // 빈 설정 데코레이터
        BeanDefinitionDecorator definitionDecorator;

        // 웹플럭스 HTTP 요청 /응답 랩터
        ServerHttpRequestDecorator requestDecorator;
        ServerHttpResponseDecorator responseDecorator;
    }
}
