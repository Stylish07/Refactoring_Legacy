package reduce_final_static.legacy;

public class ConstValues {
    
    public static final String DATABASE_URL = "example.co.kr";
    public static final String DATABASE_SCHEMA = "example";
    public static final String DATABASE_USER = "example1";
    public static final String DATABASE_PASSWORD = "12341234";

    public static final int REQ_SUCCESS = 10;
    public static final int REQ_FAIL = 19;

    public static final int CHECK_IN_RESULT_SUCCESS = 30;
    public static final int CHECK_IN_RESULT_FAIL = 39;

    public static final int CHECK_IN_FAIL_ALREADY_IN = 301;
    public static final int CHECK_IN_FAIL_NOT_RESERVED = 302;
    public static final int CHECK_IN_FAIL_DEBT_CHARGE = 303;
    public static final int CHECK_IN_FAIL_SYSTEM_ERR = 399;

    public static final int CHECK_OUT_RESULT_SUCCESS = 40;
    public static final int CHECK_OUT_RESULT_FAIL = 49;

    public static final int CHECK_OUT_FAIL_ALREADY_OUT = 401;
    public static final int CHECK_OUT_FAIL_NOT_COSTOMER = 402;
    public static final int CHECK_OUT_FAIL_DEBT_RETURN = 403;
    public static final int CHECK_OUT_FAIL_CREDIT_CHARGE = 404;
    public static final int CHECK_OUT_FAIL_SYSTEM_ERR = 499;

    public static final int PAY_RESULT_SUCCESS = 50;
    public static final int PAY_RESULT_FAIL = 51;

    public static final int PAY_FAIL_DEUBT_CHARGE = 501;
    public static final int PAY_FAIL_DEUBT_RETURN = 502;
    public static final int PAY_FAIL_PAY_CHARGE = 503;

    public static final int RESULT_CODE_200 = 200;
    public static final int RESULT_CODE_400 = 400;
    public static final int RESULT_CODE_404 = 404;
    public static final int RESULT_CODE_500 = 500;
    
}
