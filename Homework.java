import java.io.File;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;

public class ConsoleRedactor {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		File file1 = new File("yourtext.txt");
		Scanner scanner = new Scanner(System.in);
		String line;
		System.out.println("Imput your text and to go to a new line, press enter");
		System.out.println("Leave the line blank and press Enter to complete.");
		try (PrintWriter writer = new PrintWriter(file1)) {
			for (;;) {
				System.out.print("> ");
				line = scanner.nextLine();
				if (line.isEmpty()) {
					break;
				}
				writer.println(line);
				writer.flush();
			}

			System.out.println("your text saved " + file1.getAbsolutePath());
		} catch (IOException e) {
			System.out.println("file saving error" + e.getMessage());
		}

		scanner.close();
	}
}
