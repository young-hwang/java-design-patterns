package io.younghwang.basemodel._20_state._01_before;

import java.util.ArrayList;
import java.util.List;

public class Student {
    private String name;
    private List<OnlineCourse> course = new ArrayList<>();

    public Student(String name) {
        this.name = name;
    }

    public void addPrivateCourse(OnlineCourse onlineCourse) {
        this.course.add(onlineCourse);
    }
}
