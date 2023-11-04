package lotto;

import camp.nextstep.edu.missionutils.Console;

import java.util.ArrayList;
import java.util.List;

public class BuyLotto {
    public static List<Lotto> buyLotto() {
        Integer money = purchase();
        List<Lotto> randomlottoNumbers = new ArrayList<>();
        int lottoTickets = money / 1000;

        System.out.println();
        System.out.println(lottoTickets + "개를 구매했습니다.");
        // return lottoTickets;

        for (int i = 0; i < lottoTickets; i++) {
            Lotto lotto = Lotto.generateRandomLotto();
            List<Integer> numbers = lotto.getNumbers();

            System.out.print("[");
            for (int j = 0; j < numbers.size(); j++) {
                System.out.print(numbers.get(j));
                if (j < numbers.size() - 1) {
                    System.out.print(", ");
                }
            }
            System.out.println("]");
        }
        return randomlottoNumbers;
    }

    public static Integer purchase() {
        System.out.println("구입금액을 입력해 주세요.");
        Integer input = Integer.valueOf(Console.readLine());

        System.out.println("구입금액: " + input);
        return input;
    }
}
