package c18.demo1;

public class Main {

    //这样写就把整个游戏角色的细节暴漏给了客户端，客户端的职责就太大了，
    //需要知道游戏角色的生命力、攻击力、防御力这些细节，还要对它进行‘备份’。
    //以后需要增加新的数据，例如增加‘魔法力’或修改现有的某种力，
    //例如‘生命力’改为‘经验值’，这部分就一定要修改了。同样的道理也存在于恢复时的代码。
    //显然，我们希望的是把这些‘游戏角色’的存取状态细节封装起来，而且最好是封装在外部的类当中。以体现职责分离。
    public static void main(String[] args) {
        //大战Boss前
        GameRole lixiaoyao = new GameRole();
        lixiaoyao.getInitState();
        lixiaoyao.stateDisplay();

        //保存进度
        GameRole backup = new GameRole();
        backup.setVit(lixiaoyao.getVit());
        backup.setAtk(lixiaoyao.getAtk());
        backup.setDef(lixiaoyao.getDef());

        //大战Boss时，损耗严重
        lixiaoyao.fight();
        lixiaoyao.stateDisplay();

        //恢复之前状态
        lixiaoyao.setVit(backup.getVit());
        lixiaoyao.setAtk(backup.getAtk());
        lixiaoyao.setDef(backup.getDef());
        lixiaoyao.stateDisplay();

    }

}