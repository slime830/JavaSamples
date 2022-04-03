package p_4;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class FileInput {
    // ファイル読み込み
    public static void main(String args[]) {
        // ファイル読み込み
        // 例のごとく、以下テンプレ
        try {
            BufferedReader br = new BufferedReader(new FileReader("./p_4/input.txt"));
            String oneline;

            while ((oneline = br.readLine()) != null) {// ファイルの最後まで一行ずつ読み込み
                System.out.println(oneline);
            }
            br.close();
        } catch (IOException ioException) {
            ioException.printStackTrace();
        }
    }
}
