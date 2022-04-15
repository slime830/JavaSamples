# WindosでのJava実行環境の構築

1. [OracleのJDKダウンロードページ](https://www.oracle.com/jp/java/technologies/javase/jdk14-archive-downloads.html)へアクセス  
2. Windows版のインストーラ（jdk-14.0.2_windows-x64_bin.exe)をダウンロード  
3. ダウンロード後インストーラを実行。基本的に「次へ」を連打すればよい。ただしインストール先を記録しておく（デフォルトでは`/Program Files/Java/jdk-14\bin`）
4. Windowsの「システムの詳細設定」を開き、「環境変数」をクリック
5. 上段の「ユーザ環境変数」内にあるPathをクリックし、編集を選択
6. 「新規」をクリックし、インストール先をコピペ（デフォルトでは`/Program Files/Java/jdk-14\bin`）して、「OK」  
7. 環境変数のウィンドウを「OK」で閉じ、「システムの詳細設定」のウィンドウも「OK」で閉じる  
8. コマンドプロンプトを起動し、`javac`というコマンドを実行し、オプション一覧が出力されれば成功  
