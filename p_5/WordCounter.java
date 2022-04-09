package p_5;

import java.util.*;
import java.io.*;

public class WordCounter {
    // HashMapの応用として、ファイル中の単語の出現数をカウントするプログラムを説明します
    // 最後（のつもり）なので、今までの復習もかねて、ちゃんと書きます
    // 今までに説明していない箇所は、適宜せつめいします

    private String filepath;
    private HashMap<String, Integer> wordCountMap = new HashMap<>();// 実は、右の<>の中身は省略可能（バージョンによる）

    WordCounter(String filepath) {
        this.filepath = filepath;
    }

    void setFilepath(String filepath) {
        this.filepath = filepath;
    }

    void setWordCountMap(HashMap<String, Integer> wordCountMap) {
        this.wordCountMap = wordCountMap;
    }

    String getFilepath() {
        return this.filepath;
    }

    HashMap<String, Integer> getWordCountMap() {
        return this.wordCountMap;
    }

    void resetWordCountMap() {
        this.wordCountMap = new HashMap<String, Integer>();
    }

    private ArrayList<String[]> readFile() {
        ArrayList<String[]> result = new ArrayList<>();// 実は、右の<>の中身は省略可能（バージョンによる）
        try {
            BufferedReader br = new BufferedReader(new FileReader(this.filepath));
            String inputString;
            while ((inputString = br.readLine()) != null) {
                result.add(inputString.split(" "));// split(区切り文字)で、その文字で区切った配列が帰ってくる。今回はスペースで区切った
            }
            br.close();
        } catch (IOException ioException) {
            ioException.printStackTrace();
        }

        return result;
    }

    void wordCount() {
        ArrayList<String[]> readResult = readFile();
        for (String[] split : readResult) {
            for (String word : split) {
                if (this.wordCountMap.containsKey(word)) {// containsKey(キー)で、そのキーが既にHashMapに存在するか調べられる 存在したらtrueを返す
                    this.wordCountMap.put(word, this.wordCountMap.get(word) + 1);// key:word,value:get(word)+1
                                                                                 // で再度putする。("hello",1)->("hello",1+1)って感じ、
                } else {// 未知の単語
                    this.wordCountMap.put(word, 1);// 未知の単語の出現回数は1
                }
            }
        }

    }

    public static void main(String[] args) {
        WordCounter wordCounter = new WordCounter("./p_5/input.txt");
        wordCounter.wordCount();
        for (String key : wordCounter.wordCountMap.keySet()) {
            System.out.print(key);
            System.out.print(" ");
            System.out.println(wordCounter.wordCountMap.get(key));
        }

    }

}
