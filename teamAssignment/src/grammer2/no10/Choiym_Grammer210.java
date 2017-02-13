package grammer2.no10;

/*다음 자바 코드 실행시 출력되는 결과는?
package com.zeroday.one;*/

/*① 이름:/나이:0
② 이름:guest/나이:0
③ 이름:admin/나이:30
④ Compilation error.
⑤ Runtime exception.
*/
public class Choiym_Grammer210 {
 public static void main(String[] args) {
  Sub sub=new Sub("admin",30);
  //Sub 클래스타입의 sub객체참조변수를 선언하고 Sub클래스에 매개변수로 admin과 30을 입력한 객체의
  //주소값을 대입한다.
  
  //Sub는 Super를 상속받았지만 필드변수가 default로 선언되어있기때문에 String name과 int age는
  //상속되지 않는다. 따라서 nullpoint 예외가 발생하게된다.
 }
}
class Super{
 String name;
 int age;
 //Super클래스의 필드변수 name, age 
 //접근지정자가 생략되이있으므로 접근지정자는 default 
 Super(){}
 //Super클래스의 생성자메소드
 
 Super(String str, int val){
  name=str;
  age=val;
 }
 //Super클래스의 생성자메소드를 오버라이딩해서 매개변수로 String타입의 str과 int 타입의 val을 받고
 //입력된 str을 name에 대입하고 val은 age에 대입
}
class Sub extends Super{
	//Super클래스를 상속받은 Sub클래스
 Sub(String str, int val){
  if(name.equals("")){
   name="guest";
  }
  if(age<1 || age>200){
   age=0;
  }
  System.out.println("이름:"+name+"/나이:"+age);
 }
 //Sub클래스의 생성자메소드 매개변수로 String타입의 str과 int타입의 val을 입력받고
 //만약 name이 공백과 같으면 name에 guest라는 문자열을 대입하고 만약 age가 1보다 작거나 200보다 크면
 //age에 0을 대입하고 콘솔창에 이름 : name /나이 : age를 출력한다.
}

