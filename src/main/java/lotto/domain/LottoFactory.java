package lotto.domain;

import java.util.ArrayList;
import java.util.List;
import lotto.util.random.RandomGenerater;

public class LottoFactory {

    public Lotto createLotto() {
        List<Integer> randomNumbers = RandomGenerater.randomLottoGenerater();
        return new Lotto(randomNumbers);
    }

    public Lottos createLottos(int money) {
        int lottoCount = money / 1000;
        List<Lotto> lottoList = new ArrayList<>();
        for (int i = 0; i < lottoCount; i++) {
            lottoList.add(createLotto());
        }
        return new Lottos(lottoList);
    }

}
