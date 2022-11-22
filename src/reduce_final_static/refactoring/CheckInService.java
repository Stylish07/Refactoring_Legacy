package reduce_final_static.refactoring;

public class CheckInService {

    public static final int RESULT_SUCCESS = 30;
    public static final int RESULT_FAIL = 39;
    public static final int ALREADY_IN = 301;
    public static final int NOT_RESERVED = 302;
    public static final int DEBT_CHARGE = 303;
    public static final int SYSTEM_ERR = 399;

    public Result checkIn(String name, String roomNo) {
        boolean isSuccess = true;

        // 중략

        Result result = new Result();

        if (isSuccess) {
            result.setResult(RESULT_SUCCESS);
        } else {
            result.setResult(RESULT_FAIL);
            result.setResultMsgType(DEBT_CHARGE);
        }

        return result;
    }

}
