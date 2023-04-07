package Package_3;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;

public class InputStreamReaderTest {

	public static void main(String[] args) {
		try(InputStreamReader irs = new InputStreamReader(new FileInputStream("reader.txt"))){	// UTF-8로 인코딩됨
//		new InputStreamReader까지가 inputStream Reader 생성자이고			
//		생성자 안에 기반스트림 new FlieInputStream("reader.txt")를 넣어 준것이다
//		이 때 inputStreamReader는 문자로 변환 해주는 것이다
//		( )안에 new FileInputStream("reader.txt")처럼 다른 스트림을 포함하는 것을 보조스트림이라고 한다			
			int i = 0;
			while((i=irs.read()) != -1) {
				System.out.print((char)i);
			}
		}catch(IOException e) {
			System.out.println(e);
		}
	}
}