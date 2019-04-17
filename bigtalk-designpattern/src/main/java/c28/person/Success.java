package c28.person;

//成功
public class Success implements Action{

    @Override
    public void getManConclusion(Man concreteElementA) {
        System.out.println(String.format("%s%s时，背后多半有一个伟大的女人。",
                concreteElementA.getClass().getSimpleName(),this.getClass().getSimpleName()));
    }

    @Override
    public void getWomanConclusion(Woman concreteElementB) {
        System.out.println(String.format("%s%s时，背后多半有一个不成功的男人。",
                concreteElementB.getClass().getSimpleName(),this.getClass().getSimpleName()));
    }

}
