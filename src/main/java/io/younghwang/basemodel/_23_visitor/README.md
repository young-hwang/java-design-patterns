# Visitor Pattern

## 기능

기존 코드를 변경하지 않고 새로운 기능을 추가하는 방법이다.
Double Dispatch 를 활용 할 수 있다.

## 장접

element의 변경 없이 device 추가 가능

## 단점

구조가 복잡(double dispatch 이해)

device의 static한 타입으로 element 추가 변경 시 많은 변경이 필요
