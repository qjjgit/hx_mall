package com.hx.mall.common;

public final class Consts {
    private Consts(){}
    public static class Sex{
        public final static int WOMAN=0;
        public final static int MAN=1;
    }
    public static class IdentityType{
        public final static int PHONE=0;
        public final static int USERNAME=1;
        public final static int EMAIL=2;
        public final static int WEIBO=3;
        public final static int WX=4;
        private IdentityType() {}
    }
//    public static class ExceptionSource{
//        public final static String USER="A";
//        public final static String SYSTEM="B";
//        public final static String THIRD_PARTY="C";
//        private ExceptionSource() {}
//    }
    public static class ErrorCode{
        public final static String USER_ERROR="A0001";
        public final static String SMS_CODE_ERROR="A0131";//验证码错误
        public final static String SYSTEM_ERROR="B0001";
//        public final static String EMAIL=2;
//        public final static String WEIBO=3;
//        public final static String WX=4;
        private ErrorCode(){}
    }

}
