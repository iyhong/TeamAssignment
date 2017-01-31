package grammer2.no01;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
/*
	다음 자바 코드 실행시 출력되는 결과는?
	모든글자를 출력하기 위해선 어떻게 해야 하나요?
	team4.txt파일을 만들어 그 안에 'we can do it' 문자를 넣으세요.
	test.txt파일은 읽기전용파일이며 파일내용은 다음과 같다.
	TEAM4BIGTOWER
*/
public class Grammer201_inyong {
	static String path = System.getProperty("user.dir");
	static String fileName = path+"\\WebContent\\file\\test.txt";
	static FileInputStream fis = null;

	public static void main(String[] args) {
		System.out.println(fileName);
		try {
			fis = new FileInputStream(fileName);
			//이대로 실행하면 TA4ITWR 가 출력되는데 이유는
			//read()메서드를 한번 호출하면 커서의 값을 리턴하고 한칸이동한다.
			//그런데 do while문 안에서 출력을 하고 조건비교하면서 한번더 실행되므로
			//값을 리턴하고 다음칸으로 넘어간 상태에서 다시 반복을 하게되니
			//다음 출력할때의 커서는 E를 건너뛴 A를 출력하게 된다.
			/*do {
				System.out.print((char) fis.read());
			} while (fis.read() != -1);*/
			int word;
			while((word = fis.read())!= -1){
				System.out.print((char)word);
			}
		} catch (FileNotFoundException e) {
			System.out.println("FileNotFoundException 발생");
		} catch (IOException e) {
			System.out.println("IOException 발생");
		} finally {
			try {
				fis.close();
			} catch (IOException e) {
				System.out.println("file.close():예외발생");
			}
		}
		
		makeFile();	
	}
	public static void makeFile(){
		//파일 생성할 디렉토리 경로 설정 System.getProperty("user.dir")은 프로젝트의 root경로를 가져옴
		String dir = System.getProperty("user.dir")+"\\WebContent\\file\\";
		//파일을 만들 경로와 파일이름으로 File 객체 생성
		File file = new File(dir,"team4.txt");
		try {
			//FileWriter 객체를 file 객체로 생성하면 team4.txt파일이 생성된다.
			FileWriter fw = new FileWriter(file);
			//생성된 파일에 해당 문자열을 버퍼에 쓴다
			fw.write("we can do it");
			//flush하면 버퍼에 쓰인 문자열을 한꺼번에 보낸다.
			fw.flush();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
