public class TabularOutput {
    public static void main(String[] args) {

        System.out.printf("%-3s %-6s %-7s %-7s%n", "N", "10*N", "100*N", "1000*N");

        for (int i = 1; i <= 5; i++){
            int newValue = i * 10;
            int newValue1 = i * 100;
            int newValue2 = i * 1000;

            System.out.printf("%-4d%-8d%-10d%-8d%n", i, newValue, newValue1, newValue2);
        }


        }

}
