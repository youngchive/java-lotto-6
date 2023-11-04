package lotto;

public class Application {
    public static void main(String[] args) {
        // TODO: 프로그램 구현
        BuyLotto lottos = new BuyLotto();
        lottos.buyLotto();
        Numbers numbers = new Numbers();
        numbers.enterWinningNumbers();
    }
}
