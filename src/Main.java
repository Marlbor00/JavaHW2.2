public class Main {
    public static void main(String[] args) {
        int account = 1000;
        int add = 1500;
        int finalaccount;
        if (add > 999) {
            finalaccount = account + add + add / 100;
            System.out.println("Итоговый счет: " + finalaccount + " рублей");
            System.out.println("Бонусных рублей: " + add/100 + " рублей");
        }else{
             finalaccount = account + add;
            System.out.println("Итоговый счет: " + finalaccount + " рублей");}

    }

}
