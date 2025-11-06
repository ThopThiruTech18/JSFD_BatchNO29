package no06.in.versionit.splitorator;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.stream.Stream;

public class ReadAllTheLines {

	public static void main(String[] args) throws IOException {


		
		

		allLines();
		
		
//		  characterByChar();
		
//		   lineByLine();
		

	}

	private static void lineByLine() {
		try (BufferedReader br = new BufferedReader(new FileReader("C:\\\\\\\\Users\\\\\\\\hp\\\\\\\\Desktop\\\\\\\\VERSION_IT\\\\\\\\BATCH_NO29\\\\\\\\BATCHNO_WorkSPace\\\\\\\\No07Java8\\\\\\\\src\\\\\\\\info.txt"))) {
	            String line;
	            while ((line = br.readLine()) != null) {
	                System.out.println(line);
	            }
	        } catch (IOException e) {
	            e.printStackTrace();
	        }
	}

	private static void characterByChar() {
		try (FileReader fr = new FileReader("C:\\\\Users\\\\hp\\\\Desktop\\\\VERSION_IT\\\\BATCH_NO29\\\\BATCHNO_WorkSPace\\\\No07Java8\\\\src\\\\info.txt")) {
	            int ch;
	            while ((ch = fr.read()) != -1) {
	                System.out.print((char) ch);
	            }
	        } catch (IOException e) {
	            e.printStackTrace();
	        }
	}

	private static void allLines() {
		String filename = "C:\\Users\\hp\\Desktop\\VERSION_IT\\BATCH_NO29\\BATCHNO_WorkSPace\\No07Java8\\src\\info.txt";

		try (Stream<String> stream = Files.lines(Paths.get(filename))) {

			stream.forEach(line -> System.out.println(line));

		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
