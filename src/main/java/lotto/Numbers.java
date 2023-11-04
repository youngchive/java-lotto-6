package lotto;

import camp.nextstep.edu.missionutils.Console;

public class Numbers {
    public static void enterWinningNumbers() {
        String input;
        System.out.println();
        System.out.println("당첨 번호 6개를 입력해주세요 (쉼표로 구분):");
        input = Console.readLine();

        String[] winningNumbers = input.split(",");
        if (winningNumbers.length != 6) {
            System.out.println("당첨 번호는 6개를 입력해야 합니다.");
            return;
        }

        System.out.println();
        System.out.println("보너스 번호를 입력해주세요:");
        input = Console.readLine();

        Integer bonusNumber = Integer.valueOf(input);

        System.out.print("당첨 번호: ");
        for (String number : winningNumbers) {
            System.out.print(number + " ");
        }
        System.out.println("보너스 번호: " + bonusNumber);
    }
}

