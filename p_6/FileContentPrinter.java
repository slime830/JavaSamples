package p_6;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class FileContentPrinter {
    private String inputFilepath;

    FileContentPrinter(String inputFilepath) {
        this.inputFilepath = inputFilepath;
    }

    private String getInputFilepath() {
        return this.inputFilepath;
    }

    private void setInputFilepath(String inputFilepath) {
        this.inputFilepath = inputFilepath;
    }

    private void printFileContent() {
        try {
            BufferedReader br = new BufferedReader(new FileReader(this.inputFilepath));
            String oneline;

            while ((oneline = br.readLine()) != null) {
                System.out.println(oneline);
            }
            br.close();
        } catch (IOException ioException) {
            ioException.printStackTrace();
        }
    }

    public static void main(String[] args) {
        String inputFilepath = "";
        if (args.length == 1) {
            inputFilepath = args[0];
        } else {
            System.out.println("Usage: you can run this program with two params\nex:");
            System.out.println("\"java p_6.FileContentPrinter ./p_6/hoge.txt\"");
            System.exit(1);
        }
        FileContentPrinter printer = new FileContentPrinter(inputFilepath);
        printer.printFileContent();
    }
}