package p_4;

import java.io.*;// BufferedReader等を使うには、この一文が必要

public class StandardInput {
    // 標準入力（プログラム実行中に、ユーザにターミナル上から入力させる）の書き方
    public static void main(String[] args) {
        // 標準入力する際のテンプレート
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        // BufferdReaderはこの後の「ファイル読み込み」でも使う
        // InputStreamReaderだけでも動かすことは可能だが、BufferdReaderの方が高機能なため、こちらが主流
        String inputString;

        try {
            do {
                System.out.println("input something string \"exit\" to finish input");
                inputString = br.readLine();// readlineで読み込み
                System.out.println(inputString);
            } while (inputString.equals("exit"));

            br.close();// クローズを忘れない（closeしないと、brに当たるメモリが解放されない）（解放って何かって？？ うーん、調べて！！）
        } catch (IOException ioException) {// readlineは例外を投げる
            ioException.printStackTrace();
        }

    }
}
