package inputAndOuput;
import java.io.IOException;
import java.io.PrintWriter;
public class TestPrinterWriter {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		PrintWriter output = new PrintWriter(TestFile.file);
		output.println("I love xie shuhong ");
		output.print("xie shuhong is  so cute");
		output.close();
	}

}
