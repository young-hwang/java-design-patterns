package io.younghwang.basemodel._01_singleton._08_broken;

import java.io.Serializable;

/**
 * Thread Safe 하도록 수정
 * Enumerate 사용
 */
public enum Settings {
    INSTANCE;

    Settings() {
    }

    private Integer number;

    public Integer getNumber() {
        return number;
    }

    public void setNumber(Integer number) {
        this.number = number;
    }
}
