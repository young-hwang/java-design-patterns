# iterator pattern

집합 객체 내부 구조를 노출시키지 않고 순회하는 방법을 제공한다.

집합 객체를 순회하는 클라이언트 코드를 변경하지 않고 다양한 순회 방법을 제공할 수 있다.

# 장점

- iterator 만 알고 있으면 되지 객체 내부의 자료 구조를 알 필요가 없다.
- 객체 지향 윈칙 단일 책임의 원칙에 부합한다.
- open close principle 원칙에 부합한다.

# 단점

- 모든 순회 방법을 iterator 화 시킬 필요가 없다.

# java

- java.util.Enumeration
- java.util.Iterator
- Java StAX(Streaming API for XML)의 Iterator 기반 API
    - XmlEventReader
    - XmlEventWriter

# Spring

- CompositeIterator

# spring