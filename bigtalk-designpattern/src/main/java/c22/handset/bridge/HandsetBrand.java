package c22.handset.bridge;

import lombok.Setter;

//手机品牌
public abstract class HandsetBrand {

    /*
    品牌需要关注软件，所以可在机器中安装软件，以备运行
     */
    @Setter
    protected HandsetSoft soft;

    public abstract void run();

}