public class Task2_3 {
    public static void main(String[] args) {
        // ① 5 と 16 を加算した値を代入する、変数 plus を作成して下さい。
        int plus = 5 + 16;

        // ② 27 から 7 を減算した値を代入する、変数 minus を作成して下さい。
        int minus = 27 - 7;

        // ③下記の処理について、何をしているのかコメントを記入して下さい。
        // [10に2を掛けた値を代入する変数 multiply を作成]
        int multiply = 10 * 2;

        // ④ 20 を 6 で割った余りを代入する、変数 remi を作成して下さい。
        int remi = 20 % 6;

        // ⑤下記の処理について、何をしているのかコメントを記入して下さい。
        // [Stringクラスの town という名前の変数を宣言、値「中央」で初期化]
        // [Stringクラスの line という名前の変数を宣言、値「線」で初期化]

        String town = "中央";
        String line = "線";

        // ⑥ ⑤で作成した変数を連結させた値を代入する変数 train を作成して下さい。
        String train = town + line;

        // ⑦ 変数plus, minus, multiply, remi, train をそれぞれ出力して下さい。
        System.out.println(plus);
        System.out.println(minus);
        System.out.println(multiply);
        System.out.println(remi);
        System.out.println(train);
    }
}