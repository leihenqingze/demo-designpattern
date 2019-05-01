package c16.work;

import lombok.Data;

@Data
public class Work {

    private State current;
    private int hour;
    private boolean finish = false;

    public Work(){
        current = new ForenoonState();
    }

    public void writeProgram(){
        current.writeProgram(this);
    }

}