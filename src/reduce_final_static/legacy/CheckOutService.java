package reduce_final_static.legacy;

public class CheckOutService {

    public Result checkOut(String name, String roomNo) {
        boolean isSuccess = true;

        // 중략

        Result result = new Result();

        if (isSuccess) {
            result.setResult(ConstValues.CHECK_OUT_RESULT_SUCCESS);
        } else {
            result.setResult(ConstValues.CHECK_OUT_RESULT_FAIL);
            result.setResultMsgType(ConstValues.CHECK_OUT_FAIL_DEBT_RETURN);
        }

        return result;
    }

}
