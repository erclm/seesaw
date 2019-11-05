public class Seesaw {

    public Seesaw(){

    }
    public void simulate(Person one, Person two){
        if(one.getHeight() <= 1.0){
            one.kick();
            two.kick();
        }

        if(one.isUp()==true){//means one's going up in one's velocity, 2's coming down in one's velocity
            one.setHeight(one.getHeight()+one.getVel());
            two.setHeight(two.getHeight()-one.getVel());
        }else if(one.isUp()==false){
            one.setHeight(one.getHeight()-two.getVel());
            two.setHeight(two.getHeight()+two.getVel());
        }
    }
}
