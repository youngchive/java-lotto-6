package lotto;

import camp.nextstep.edu.missionutils.Randoms;

import java.util.Collections;
import java.util.List;

public class Lotto {
    private final List<Integer> numbers;

    public Lotto(List<Integer> numbers) {
        validate(numbers);
        this.numbers = numbers;
    }

    private void validate(List<Integer> numbers) {
        if (numbers.size() != 6) {
            throw new IllegalArgumentException();
        }
    }


    public static Lotto generateRandomLotto() {
        List<Integer> randomNumbers = Randoms.pickUniqueNumbersInRange(1, 45, 6);
        Collections.sort(randomNumbers); // 숫자를 오름차순으로 정렬
        return new Lotto(randomNumbers);
    }

    public List<Integer> getNumbers() {
        return numbers;
    }

    public static void main(String[] args) {
        Lotto lotto = Lotto.generateRandomLotto();
        List<Integer> numbers = lotto.getNumbers();

        System.out.print("로또 번호: [");
        for (int i = 0; i < numbers.size(); i++) {
            System.out.print(numbers.get(i));
            if (i < numbers.size() - 1) {
                System.out.print(", ");
            }
        }
        System.out.print("]");
    }
}
