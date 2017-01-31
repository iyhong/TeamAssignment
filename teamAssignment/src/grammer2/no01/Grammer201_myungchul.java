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
public class Grammer201_myungchul {
	static String path = "C:\\sw\\git\\TeamAssignment\\teamAssignment\\WebContent\\file\\";
	static String fileName01 = path + "test.txt";
	static String fileName02 =path + "team4.txt";
	static FileInputStream fis = null;
	
	
	public static void main(String[] args) {
		try {
			fis = new FileInputStream(fileName01);
			do {
				System.out.print((char) fis.read());
			} while (fis.read() != -1);
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
		fileMake();
	}
	public static void fileMake(){
		
		try{
			
			File file = new File(fileName02);
			FileWriter fw = new FileWriter(file, true);
			
			fw.write("we can do it");//fw 안에 데이터 입력
			fw.flush();//입력이 완료 될떄 메소드를 통해서 저장한다.
			
			fw.close();//파일을 닫는다.
		}catch(Exception e){
			e.printStackTrace();
			System.out.println("Exception 발생");
		}
		
	}
}
