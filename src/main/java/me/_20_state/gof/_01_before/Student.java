package me._20_state.gof._01_before;

import java.util.HashSet;
import java.util.Set;

public class Student {
    private String name;
    private Set<OnlineCourse> onlineCourses = new HashSet<>();

    public Student(String name) {
        this.name = name;
    }

    public boolean isAvailable(OnlineCourse onlineCourse) {
        return onlineCourses.contains(onlineCourse);
    }

    public void addPrivateCourse(OnlineCourse onlineCourse) {
        this.onlineCourses.add(onlineCourse);
    }

}
