package c011.dynamicproxy;

/**
 * 配对服务
 */
public interface PersonBean {

    String getName();

    String getGender();

    String getInterests();

    int getHotOrNotRating();

    void setName(String name);

    /**
     * 设置兴趣，不可以修改别人的兴趣
     *
     * @param gender 兴趣
     */
    void setGender(String gender);

    void setInterests(String interests);

    /**
     * 评分方法，自己不能修改自己的评分
     *
     * @param rating 评分
     */
    void setHotOrNotRating(int rating);

}