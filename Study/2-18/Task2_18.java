public class Task2_18 {
    public static void main(String[] args) {
        // 問② Personクラスをインスタンス化し、名前「山田太郎」 年齢「23」 住所「東京都」 をカプセル化されたsetterで設定して下さい。
        Person person = new Person();
        person.setName("山田太郎");
        person.setAge(23);
        person.setAddles("東京都");
        // 問③ 設定した名前・年齢・住所をカプセル化されたgetterで呼び出してして下さい。
        person.getName();
        person.getAge();
        person.getAddles();
    }
}

class Person {
    private String name;
    private int age;
    private String addles;

    // 問① 上記変数に従って、getterとsetterを設定して下さい。
    public void setName(String n) {
        this.name = n;
        System.out.println("住所は、" + this.name + "です。");
    }

    public void setAge(int a) {
        this.age = a;
        System.out.println("年齢は、" + this.age + "才です。");
    }

    public void setAddles(String ad) {
        this.addles = ad;
        System.out.println("住所は、" + this.addles + "です。");
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public String getAddles() {
        return addles;
    }
}