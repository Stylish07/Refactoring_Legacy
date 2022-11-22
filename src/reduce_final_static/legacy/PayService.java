package reduce_final_static.legacy;

import java.util.Date;

public class PayService {

    public Result PayRoomCharge(String name, String roomNo, Date in, Date out) {
        boolean isSuccess = true;

        // 중략

        Result result = new Result();

        if (isSuccess) {
            result.setResult(ConstValues.PAY_RESULT_SUCCESS);
        } else {
            result.setResult(ConstValues.PAY_RESULT_FAIL);
            result.setResultMsgType(ConstValues.PAY_FAIL_DEUBT_CHARGE);
        }

        return result;
    }

}
