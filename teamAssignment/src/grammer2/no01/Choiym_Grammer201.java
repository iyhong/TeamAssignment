package grammer2.no01;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
/*
	다음 자바 코드 실행시 출력되는 결과는?
	모든글자를 출력하기 위해선 어떻게 해야 하나요?
	team4.txt파일을 만들어 그 안에 'we can do it' 문자를 넣으세요.
	test.txt파일은 읽기전용파일이며 파일내용은 다음과 같다.
	TEAM4BIGTOWER
*/
public class Choiym_Grammer201 {
	static String fileName = "test.txt";
	static FileInputStream fis = null;

	public static void main(String[] args) {
		try {
			fis = new FileInputStream(fileName);
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
	}
}
