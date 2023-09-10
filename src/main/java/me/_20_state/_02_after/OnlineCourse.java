package me._20_state._02_after;

import java.util.ArrayList;
import java.util.List;

public class OnlineCourse {
    private State state = new Draft(this);

    private List<Student> students = new ArrayList<>();

    private List<String> reviews = new ArrayList<>();

    public void addReview(String review, Student student) {
        state.addReview(review, student);
    }

    public void addStudent(Student student) {
        state.addStudent(student);
    }

    public void changeState(State newState) {
        this.state = newState;
    }

    public State getState() {
        return state;
    }

    public List<Student> getStudents() {
        return students;
    }

    public List<String> getReviews() {
        return reviews;
    }
}
