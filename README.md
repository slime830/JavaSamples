# Javaのサンプルコード
私が今後Javaを使ってシステム開発を行っていくので、これを機に、
復習しつつ自分でサンプルコードを作成してみることにしました。
（決して説明がうまいとは言えませんが）

## 環境
- OS: Ubuntu / Windows10 (Windows Subsystem for Linux)
- 言語: Java（openjdk 11.0.13）

Javaの特性上、JDKさえ一致してれば、Windowsであっても動作が一致するはず
初学者向けに、[WindowsJavaSetup.md](./WindowsJavaSetup.md)にWindows版のJava構築方法をまとめてます。

## 実行方法
例
- コンパイル  
```bash
javac p_0/Sample.java
```
- 実行  
```bash
java p_0.Sample
```

## 各章
1. プログラムの基礎（変数の宣言・条件分岐・繰り返し処理・配列の基本計算・配列の動的メモリ確保）
2. クラスの基礎（コンストラクタ・メンバ変数・メンバメソッド・アクセス修飾子・定数・静的変数）
3. クラスの応用（親/子クラス・抽象クラス）・インタフェース・例外処理
4. 入出力（標準入力・ファイル入力・ファイル出力）
5. コレクション（ArrayList・LinkedList・HashMap・HashMapの応用（単語数の数え上げ））
