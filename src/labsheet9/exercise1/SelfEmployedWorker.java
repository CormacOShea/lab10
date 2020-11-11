package labsheet9.exercise1;

public final class SelfEmployedWorker extends Employee{
    private double estimatedIncome;


    public SelfEmployedWorker(String firstName, String lastName) {
        super(firstName, lastName);
        setEstimatedIncome();
    }

    @Override
    public double earnings() {
        return estimatedIncome;
    }

    public void setEstimatedIncome() {
        this.estimatedIncome = (int)(Math.random()*(900-400+1) + 400);
    }

    @Override
    public String toString() {
        return "SelfEmployedWorker's name is " + super.toString();
    }
}
