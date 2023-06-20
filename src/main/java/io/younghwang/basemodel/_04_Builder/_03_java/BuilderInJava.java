package io.younghwang.basemodel._04_Builder._03_java;

import org.springframework.web.util.UriComponents;
import org.springframework.web.util.UriComponentsBuilder;

import java.util.stream.Stream;

public class BuilderInJava {
    public static void main(String[] args) {
        // StringBuilder - synchronized 쓰지 않는 api
        StringBuilder stringBuilder = new StringBuilder();
        String name = stringBuilder.append("young").append("hwang").toString();
        System.out.println(name);

        // StringBuffer - synchronized 사용하는 api
        StringBuffer stringBuffer = new StringBuffer();
        String nameBuffer = stringBuffer.append("young").append("hwang").toString();
        System.out.println(nameBuffer);

        // StreamBuilder
        Stream<String> nameBuild = Stream.<String>builder().add("young").add("hwang").build();
        nameBuild.forEach(System.out::println);

        // UriComponent
        UriComponents encode = UriComponentsBuilder.newInstance().scheme("http").host("www.young-hwang.github.io").path("java").build().encode();
        System.out.println(encode);
    }
}
