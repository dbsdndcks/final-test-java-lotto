package lotto.service;

import lotto.domain.LottoFactory;
import lotto.domain.Lottos;

public class LottoService {

    private LottoFactory lottoFactory;

    public LottoService(LottoFactory lottoFactory) {
        this.lottoFactory = lottoFactory;
    }

    public Lottos createLottos(int money) {
        return lottoFactory.createLottos(money);
    }
}
