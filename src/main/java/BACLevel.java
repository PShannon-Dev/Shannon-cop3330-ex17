public class BACLevel {
    public double alcoholConsumed;
    public double weight;
    public double hours;
    public int gender;
    public double bacLevel;

    //ratios
    public final double femaleRatio = 0.66;
    public final double maleRatio = 0.73;

    public void setBacLevel(double bacLevel) {
        this.bacLevel = bacLevel;
    }

    public void setAlcoholConsumed(double alcoholConsumed) {
        this.alcoholConsumed = alcoholConsumed;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    public void setHours(double hours) {
        this.hours = hours;
    }

    public void setGender(int gender) {
        this.gender = gender;
    }

    public double getBacLevel() {
        return bacLevel;
    }

    public Double calculate()
    {
        //if statement to determine what gender/ratio to use
        if(gender == 1)
        {
            return (alcoholConsumed * 5.14 / weight * maleRatio) - (.015 * hours);
        }
        else
            return (alcoholConsumed * 5.14 / weight * femaleRatio) - (.015 * hours);

    }
}
