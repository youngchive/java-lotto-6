package lotto;

import camp.nextstep.edu.missionutils.Console;

public class BuyLotto {
    public static Integer buyLotto() {
        System.out.println("구입금액을 입력해 주세요.");
        Integer input = Integer.valueOf(Console.readLine());

        System.out.println(input);
        return input;
    }
}
