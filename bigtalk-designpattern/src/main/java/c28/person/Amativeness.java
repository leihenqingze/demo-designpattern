package c28.person;

//恋爱
public class Amativeness implements Action{

    @Override
    public void getManConclusion(Man concreteElementA) {
        System.out.println(concreteElementA.getClass().getSimpleName() + this.getClass().getSimpleName()
                + "时，凡事不懂也要装懂。");
    }

    @Override
    public void getWomanConclusion(Woman concreteElementB) {
        System.out.println(concreteElementB.getClass().getSimpleName() + this.getClass().getSimpleName()
                + "时，遇事懂也装作不懂。");
    }

}
