package c24.chainresponsibility;

public class ConcreteHandler3 extends Handler {

    @Override
    public void handleRequest(int request) {
        if (request >= 20 && request < 30) {
            System.out.println(String.format("%s 处理请求 %s",
                    this.getClass().getSimpleName(), request));
        } else if (successor != null) {
            successor.handleRequest(request);
        }
    }

}