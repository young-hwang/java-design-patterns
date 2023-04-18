package io.younghwang.basemodel._22_template_method._02_after;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class FileProcessor {
    private String file;

    public FileProcessor(String file) {
        this.file = getClass().getResource(file).getPath();
    }

    public int add() {
        Calculator addCalculator = new Calculator() {
            @Override
            public int doSomething(int sum, int number) {
                return sum + number;
            }
        };
        return process(addCalculator);
    }

    public int process(Calculator calculator) {
        try (BufferedReader br = new BufferedReader(new FileReader(file))) {
            int result = 0;
            String line = null;
            while ((line = br.readLine()) != null) {
                result = calculator.doSomething(result, Integer.parseInt(line));
            }
            return result;
        } catch (FileNotFoundException e) {
            throw new IllegalArgumentException(file + "에 해당하는 파일이 없습니다.", e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
