package lotto;

import camp.nextstep.edu.missionutils.Console;

public class BuyLotto {
    public static Integer buyLotto() {
        Integer money = purchase();
        int lottoTickets = money / 1000;

        System.out.println(lottoTickets + "개를 구매했습니다.");
        return lottoTickets;
    }

    public static Integer purchase() {
        System.out.println("구입금액을 입력해 주세요.");
        Integer input = Integer.valueOf(Console.readLine());

        System.out.println("구입금액: " + input);
        return input;
    }
}
