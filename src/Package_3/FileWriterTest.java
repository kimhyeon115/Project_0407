package Package_3;

import java.io.FileWriter;
import java.io.IOException;

public class FileWriterTest {

	public static void main(String[] args) {
		try(FileWriter fw = new FileWriter("write.txt")) {
			//문자열(UTF-8)로 인코딩
			fw.write("A");
			char[] cbuf = {'B', 'C', 'D'};
			fw.write(cbuf);
			fw.write("안녕하세요");
			fw.write("項羽");
			fw.write(cbuf, 1, 2);
			fw.write("123");
		}catch(IOException e) {
			System.out.println(e);
		}
	}
}