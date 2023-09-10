package me._05_prototype.gof._03_java;

import org.modelmapper.ModelMapper;

import java.util.ArrayList;
import java.util.List;

public class PrototypeInJava {
    public static void main(String[] args) {
        // Collection
        Student student1 = new Student("young");
        Student student2 = new Student("hwang");

        // 대부분 ArrayList 사용하지 않음
        ArrayList<Student> studentsArr = new ArrayList<>();
        studentsArr.add(student1);
        studentsArr.add(student2);

        ArrayList<Student> cloneArr = (ArrayList<Student>) studentsArr.clone();

        // 대부분 List 사용 하지만 List는 cloneable를 상속 받지 않아 clone을 사용할 수 없음
        List studentsList = new ArrayList<>();
        studentsList.add(student1);
        studentsList.add(student2);

        // clone 불가
        // studentsList.clone();

        // clone 방법 shallow copy
        List<Student> clone = new ArrayList<>(studentsList);
        System.out.println(clone);


        // ModelMapper Example
        GithubRepository githubRepository = new GithubRepository();
        githubRepository.setUser("ggammu");
        githubRepository.setName("young");

        GithubIssue githubIssue = new GithubIssue(githubRepository);
        githubIssue.setId(1);
        githubIssue.setTitle("feat: 신규 기능 추가");

        ModelMapper modelMapper = new ModelMapper();
        GithubIssue githubIssue1 = modelMapper.map(githubIssue, GithubIssue.class);

        System.out.println(githubIssue1);
        System.out.println(githubIssue.getGithubRepository() == githubIssue1.getGithubRepository());
    }
}
