import java.math.BigDecimal;

public class TestMethod {
    /*
    1、有一家超市，出售苹果和草莓。其中苹果 8 元/斤，草莓 13 元/斤。
    现在顾客 A 在超市购买了若干斤苹果和草莓，需要计算一共多少钱？
    请编写函数，对于 A 购买的水果斤数 (水果斤数为大于等于 0 的整数)，计算并返回所购买商品的总价。
     */
    public int test1(int x, int y) {
        return 8 * x + 13 * y;
    }
    /*
    2、超市增加了一种水果芒果，其定价为 20 元/斤。
    现在顾客 B 在超市购买了若干斤苹果、 草莓和芒果，需计算一共需要多少钱？
    请编写函数，对于 B 购买的水果斤数 (水果斤数为大于等于 0 的整数)，计算并返回所购买商品的总价。
     */
    public int test2(int x, int y, int z) {
        return test1(x, y) + 20 * z;
    }
    /*
    3、超市做促销活动，草莓限时打 8 折。
    现在顾客 C 在超市购买了若干斤苹果、 草莓和芒果，需计算一共需要多少钱？
    请编写函数，对于 C 购买的水果斤数 (水果斤数为大于等于 0 的整数)，计算并返回所购买商品的总价。

     */
    public double test3(int x, int y, int z) {
        return 8 * x + 13 * y * 0.8 + 20 * z;
    }
    /*
    4、促销活动效果明显，超市继续加大促销力度，购物满 100 减 10 块。
    现在顾客 D 在超市购买了若干斤苹果、 草莓和芒果，需计算一共需要多少钱？
    请编写函数，对于 D 购买的水果斤数 (水果斤数为大于等于 0 的整数)，计算并返回所购买商品的总价。
     */
    public double test4(int x, int y, int z) {
        double price = test3(x, y, z);
        if (price >= 100) {
            double a =Math.floor(price / 100);
            BigDecimal b1 = new BigDecimal(Double.toString(a));
            BigDecimal b2 = new BigDecimal(Double.toString(price));
            price = b2.subtract(b1.multiply(new BigDecimal(Double.toString(10)))).doubleValue();;
        }
        return price;
    }
}
