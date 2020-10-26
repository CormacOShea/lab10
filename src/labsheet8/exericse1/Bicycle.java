package labsheet8.exericse1;

public class Bicycle extends Vehicle{
    private boolean hasABell;
    private int gearCount;

    public Bicycle() {
        setHasABell(false);
        setGearCount(0);
    }

    public Bicycle(double pr, double len, double hgt, double wgt, String mft, String mod, boolean bell, int gears) {
        super(pr, len, hgt, wgt, mft, mod);
        setHasABell(bell);
        setGearCount(gears);
    }

    public void setHasABell(boolean bell) {
        hasABell = bell;
    }

    public void setGearCount(int gears) {
        gearCount = gears;
    }

    public boolean getHasABell() {
        return hasABell;
    }

    public int getGearCount() {
        return gearCount;
    }
    public String toString() {
        String str = super.toString() + "\nHas bell: ";

        if(getHasABell())
            str+="Yes";
        else
            str+="No";

        str+= "\nGear Count: " + getGearCount();

        return str;
    }
}
