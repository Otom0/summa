public class Main {
    public static void main(String[] args) {
//        Container container = new Container();
//        container.count += 7843;
        sumDigits(256);
    }

    public static Integer sumDigits(Integer number) {
        String summa = number.toString();
        System.out.println(summa.charAt(1));
        int firstNumber = Integer.parseInt(String.valueOf(summa.charAt(0)));
        int secondNumber = Integer.parseInt(String.valueOf(summa.charAt(1)));
        int thirdNumber = Integer.parseInt(String.valueOf(summa.charAt(2)));
        int result = firstNumber + secondNumber + thirdNumber;
        System.out.println(result);
        //@TODO: write code here
        return 0;
    }
}
