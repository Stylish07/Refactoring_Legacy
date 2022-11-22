package reduce_final_static.refactoring;

public class ConstValues {

    public class Database {
        public static final String URL = "example.co.kr";
        public static final String SCHEMA = "example";
        public static final String USER = "example1";
        public static final String PASSWORD = "12341234";
    }

    public static final int REQ_SUCCESS = 10;
    public static final int REQ_FAIL = 19;

    public class HttpStatus {
        public static final int RESULT_CODE_200 = 200;
        public static final int RESULT_CODE_400 = 400;
        public static final int RESULT_CODE_404 = 404;
        public static final int RESULT_CODE_500 = 500;
    }

}
