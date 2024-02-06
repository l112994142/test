public class TestMethod {
    public int test1(int x, int y) {
        return 8 * x + 11 * y;
    }

    public int test2(int x, int y, int z) {
        return test1(x, y) + 20 * z;
    }

    public double test3(int x, int y, int z) {
        return 8 * x + 11 * y * 0.8 + 20 * z;
    }

    public double test4(int x, int y, int z) {
        double price = test3(x, y, z);
        if (price>=100){
            int a = (int) Math.floor(price/100);
            price = price-10*a;
        }

        return price;
    }
}
