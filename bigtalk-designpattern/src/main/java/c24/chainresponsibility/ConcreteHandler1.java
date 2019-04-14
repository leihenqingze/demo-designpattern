package c24.chainresponsibility;

public class ConcreteHandler1 extends Handler {

    @Override
    public void handleRequest(int request) {
        if (request >= 0 && request < 10) {
            System.out.println(String.format("%s 处理请求 %s",
                    this.getClass().getSimpleName(), request));
        } else if (successor != null) {
            successor.handleRequest(request);
        }
    }

}