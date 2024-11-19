package lotto.config;

import java.util.ArrayList;
import lotto.controller.LottoController;
import lotto.domain.LottoFactory;
import lotto.domain.Lottos;
import lotto.service.LottoService;
import lotto.view.InputView;
import lotto.view.OutputView;

public class AppConfig {
    public LottoController lottoController() {
        return  new LottoController(InputView(), outputView(), lottoService());
    }

    private InputView InputView() {
        return new InputView();
    }

    private OutputView outputView() {
        return new OutputView();
    }

    private LottoService lottoService() {
        return new LottoService(lottoFactory());
    }

    private LottoFactory lottoFactory() {
        return new LottoFactory();
    }
}
