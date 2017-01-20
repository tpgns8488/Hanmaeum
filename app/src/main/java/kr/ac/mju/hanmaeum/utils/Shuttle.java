package kr.ac.mju.hanmaeum.utils;

/**
 * Created by Youthink on 2017-01-20.
 */

public class Shuttle {
    private String no;
    private String type;
    private String start_time;
    // 진입로 경유 예정시각
    private String ramp_time;

    public Shuttle(String no, String type, String start_time, String ramp_time) {
        this.no = no;
        this.ramp_time = ramp_time;
        this.start_time = start_time;
        this.type = type;
    }

    @Override public String toString() {
        return "Shuttle{" +
                "no='" + no + '\'' +
                ", type='" + type + '\'' +
                ", start_time='" + start_time + '\'' +
                ", ramp_time='" + ramp_time + '\'' +
                '}';
    }

    public String getNo() {
        return no;
    }

    public void setNo(String no) {
        this.no = no;
    }

    public String getRamp_time() {
        return ramp_time;
    }

    public void setRamp_time(String ramp_time) {
        this.ramp_time = ramp_time;
    }

    public String getStart_time() {
        return start_time;
    }

    public void setStart_time(String start_time) {
        this.start_time = start_time;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }
}
