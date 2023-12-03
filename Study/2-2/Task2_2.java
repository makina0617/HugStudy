public class Task2_2 {
    public static void main(String[] args) {
        // ①「JAPAN」、「AMERICA」、「KOREA」、「ENGLAND」を要素の値（初期値）とする配列 countryを作成しなさい。
        String[] contry = new String[4];

        contry[0] = "JAPAN";
        contry[1] = "AMERICA";
        contry[2] = "KOREA";
        contry[3] = "ENGLAND";

        // ② ①で作成した配列の要素数を出力して下さい。
        System.out.println(contry.length);

        // * ③下記の値を保持した、要素数3のStringクラスの配列strArrayを作成しなさい。
        String[] strArray = new String[3];

        strArray[0] = "りんご";
        strArray[1] = "もも";
        strArray[2] = "ぶどう";

        // ④ ③で作成した配列の3番目の要素を出力しなさい。
        System.out.println(strArray[2]);

        /*
         * ⑤下記の処理について、何をしているのかコメントを記入して下さい。
         * [10,20,30,40,50を要素の値とする要素数５のintArrayという名前のint型配列を宣言]
         */
        int[] intArray = { 10, 20, 30, 40, 50 };

        // ⑥下記の処理について、何をしているのかコメントを記入して下さい。
        // [配列変数strArryの1番目の要素と配列変数strArryの5番目の要素を足して出力]
        System.out.println(intArray[0] + intArray[4]);
    }
}