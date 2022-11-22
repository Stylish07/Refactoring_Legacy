package reduce_final_static.refactoring;

import java.util.Date;

public class PayService {

    public static final int RESULT_SUCCESS = 50;
    public static final int RESULT_FAIL = 51;
    public static final int DEUBT_CHARGE = 501;
    public static final int DEUBT_RETURN = 502;
    public static final int PAY_CHARGE = 503;
    
    // 중략

    public Result PayRoomCharge(String name, String roomNo, Date in, Date out) {
        boolean isSuccess = true;

        // 중략

        Result result = new Result();

        if (isSuccess) {
            result.setResult(RESULT_SUCCESS);
        } else {
            result.setResult(RESULT_FAIL);
            result.setResultMsgType(DEUBT_CHARGE);
        }

        return result;
    }

}
