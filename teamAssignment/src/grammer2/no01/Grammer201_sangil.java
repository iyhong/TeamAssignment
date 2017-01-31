package grammer2.no01;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;


/*
	다음 자바 코드 실행시 출력되는 결과는? test.txt가 없으므로 "FileNotFoundException 발생" 문자열이 출력된다.
	모든글자를 출력하기 위해선 어떻게 해야 하나요? Byte[] 배열을 미리 만들어서 test.txt의 문자열을 한번에 읽어들인 후에 그 size만큼
	 								읽어들이면 된다.
	team4.txt파일을 만들어 그 안에 'we can do it' 문자를 넣으세요.
	test.txt파일은 읽기전용파일이며 파일내용은 다음과 같다.
	TEAM4BIGTOWER
*/
public class Grammer201_sangil {
	
	static FileInputStream fis = null;
	
	
	
	public static void main(String[] args) {
		/*
		//새로운 파일을 만든다		
		try {
			//BufferedWriter를 이용해 파일 안에 데이터를 입력해 넣을 수 있다.
			BufferedWriter writer = new BufferedWriter(new FileWriter("C:\\Users\\USER\\Downloads\\JeongSangill\\team4.txt"));
			writer.write("we can do it");
			writer.newLine();
			writer.write("newLine이란 한줄 내리는 기능이지라~");
			writer.close();
			
			//BufferedReader는 위 파일에 쓴 내용들을 읽어들일 수 있다.
			BufferedReader reader = new BufferedReader(new FileReader("C:\\Users\\USER\\Downloads\\JeongSangill\\team4.txt")); 
			String data = "";
			
			//readLine이라는 메서드를 호출해서 한 라인씩 읽어들일 수 있다.
			while((data = reader.readLine())!= null){
				System.out.println(data);
			}
		}catch (FileNotFoundException e){
			System.out.print("File이 없다네");
			e.printStackTrace();
		}catch (IOException e) {
			System.out.print("경로가 존재하지 않는다네");
			e.printStackTrace();
		} 
		*/
		
		String filePath = "C:\\Users\\USER\\Downloads\\JeongSangill\\test.txt";
		try {			
			BufferedWriter testWriter = new BufferedWriter(new FileWriter(filePath));
			fis = new FileInputStream(filePath);
			testWriter.write("TEAM4BIGTOWER");
			testWriter.close();
			
			int fileSize = 100;
			byte[] b = new byte[fileSize];
			
			System.out.print(fis.read(b)); //test.txt 안에 데이터 크기만큼의 숫자값을 리턴
			
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
