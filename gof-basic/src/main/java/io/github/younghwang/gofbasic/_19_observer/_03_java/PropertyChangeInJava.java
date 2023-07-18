package io.github.younghwang.gofbasic._19_observer._03_java;

import java.beans.PropertyChangeEvent;
import java.beans.PropertyChangeListener;
import java.beans.PropertyChangeSupport;

public class PropertyChangeInJava {
    static class User implements PropertyChangeListener {

        @Override
        public void propertyChange(PropertyChangeEvent evt) {
            System.out.println(evt.getNewValue());
        }
    }

    static class Subject {
        PropertyChangeSupport support = new PropertyChangeSupport(this);

        public void addObserver(PropertyChangeListener observer) {
            support.addPropertyChangeListener(observer);
        }

        public void removeObserver(PropertyChangeListener observer) {
            support.removePropertyChangeListener(observer);
        }

        public void add(String message) {
            support.firePropertyChange("eventName", null, message);
        }
    }

    public static void main(String[] args) {
        Subject subject = new Subject();
        User observer = new User();
        subject.addObserver(observer);
        subject.add("java plc example");
        subject.removeObserver(observer);
        subject.add("cannot receive message");
    }
}
