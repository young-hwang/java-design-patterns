package me._20_state.gof._01_before;

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
