package reduce_final_static.refactoring;

public class CheckOutService {

    public static final int RESULT_SUCCESS = 40;
    public static final int RESULT_FAIL = 49;
    public static final int ALREADY_OUT = 401;
    public static final int NOT_COSTOMER = 402;
    public static final int DEBT_RETURN = 403;
    public static final int CREDIT_CHARGE = 404;
    public static final int SYSTEM_ERR = 499;

    public Result checkOut(String name, String roomNo) {
        boolean isSuccess = true;

        // 중략

        Result result = new Result();

        if (isSuccess) {
            result.setResult(RESULT_SUCCESS);
        } else {
            result.setResult(RESULT_FAIL);
            result.setResultMsgType(DEBT_RETURN);
        }

        return result;
    }

}
