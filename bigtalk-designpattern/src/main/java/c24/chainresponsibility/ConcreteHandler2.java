package c24.chainresponsibility;

public class ConcreteHandler2 extends Handler {

    @Override
    public void handleRequest(int request) {
        if (request >= 10 && request < 20) {
            System.out.println(String.format("%s 处理请求 %s",
                    this.getClass().getSimpleName(), request));
        } else if (successor != null) {
            successor.handleRequest(request);
        }
    }

}