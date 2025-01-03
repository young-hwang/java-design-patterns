package me._04_Builder.java.stepbuilder;

import java.util.Objects;

public class NyPizza extends Pizza {
    public enum Size { SMALL, MEDIUM, LARGE }

    private final Size size;

    public NyPizza(Builder builder) {
        super(builder);
        this.size = builder.size;
    }

    public static class Builder extends Pizza.Builder<Builder> {
        private final Size size;

        public Builder(Size size) {
            this.size = Objects.requireNonNull(size);
        }

        // 공변 반환 타입(Covariant Return Type)
        // 장점
        // - 메서드 반환 타입이 더 구체적이라서 사용할 때 타입 캐스팅이 줄어듬
        // - 반환 타입에 맞는 객체 사용이 직관적으로 가능해짐

        // 유효한 오버라이드 조건
        // - 메서드 이름, 매개변수 리스트가 부모 클래스 메서드와 정확히 일치해야함
        // - 접근 제어자는 부모 클래스 메서드의 접근 제어자보다 제한적이지 않아야함
        // - 반환 타입이 부모 클래스 메서드의 반환 타입보다 같거나 더 구체적(자식 타입)이어야 함.
        // - 메서드에 선언된 예외(Exception)가 부모 클래스 메서드에서 선언된 예외의 범위를 넘지 않아야 함.
        @Override
        NyPizza build() {
            return new NyPizza(this);
        }

        @Override
        protected Builder self() {
            return this;
        }
    }
}
