# Java のサンプルコード

私が今後 Java を使ってシステム開発を行っていくので、これを機に、
復習しつつ自分でサンプルコードを作成してみることにしました。
（決して説明がうまいとは言えませんが）

## 環境

- OS: Ubuntu / Windows10 (Windows Subsystem for Linux)
- 言語: Java（openjdk 11.0.13）

Java の特性上、JDK さえ一致してれば、Windows であっても動作が一致するはず
初学者向けに、[WindowsJavaSetup.md](./WindowsJavaSetup.md)に Windows 版の Java 構築方法をまとめてます。

## 実行方法

例

- コンパイル

```sh
javac p_0/Sample.java
```

- 実行

```sh
java p_0.Sample
```

## 各章

1. プログラムの基礎（変数の宣言・条件分岐・繰り返し処理・配列の基本計算・配列の動的メモリ確保）
2. クラスの基礎（コンストラクタ・メンバ変数・メンバメソッド・アクセス修飾子・定数・静的変数）
3. クラスの応用（親/子クラス・抽象クラス）・インタフェース・例外処理
4. 入出力（標準入力・ファイル入力・ファイル出力）
5. コレクション（ArrayList・LinkedList・HashMap・HashMap の応用（単語数の数え上げ））
