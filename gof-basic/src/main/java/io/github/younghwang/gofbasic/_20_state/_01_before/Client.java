package io.github.younghwang.gofbasic._20_state._01_before;

import com.fasterxml.jackson.databind.introspect.AnnotationCollector;

public class Client {
    public static void main(String[] args) {
        Student hwang = new Student("hwang");
        OnlineCourse onlineCourse = new OnlineCourse();

        Student young = new Student("young");
        young.addPrivateCourse(onlineCourse);

        onlineCourse.addStudent(hwang);
        onlineCourse.changeState(OnlineCourse.State.PRIVATE);

        onlineCourse.addStudent(young);

        onlineCourse.addReview("hello", hwang);

        System.out.println(onlineCourse.getState());
        System.out.println(onlineCourse.getStudents());
        System.out.println(onlineCourse.getReviews());
    }
}
