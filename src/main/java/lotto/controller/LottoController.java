package lotto.controller;

import lotto.domain.BonusNumber;
import lotto.domain.Lottos;
import lotto.domain.WinningNumber;
import lotto.service.LottoService;
import lotto.util.parser.InputParser;
import lotto.util.validate.InputValidater;
import lotto.view.InputView;
import lotto.view.OutputView;

public class LottoController {

    private InputView inputView;
    private OutputView outputView;
    private LottoService lottoService;

    public LottoController(InputView inputView, OutputView outputView, LottoService lottoService) {
        this.inputView = inputView;
        this.outputView = outputView;
        this.lottoService = lottoService;
    }

    public void run() {
        Lottos lottos = createLotto();
        displayLottos(lottos);
//        WinningNumber winningNumber = createWinningNumber();
//        BonusNumber bonusNumber = createBonusNumber();

    }



    private Lottos createLotto() {
        while (true) {
            try {
                int money = validateAndParseInput();
                return lottoService.createLottos(money);
            } catch (IllegalArgumentException iae) {
                System.out.println(iae.getMessage());
            }
        }
    }

    private int validateAndParseInput() {
        String purchaseMoney = inputView.inputPurchase();
        InputValidater.validateInputMoney(purchaseMoney);
        return InputParser.stringToNumberPaser(purchaseMoney);
    }

    private void displayLottos(Lottos lottos) {
        String lottoList = lottos.formatString();
        outputView.displayLottos(lottoList);
    }

//    private WinningNumber createWinningNumber() {
//    }
//
//    private BonusNumber createBonusNumber() {
//
//    }

}
