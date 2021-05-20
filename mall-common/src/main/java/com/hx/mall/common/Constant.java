package com.hx.mall.common;

public final class Constant {
    private Constant(){}
    public static class IdentityType{
        public final static int PHONE=0;
        public final static int USERNAME=1;
        public final static int EMAIL=2;
        public final static int WEIBO=3;
        public final static int WX=4;
        private IdentityType() { }
    }
    public static class ExceptionCode{
        public final static int SMSCODEERROR=0;
        public final static int USERNAME=1;
        public final static int EMAIL=2;
        public final static int WEIBO=3;
        public final static int WX=4;
        private ExceptionCode(){}
    }
}
