package grammer2.no10;

/*다음 자바 코드 실행시 출력되는 결과는?
package com.zeroday.one;*/

<<<<<<< HEAD
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
=======
/*① 이름:/나이:0
② 이름:guest/나이:0
③ 이름:admin/나이:30
④ Compilation error.
⑤ Runtime exception.
*/
public class Grammer210_sangil{
 public static void main(String[] args) {
  Sub_si Sub_si=new Sub_si("admin",30); //Sub_si 클래스 메서드에 매개변수에 "admin", 30을 넣어 객체를 생성한다.
 }
}
class Super_si{
 String name;
 int age;
 
 Super_si(){}
 
 Super_si(String str, int val){
  name=str;
  age=val;
 }
}
class Sub_si extends Super_si{
 Sub_si(String str, int val){
 /* Super_si sup = new Super_si(str,val);
  String name = sup.name;
  int age = sup.age;*/
  
  if(name.equals("")){ //name값은 부모클래스인 Super_si클래스의 지역변수로 자식클래스에서 참조할 수 있으나 객체를 생성해서 가져와야 한다.
	  				   //위 코딩을 추가하면 name변수를 참조할 수 있어 null point exception이 뜨지 않는다.
	  				   //이 조건문을 true로 떨어뜨릴려면 name값이 null이면 true가 떨어지는 조건문을 세운다. if(name==null)
>>>>>>> branch 'master' of https://github.com/loverman85/TeamAssignment.git
   name="guest";
  }
  if(age<1 || age>200){
   age=0;
  }
  System.out.println("이름:"+name+"/나이:"+age);
 }
}

