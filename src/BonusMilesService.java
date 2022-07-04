public class BonusMilesService {
    public int calculate(int price) {
        int cost = 20; // 20 руб. за 1 миллю
        int miles = price / cost; // кол-во целых миль
        return miles;
    }
}
