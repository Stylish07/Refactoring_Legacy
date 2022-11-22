package reduce_final_static.legacy;

public class CheckInService {

    public Result checkIn(String name, String roomNo) {
        boolean isSuccess = true;

        // 중략

        Result result = new Result();

        if (isSuccess) {
            result.setResult(ConstValues.CHECK_IN_RESULT_SUCCESS);
        } else {
            result.setResult(ConstValues.CHECK_IN_RESULT_FAIL);
            result.setResultMsgType(ConstValues.CHECK_IN_FAIL_DEBT_CHARGE);
        }

        return result;
    }

}
