package io.younghwang.basemodel._23_visitor._03_java;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;

public class VisitorInJava {
    public static void main(String[] args) throws IOException {
        Path path = Path.of("/Users/id_young/Github/java-design-patterns");
        SearchFileVisitor searchFileVisitor = new SearchFileVisitor("VisitorInJava.java", path);
        Files.walkFileTree(path, searchFileVisitor);
    }
}
