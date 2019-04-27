package c09.resume;

import lombok.Data;

//工作经历类
@Data
public class WorkExperience implements Cloneable{

    private String workDate;
    private String company;

    public WorkExperience clone() {
        try {
            return (WorkExperience) super.clone();
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
            return null;
        }
    }

}
