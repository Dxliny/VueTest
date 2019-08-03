package cn.goktech.pojo;

public enum  StatEnum {
    UNKNOWN_ERROR(1001,"UNKNOWN ERROR")
    ;
    private int statid;
    private String statmsg;

    StatEnum(int statid, String statmsg) {
        this.statid = statid;
        this.statmsg = statmsg;
    }

    public int getStatid() {
        return statid;
    }

    public void setStatid(int statid) {
        this.statid = statid;
    }

    public String getStatmsg() {
        return statmsg;
    }

    public void setStatmsg(String statmsg) {
        this.statmsg = statmsg;
    }
}
