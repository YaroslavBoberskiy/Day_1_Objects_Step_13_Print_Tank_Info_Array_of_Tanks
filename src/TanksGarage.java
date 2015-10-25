/**
 * Created by YB on 25.10.2015.
 */
public class TanksGarage {

    private Tank t1 = new Tank();
    private Tank t2 = new Tank();
    private Tank t3 = new Tank();

    public Tank[] createTanks() {

        t1.setColor("Grey");
        t1.setMaxCrew(3);
        t1.setName("Tiger");

        t2.setColor("Dark green");
        t2.setMaxCrew(4);
        t2.setName("T34");

        t3.setColor("Dark grey");
        t3.setMaxCrew(3);
        t3.setName("Sherman");

        Tank[] tanks = {t1, t2, t3};

        return tanks;
    }

    public void printTankInfo(Tank[] tanks) {
        if (tanks != null) {
            for (int i = 0; i < tanks.length; i++) {
                System.out.println("Tank name: " + tanks[i].getName() + ", Tank color: " + tanks[i].getColor() +
                        ", max crew: " + tanks[i].getMaxCrew());
            }
        }
    }

}
