package javabook15;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardCopyOption;
import java.util.List;

public class FileTestttt {

	public static void main(String[] args) throws IOException {
		
		Path dataFile = Paths.get("data1.txt");
		List<String> lines = Files.readAllLines(dataFile);
		for(String line : lines) System.out.println(line);
		
		Path src = Paths.get("C:/Windows/explorer.exe");
		Path target = Paths.get("D:my_explorer2.exe");
		Files.copy(src,  target, StandardCopyOption.REPLACE_EXISTING);
		System.out.println("복사 완료");
	}

}
