package grammer.no08;

import java.io.*;

public class Grammer08_inyong {
	public static void main(String[] args){
		
	
	}
}

/*
 *
 * 다음 프로그램중 컴파일시 에러가 발생하는 것은?
	답 찾고 
	모든 코드에 주석달아오기 오류가 나면 왜나는지 안나면 왜 안나는지?
	답은 1번
	부모클래스에서 접근제어자를 protected로 선언한 메서드를
	자식클래스에서 접근제어자 범위를 더 좁히는것은 안됨
	넓혀주는것은 됨
	
	부모클래스 메서드에서 예외를 던질때
	자식클래스에서 더큰범위의 예외를 던질수 없음
	더작은범위의 예외를 던지거나 안던지는것은 가능
①
class Parent {
 protected void test(int x) throws Exception{}
}
class Child extends Parent{
 @Override
 void test(int x) throws Exception{} 
}
/*
②

class Parent {
 protected void test(int x) throws Exception{}
}
class Child extends Parent{
 @Override
 public void test(int x) throws Exception{} 
}
/*
③

import java.io.*;
class Parent {
 protected void test(int x) throws Exception{}
}
class Child extends Parent{
 @Override
 protected void test(int x){}
}
/*
④

class Parent {
 protected void test(int x) throws Exception{}
}
class Child extends Parent{
 @Override
 protected void test(int x) throws IOException{}
}
 */


