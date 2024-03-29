# 템플릿 메소드(Template Method) 패턴

알고르즘 구조를 서브 클래스가 확장할 수 있도록 템플릿으로 제공하는 방법이다.

## 장점

- 템플릿 코드를 재사용하고 중복 코드를 줄일 수 있다.
- 템플릿 코드를 변경하지 않고 상속을 받아서 구체적인 알고르즘만 변경 할 수 있다.

## 단점

- 리스코프 치환 원칙을 위반할 수 있다.
- 알고리즘 구조가 복잡할 수록 템플릿을 유지하기 어려워진다.

## 리스코브 치환 원칙(Liskov Subsitution Principle)

1988년 바바라 리스코프(Barbara Liskov)가 올바른 상속 관계의 특징을 정의하기 위해 발표한 것으로, 서브 타입은 언제나 기반 타입으로 교체할 수 있어야 한다는 것을 뜻한다.

교체할 수 있다는 말은, 자식 클래스는 최소한 자신의 부모 클래스에서 가능한 행위는 수행이 보장되어야 한다는 의미이다.

### LSP 원칙 위반 상황

#### 자식의 잘못된 메소드 오버로딩

```java
class Animal {
    int speed = 10;

    int go(int distance) {
        return speed * distance;
    }
}

class Bird extends Animal {
    int high = 100;

    int go(int distance, boolean flying) { // 잘못된 메소드 오버로딩
        if (flying) {
            return distance * high;
        } else {
            return speed * distance;
        }
    }
}
```

#### 부모의 의도와 다르게 메소드 오버라이딩

```java
class Animal {
    String getType() {
        return "Animal";
    }
}

class Dog extends Animal {
    String getType() {
        return null;
    }

    String getDogType() {
        return "Dog Dog";
    }
}
``` 

#### 잘못된 상속 관계 구성으로 인한 메서드 정의

```java

abstract class Animal {
    abstract void speak();
}

class Dog extends Animal {
    void speak() {
        System.out.println("멍");
    }
}

class Cat extends Animal {
    void speak() {
        System.out.println("옹");
    }
}

class Fish extends Animal {
    void speak() { // 잘 못된 상속 관계로 인한 메소드 정의
        try {
            throw new RuntimeException("Not Speaking");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
```