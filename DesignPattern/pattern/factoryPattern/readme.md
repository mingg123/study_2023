### 팩토리 패턴 https://github.com/mingg123/study_2023/commit/64dceebdc417150b3cf634d0815bfab993fb5e76
- 인스턴스를 만드는 부분을 Factory라는 클래스로 분리함
- 왜? => 해당 클래스를 다른 곳에서 재사용 할 수 있음. 


### 팩토리 메소드 패턴 https://github.com/mingg123/study_2023/commit/e7d5c5826d1908e75f8be2c13cd2d645277fdf99
- 인스턴스 만드는 행동을 캡슐화 해줌 (객체를 생성할 때)
- 어떤 클래스의 인스턴스를 만들지는 서브클레스에서 결정(중요) => 사용하는 서브클래스에 따라 생산되는 객체 인스턴스가 결정됨 
- createPizza 추상 메소드를 만들어, 서브클래스가 객체 생성을 책임지도록 함 
- Pizza와 PizzaStore를 분리함 (생산하는 부분과, 사용하는 부분을 분리할 수 있음. )
<img width="748" alt="image" src="https://github.com/user-attachments/assets/7f4d5077-48a7-4c9a-8e28-ce59dd501a6a">




### 의존성 뒤집기 DI(Dependency Inversion)
- pizzaStore가 피자 구성 클래스에 의존하고 있음. 
- 고수준 구성 요소가 저수준 구성요소에 의존하면 안됨. (PizzaStore 고수준, 피자 클래스는 저수준)
- 추상화된 것에 의존하게 만들고 구상 클래스에 의존하지 않게 만든다. 

<img width="755" alt="image" src="https://github.com/user-attachments/assets/b7559bdb-f21a-4836-adf5-32510fff1ed0">


### 해결안

<img width="752" alt="image" src="https://github.com/user-attachments/assets/a47cf32b-ec02-4299-9bbc-bb9956691d15">







### 추상 팩토리 패턴  https://github.com/mingg123/study_2023/commit/183bdd0760fa925c8bbc98300709753440478360

<img width="688" alt="image" src="https://github.com/user-attachments/assets/b5cf1231-8766-4d99-b10e-0af8940cbeae">




팩토리 메서드 vs 추상 팩토리 패턴 차이 (p 192)
- 팩토리 메소드: 상속으로 객체를 만듬(서브클래스에서 만듬)
- 추상 팩토리: 구성으로 객체를 만듬 (Factory 객체를 DI 받아서 위임함)

- 팩토리 메소드: if-else나 switch를 통해 서브클래스를 리턴
- 추상 팩토리: 하나의 팩토리를 더 만듬 

