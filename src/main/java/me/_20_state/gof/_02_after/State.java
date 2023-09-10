package me._20_state.gof._02_after;

public interface State {
    void addReview(String review, Student student);

    void addStudent(Student student);
}
