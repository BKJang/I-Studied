# GradeTest

## 문제 설명

학생들의 평균 점수를 입력받는다.(단, 일렬로 받고 공백으로 점수를 구분한다.)

입력 받는 평균 점수에 대해 각각의 등급을 매겨 등급별 인원 수를 출력하는 프로그램을 작성하시오.

(90이상 100이하: A, 80이상 90미만 : B, 70이상 80미만 : C, 60이상 70미만 : D, 60미만 : F)

## class 설명

- IntegernumException class

입력되는 평균 점수들에 대한 Exception 처리(0이상 100이하)

- grade class

학생들의 평균 점수를 일렬로 입력 받고 이에 대해 각각의 등급을 매긴다.

매겨진 등급별 인원 수를 출력하는 method를 정의 => output()

- gradeTest class(main)

grade class의 객체를 생성하고 등급별 인원 수를 출력한다.
