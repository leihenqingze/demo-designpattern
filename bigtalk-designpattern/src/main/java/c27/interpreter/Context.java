package c27.interpreter;

import lombok.Data;

//包含解释器之外的一些全局信息
@Data
public class Context {

    private String input;
    private String output;

}
