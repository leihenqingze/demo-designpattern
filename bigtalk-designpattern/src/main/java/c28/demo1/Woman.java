package c28.demo1;

public class Woman extends Person{

    @Override
    public void getConclusion() {
        if (action == "成功") {
            System.out.println(String.format("%s%s时，背后多半有一个不成功的男人。",
                    this.getClass().getSimpleName(),action));
        } else if (action == "失败") {
            System.out.println(this.getClass().getSimpleName() + action
                    + "时，眼泪汪汪，谁也劝不了。");
        } else if (action == "恋爱") {
            System.out.println(this.getClass().getSimpleName() + action
                    + "时，遇事懂也装作不懂。");
        }
    }

}
