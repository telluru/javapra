public class java2n2{
  public static void main(String[] args){
    String[] i = {"大吉","中吉","小吉","凶"};
    System.out.println("ようこそ占いの館へ");
    System.out.println("名前を教えてください");
    String name = new java.util.Scanner(System.in).nextLine();
    System.out.println("歳を教えてください");
    String ageString = new java.util.Scanner(System.in).nextLine();
    int age = Integer.parseInt(ageString);
    int fortune = new java.util.Random().nextInt(4);
    fortune++;
    System.out.println("占いの結果が出ました！");
    System.out.println(age+"歳の"+name+"さん、あなたの運気番号は"+fortune+"です");
    System.out.println("運勢は"+ i[fortune]);
  }
}
