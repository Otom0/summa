public class Main {
    public static void main(String[] args) {
//        Container container = new Container();
//        container.count += 7843;
        System.out.println(sumDigits(12345));
    }

    public static Integer sumDigits(Integer number) {

        String summa = number.toString();
        int b = 0;
        for (int i = 0; i < summa.length(); i++) {
            String s = String.valueOf(summa.charAt(i));
            b += Integer.parseInt(s);
        }
//        System.out.println(summa.charAt(1));
//        int firstNumber = Integer.parseInt(String.valueOf(summa.charAt(0)));
//        int secondNumber = Integer.parseInt(String.valueOf(summa.charAt(1)));
//        int thirdNumber = Integer.parseInt(String.valueOf(summa.charAt(2)));
//        int result = firstNumber + secondNumber + thirdNumber;
//        System.out.println(result);
        //@TODO: write code here

        return b;
    }
}
