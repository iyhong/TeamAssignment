package grammer2.no10;

/*다음 자바 코드 실행시 출력되는 결과는?
package com.zeroday.one;*/

/*
	① 이름: 나이:0
	② 이름: guest/나이:0
	③ 이름: admin/나이:30
	④ Compilation error.
	⑤ Runtime exception.
*/
public class Grammer210_sangil {
 public static void main(String[] args) {
  Sub sub=new Sub("admin",30);
 }
}
class Super{
 String name;
 int age;
 
 Super(){}
 
 Super(String str, int val){
  name=str;
  age=val;
 }
}
class Sub extends Super{
 Sub(String str, int val){
  if(name.equals("")){
   name="guest";
  }
  if(age<1 || age>200){
   age=0;
  }
  System.out.println("이름:"+name+"/나이:"+age);
 }
}

