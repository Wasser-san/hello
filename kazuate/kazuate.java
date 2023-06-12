import java.util.Scanner;

public class kazuate {
    public static void main(String[] args) {
        int targetNumber = generateTargetNumber(); // 設定された数を生成

        System.out.println("2桁の正の整数を予想して入力してください。");
        System.out.println("5回まで入力できます。");

        Scanner scanner = new Scanner(System.in);
        int attempts = 0;

        while (attempts < 5) {
            System.out.print("予想した数を入力してください: ");
            int guessedNumber = scanner.nextInt();

            if (guessedNumber == targetNumber) {
                System.out.println("当たり！");
                break;
            } else {
                if (guessedNumber > targetNumber) {
                    System.out.println("設定された数より大きいです。");
                } else {
                    System.out.println("設定された数より小さいです。");
                }

                if (Math.abs(guessedNumber - targetNumber) >= 20) {
                    System.out.println("20以上差があります。");
                }
            }

            attempts++;
        }

        if (attempts == 5) {
            System.out.println("5回の入力試行で外れました。");
            System.out.println("正解は " + targetNumber + " だよ。");
        }

        scanner.close();
    }

    private static int generateTargetNumber() {
        return (int) (Math.random() * 90) + 10; // 10以上99以下の乱数を生成
    }
}
