
# 객체 지향 언어

## 특징
- 상속 ( inheritance )
  - 자식 클래스가 부모 클래스의 특성과 기능을 물려받는 것
- 다형성  ( polymorphism )
  - 하나의 객체 혹은 메소드가 여러 타입을 참조할 수 있음을 의미한다.
  - 객체의 다형성, 메소드의 다형성
- 캡슐화 ( encapsulation ) ( 정보 은닉 )
  - 접근제어자 public, protected, default, private
  - 속성과 행위를 목적에 적합하게 묶어서 독립된 단위로 구성
- 추상화 ( abstraction )
  - 객체들의 공통 속성과 행위를 추출

## 원칙
- 단일 책임 원칙
  - 한 클래스는 하나의 책임만 가져야 한다.
- 개방 폐쇄 원칙
  - 확장에는 열려(Open) 있으나, 변경에는 닫혀(Closed)있어야 한다.
- 리스코프 치환 원칙
  - 프로그램의 객체는 프로그램의 정확성을 깨뜨리지 않으면서 하위 타입의 인스턴스로 바꿀 수 있어야 한다.
- 인터페이스 분리 원칙
  - 특정 클라이언트를 위한 인터페이스 여러 개가 범용 인터페이스 하나보다 낫다.
- 의존관계 역전 원칙
  - 추상화에 의존한다. 구체화에 의존하면 안된다. 