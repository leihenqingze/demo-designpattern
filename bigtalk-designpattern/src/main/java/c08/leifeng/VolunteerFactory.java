package c08.leifeng;

//社区志愿者工厂
public class VolunteerFactory implements Factory {

    @Override
    public LeiFeng createLeiFeng() {
        return new Volunteer();
    }

}
