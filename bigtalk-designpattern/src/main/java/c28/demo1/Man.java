package c28.demo1;

public class Man extends Person {

    //过多的判断，如果增加新的状态，就要修改所有类中的getConclusion方法了
    @Override
    public void getConclusion() {
        if (action == "成功") {
            System.out.println(String.format("%s%s时，背后多半有一个伟大的女人。",
                    this.getClass().getSimpleName(), action));
        } else if (action == "失败") {
            System.out.println(this.getClass().getSimpleName() + action
                    + "时，闷头喝酒，谁也不用劝。");
        } else if (action == "恋爱") {
            System.out.println(this.getClass().getSimpleName() + this.getClass().getSimpleName()
                    + "时，凡事不懂也要装懂。");
        }
    }

}