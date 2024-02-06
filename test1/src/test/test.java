public class test {
    public static void main(String[] args) {
        TestMethod testMethod = new TestMethod();
        int answer1 = testMethod.test1(6, 2);
        int answer2 = testMethod.test2(6, 2,100);
        double answer3 = testMethod.test3(6, 2,100);
        double answer4 = testMethod.test4(6, 2,100);
        System.out.println(answer1);
        System.out.println(answer2);
        System.out.println(answer3);
        System.out.println(answer4);

    }

}
