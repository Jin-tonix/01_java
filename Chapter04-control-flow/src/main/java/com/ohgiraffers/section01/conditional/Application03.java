package com.ohgiraffers.section01.conditional;
// 프로그램내에서 모두가 사용할 수 있는 application03이라는 클래스를 선언한다.
public class Application03 {//application03의 시작
    //프로그램이 시작시 바로 사용할 수 있도록 static 영역에 main이라는 함수를 만들고 문자열 배열의 타입을 가진 args라는 변수를 선언한다.
    public static void main(String[] args) {//main의 시작
        //D_switch라는 자료형을 가진 dSwitch라는 변수를 만들고 D_switch타입으로 값을 제공한다.
        //D_switch는 사용자 정의 자료형으로써 타입은 우리가 만든 D_Switch를 확인해야한다.
               //dSwitch 변수가 가지고 있는 testSimple메소드를 실행한다.

        // 0. D_switch를 만든다.
        D_switch dSwitch = new D_switch();
        //1. 값을 반환 받는다.
        //double result = dswitch.switchCalculator();
       dSwitch.switchCalculator();


        dSwitch.Calculator2();

    }//main의 종료





}//application03의 종료
