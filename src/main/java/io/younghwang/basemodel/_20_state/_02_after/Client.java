package io.younghwang.basemodel._20_state._02_after;

import com.fasterxml.jackson.databind.introspect.AnnotationCollector;

public class Client {
    public static void main(String[] args) {
        Student hwang = new Student("hwang");
        OnlineCourse onlineCourse = new OnlineCourse();

        onlineCourse.addStudent(hwang);

        hwang.addPrivateCourse(onlineCourse);
        onlineCourse.changeState(new Private(onlineCourse));

        onlineCourse.addReview("review", hwang);

        System.out.println(onlineCourse.getState());
        System.out.println(onlineCourse.getStudents());
        System.out.println(onlineCourse.getReviews());
    }
}
