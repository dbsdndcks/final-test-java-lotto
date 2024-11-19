package lotto.util.random;

import camp.nextstep.edu.missionutils.Randoms;
import java.util.List;

public class RandomGenerater {

    public static List<Integer> randomLottoGenerater() {
        return Randoms.pickUniqueNumbersInRange(1,45,6);
    }
}
