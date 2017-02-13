package grammer2.no10;

/*다음 자바 코드 실행시 출력되는 결과는?


/*① 이름:/나이:0
② 이름:guest/나이:0
③ 이름:admin/나이:30
④ Compilation error.
⑤ Runtime exception.
*/
public class Grammer210_YJ {
 public static void main(String[] args) {
	 Sub_YJ sub=new Sub_YJ("admin",30);
 }
}
class Super_YJ{
 String name;
 int age;

 Super_YJ(){}
 
 Super_YJ(String str, int val){
  name=str;
  age=val;
  System.out.println("Super_YJ :"+str);
  System.out.println("Super_YJ :"+val);
  System.out.println("name: "+ name );
  System.out.println("age : " + age);
 }
}
class Sub_YJ extends Super_YJ{
	Sub_YJ(String str, int val){
		name=str;
		age=val;
  if(name.equals("")){
   name="guest";
  }
  if(age<1 || age>200){
   age=0;
  }
  System.out.println("이름:"+name+"/나이:"+age);
 }
}
/* 
 * Sub_YJ 에 값을 셋팅 하고 Sub_YJ 클래스에서 받긴 하였지만 
 * Sub_YJ 가 상속받은 Super_YJ 클래스에 name,age 에 값이 셋팅 되지 않아서
 * NullPointerException이 나오게되는 것 같다.
 * name 에 str 값을 주거나 name 을 str로 바꾸면 실행된다
 * 
 
 * */

