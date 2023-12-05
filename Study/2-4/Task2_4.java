public class Task2_4 {
    // 定数（アカウント情報）
    // 登録されている名前（USER_NAME）とパスワード（USER_PASSWORD）を定数で定義。
    private static final String USER_NAME = "alice";
    private static final String USER_PASSWORD = "alice123";

    // 定数（メッセージ）
    private static final String CONST_MSG_SUCCESS = "ログイン成功です。";
    private static final String CONST_MSG_ERROR_NAME = "名前に誤りがあります。";
    private static final String CONST_MSG_ERROR_PASS = "パスワードに誤りがあります。";
    private static final String CONST_MSG_ERROR_INPUT = "入力情報に誤りがあります。";

    // 補足:
    // 定数は①〜④で使い回すために定義しておきます。
    // final修飾子を付与すると、変数（動的に変わる値）ではなく、定数（変更不可な定まった値）となります。
    // 「ここへ記述」部分へ適当な値を記述しましょう。

    public static void main(String[] args) {
        // 以下の変数「name」「pass」を使用して、①〜④の条件を満たす処理を記述して下さい。
        // nameとpassはログイン画面からの入力値だと想定してみましょう。

        String name = "alice";
        String pass = "alice123";

        // ① 「name」の値が「USER_NAME」と等しく、「 pass 」の値が「USER_PASSWORD」と等しい場合。
        // 定数を使用して「 ログイン成功です 」と出力して下さい。
        if (USER_NAME.equals("alice") && name.equals("alice") && USER_PASSWORD.equals("alice123")
                && pass.equals("alice123")) {
            System.out.println(CONST_MSG_SUCCESS);

            // ② 「USER_RNAME」の値のみ等しい場合。
            // 定数を使用して「 パスワードに誤りがあります。 」 と出力して下さい。
        } else if (USER_NAME.equals("alice") && name.equals("alice")) {
            System.out.println(CONST_MSG_ERROR_PASS);

            // ③ 「USER_PASSWORD」の値のみ等しい場合。
            // 定数を使用して「 名前に誤りがあります。 」と出力して下さい。
        } else if (USER_PASSWORD.equals("alice123") && pass.equals("alice123")) {
            System.out.println(CONST_MSG_ERROR_NAME);

            // ④ 「USER_NAME」も「USER_PASSWORD」の値も間違っていた場合。
            // 定数を使用して「 入力情報に誤りがあります。 」と出力して下さい。
        } else {
            System.out.println(CONST_MSG_ERROR_INPUT);
        }

    }
}