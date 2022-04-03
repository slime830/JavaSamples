package p_4;

import java.io.*;

public class FileOutput {
    // ファイル書き出し
    public static void main(String args[]) {
        try {
            // ファイル書き込みをおこなうBufferedWriter
            BufferedWriter bw = new BufferedWriter(new FileWriter("output.txt"));
            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

            String inputString;

            do {
                System.out.println("input something string \"exit\" to finish input");
                inputString = br.readLine();// 標準入力

                bw.write(inputString);// 読み込んだ文字列をファイルに出力
                bw.newLine();// 改行
            } while (inputString.equals("exit"));

            bw.close();
            br.close();
        } catch (IOException ioException) {
            ioException.printStackTrace();
        }
    }
}
