package me._20_state.gof._02_after;

public class Private implements State {
    private OnlineCourse onlineCourse;

    public Private(OnlineCourse onlineCourse) {
        this.onlineCourse = onlineCourse;
    }

    @Override
    public void addReview(String review, Student student) {
        if (student.isAvailable(this.onlineCourse)) {
            this.onlineCourse.getReviews().add(review);
        } else {
            throw new UnsupportedOperationException("프라이빗 코스를 수강하는 학생만 리뷰를 남길수 있습니다.");
        }
    }

    @Override
    public void addStudent(Student student) {
        if (availableTo(student)) {
            this.onlineCourse.addStudent(student);
        } else {
            throw new UnsupportedOperationException("프라이빗 코스는 수강할 수 없습니다.");
        }
    }

    private boolean availableTo(Student student) {
        return !this.onlineCourse.getStudents().contains(student);
    }
}
