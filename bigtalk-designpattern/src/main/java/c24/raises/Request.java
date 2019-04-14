package c24.raises;

import lombok.Data;

//申请
@Data
public class Request {

    //申请类别
    private String requestType;
    //申请内容
    private String requestContent;
    //数量
    private int number;

}
