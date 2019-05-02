package c18.demo1;

import lombok.Data;

@Data
public class GameRole {

    //生命力
    private int vit;
    //攻击力
    private int atk;
    //防御力
    private int def;

    //状态显示
    public void stateDisplay(){
        System.out.println("角色当前状态：");
        System.out.println(String.format("体力：%s",this.vit));
        System.out.println(String.format("攻击力：%s",this.atk));
        System.out.println(String.format("防御力：%s",this.def));
        System.out.println();
    }

    //获得初始状态
    public void getInitState(){
        this.vit = 100;
        this.atk = 100;
        this.def = 100;
    }

    //战斗
    public void fight(){
        this.vit = 0;
        this.atk = 0;
        this.def = 0;
    }

}