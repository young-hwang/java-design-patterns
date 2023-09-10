# Design Pattern of Java

디자인 패턴(Design pattern)은 건축학 및 컴퓨터 과학에서 사용되는 용어로, 설계 문제에 대한 해답을 문서화하기 위해 고안된 방법이다.
이 방식은 건축가 크리스토퍼 알렉산더가 건축학 영역에서 고안한 것을 그 시초로 하며, 이후 컴퓨터 과학 등 여러 다른 분야에도 도입되었다

소프트웨어 개발 방법에서 사용되는 디자인 패턴은 프로그램 개발에서 자주 나타나는 과제를 해결하기 위한 방법 중 하나로, 과거의 소프트웨어 개발 과정에서 발견된 설계의 노하우를 축적하여 이름을 붙여, 이후에 재이용하기
좋은 형태로 특정의 규약을 묶어서 정리한 것이다.
알고리즘과 같이 프로그램 코드로 바로 변환될 수 있는 형태는 아니지만, 특정한 상황에서 구조적인 문제를 해결하는 방식을 설명해 준다.

이 용어를 소프트웨어 개발 영역에서 구체적으로 처음 제시한 곳은 GoF(Gang of Four)라 불리는 네명의 컴퓨터 과학 연구자들이 쓴 서적 'Design Patterns: Elements of Reusable
Object-Oriented Software'(재이용 가능한 객체지향 소프트웨어의 요소 - 디자인 패턴)이다.
GoF는 컴퓨터 소프트웨어 공학 분야의 연구자인 에릭 감마, 리차드 헬름, 랄프 존슨, 존 블리시디스의 네명을 지칭한다.

[GoF의 디자인 패턴](https://www.yes24.com/Product/Goods/17525598)

[Head Firtst 디자인 패턴](https://www.yes24.com/Product/Goods/108791895)

# SOLID Design Principle

SOLID 설계 원칙은 소프트웨어를 설계하고 개발할 때 잘못된 설계를 방지하는 데 도움이 되는 일련의 지침을 나타낸다.
디자인 원칙은 "애자일 소프트웨어 개발: 원칙, 패턴 및 사례"에서 수집한 Robert Martin과 연관되어 있다.
로버트 마틴(Robert Martin)에 따르면 나쁜 디자인에는 피해야 할 3가지 중요한 특성이 있다.

- Rigidity(경직성) - 모든 변경 사항이 시스템의 다른 많은 부분에 영향을 미치기 때문에 변경하기가 어렵다.
- Fragility(취약성) - 변경하면 시스템의 예상치 못한 부분이 중단된다.
- Immobility(부동성) - 현재 애플리케이션에서 분리할 수 없기 때문에 다른 애플리케이션에서 재사용하기 어렵다.

SOLID 설계 원칙은 아래 5가지 원칙의 이름을 기반으로한 약어이다.

- Single Responsibility Principle
- Open Close Principle
- Liskov's Substitution Principle
- Interface Segregation Principle
- Dependency Injection Principle

## Single Responsibility Principle

단일 책임 원칙(Single Responsibility Principle)은 1979년 Tom DeMarco의 저서 Structured Analysis and Systems Specification에서 소개되었다.

Robert Martin은 개념을 재해석하여 책임을 변경 해야 하는 이유로 정의 했다.
클래스는 변경 해야 할 이유가 단 한가지 뿐 이어야 한다.
이 원리는 만약 우리가 클래스를 변경 해야할 두 가지 이유가 있다면, 우리는 두 개의 class 기능을 나눠야 한다는 것을 말한다.
만약 우리가 한 가지 변경을 해야 한다면 우리는 미래에 그것을 다루는 클래스만 변경할 것이다.
많은 책임을 가진 클래스에서 변화를 만들어야 할 때 그 변화는 클래스의 다른 기능에 영향을 미칠 수 있다.

## Open Close Principle

클래스, 모듈, 기능과 같은 소프트웨어 엔터티는 확장을 위해 열려 있어야 하고 수정을 위해 닫혀 있어야 한다.
OPC는 일반적인 원칙이다.
동작을 확장해야 할 때 클래스를 변경할 필요 없이 확장한지 클래스를 작성할 때 이를 고려한다.
모듈, 패키지, 라이브러리에도 동일한 원칙이 적용될 수 있다.
일련의 클래스가 포함된 라이브러리가 있는 경우 이미 작성된 코드를 변경 하지 않고 라이브러리를 확장하는 것을 선호하는 여러 가지 이유가 있다(이전 버전과의 호환성, 회귀 테스트 등).
이것이 바로 모듈이 Open close Principle을 따르도록 해야 하는 이유이다.

클래스를 참조할 때 Open Close Principle은 해당 동작을 구현하기 위해 추상 클래스(인터페이스)와 구체적인 클래스를 사용하여 보장될 수 있다.
이는 추상 클래스를 변경하는 대신 추상 클래스를 확장하는 구현 클래스를 갖도록 강제한다.
몇 가지 특별한 사례로 템플릿 패턴과 전략 패턴이 있다.

## Liskov's Substitution Principle

Barbara Liskov가 1987년 객체 지향 프로그래밍 시스템 언어 및 응용 프로그램 회의에서 데이터 추상화 및 계층 구조에 소개한 내용이다.

파생 유형은 기본 유형을 완전히 대체할 수 있어야 한다.
이 원칙은 동작 측면에서 Open Close 원칙의 확장일 뿐이다.
즉, 새로운 파생 클래스가 동작을 변경하지 않고 기본 클래스를 확장하는지 확인해야 한다.
새로운 파생 클래스는 코드를 변경하지 않고도 기본 클래스를 대체할 수 있어야 한다.

## Interface Segregation Principle

클라이언트는 자신이 사용하지 않는 인터페이스에 의존하도록 강요해서는 안 된다.
이 원칙은 인터페이스 작성 방법에 주의를 기울이도록 한다.
인터페이스를 작성할 때 거기에 있어야 하는 메소드만 추가하도록 주의해야 한다.
거기에 있으면 안 되는 메서드를 추가하면 인터페이스를 구현하는 클래스도 해당 메서드를 구현해야 한다.
예를 들어 Worker라는 인터페이스를 만들고 점심 시간 메서드를 추가하면 모든 작업자가 이를 구현해야 한다.
작업자가 로봇이라면 어떻겠는가?
결론적으로 특정하지 않은 메소드를 포함하는 인터페이스를 오염된 인터페이스 또는 팻 인터페이스라고 한다.
우리는 이러한 것들을 피해야한다.

## Dependency Injection Principle

상위 수준 모듈은 하위 수준 모듈에 의존해서는 안 된다.
둘 다 추상화에 의존해야 한다.
추상화는 세부사항에 의존해서는 안 된다.
세부 사항은 추상화에 따라 달라진다.
종속성 역전 원칙에 따르면 상위 수준 모듈과 하위 수준 모듈을 분리하여 상위 수준 클래스와 하위 수준 클래스 사이에 추상화 계층을 두어야 한다.
세부 사항을 기반으로 추상화를 작성하는 대신 추상화를 기반으로 세부 사항을 작성해야 한다.

종속성 반전 또는 제어 반전은 종속성이 실현되는 방식을 나타내는 더 잘 알려진 용어이다.
전통적인 방식으로 소프트웨어 모듈(클래스, 프레임워크 등)에 다른 모듈이 필요할 때 초기화하고 해당 모듈에 대한 직접 참조를 보유한다.
이렇게 하면 2개의 모듈이 단단하게 결합된다.
이들을 분리하기 위해 첫 번째 모듈은 후크(속성, 매개변수)를 제공하고 종속성을 제어하는 외부 모듈은 두 번째 모듈에 대한 참조를 주입한다.

종속성 반전을 적용하면 종속성 모듈만 변경하면 다른 모듈에서 모듈을 쉽게 변경할 수 있다.
팩토리 및 추상 팩토리는 종속성 프레임워크로 사용될 수 있지만 이를 위한 제어 컨테이너 역전(Inversion of Control Container)이라는 특수 프레임워크가 있다.

# Creational Pattern

- [Singleton]()
- [Factory]()
- [Factory Method]()
- [Abstract Factory]()
- [Builder]()
- [Prototype]()
- [Object Pool]()

# Behavior Pattern

- [Chain of Responsibility]()
- [Command]()
- [Interpreter]()
- [Iterator]()
- [Mediator]()
- [Memento]()
- [Observer]()
- [Strategy]()
- [Template Method]()
- [Visitor]()
- [Null Object]()

# Structural Pattern

- [Adapter]()
- [Bridge]()
- [Composite]()
- [Decorator]()
- [Flyweight]()
- [Proxy]()
