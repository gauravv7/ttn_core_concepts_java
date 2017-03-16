package coreConcepts.Question12;

/**
 * Created by gaurav on 16/3/17.
 */
/**
 * Created by priyanka on 14/3/17.
 */
abstract class Bank {

    private String name;
    private float rateOfInterest;
    private int numberOfBranches;
    private int numberOfEmployees;

    private int numberOfAtm;

    public Bank(String name, float rateOfInterest, int numberOfBranches, int numberOfEmployees, int numberOfATM) {
        this.name = name;
        this.rateOfInterest = rateOfInterest;
        this.numberOfBranches = numberOfBranches;
        this.numberOfEmployees = numberOfEmployees;
        this.numberOfAtm = numberOfATM;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public float getRateOfInterest() {
        return rateOfInterest;
    }

    public void setRateOfInterest(float rateOfInterest) {
        this.rateOfInterest = rateOfInterest;
    }

    public int getNumberOfBranches() {
        return numberOfBranches;
    }

    public void setNumberOfBranches(int numberOfBranches) {
        this.numberOfBranches = numberOfBranches;
    }

    public int getNumberOfEmployees() {
        return numberOfEmployees;
    }

    public void setNumberOfEmployees(int numberOfEmployees) {
        this.numberOfEmployees = numberOfEmployees;
    }

    public int getNumberOfAtm() {
        return numberOfAtm;
    }

    public void setNumberOfAtm(int numberOfAtm) {
        this.numberOfAtm = numberOfAtm;
    }

    public String getDetails() {
        return "Bank{" +
                "name='" + name + '\'' +
                ", rateOfInterest=" + rateOfInterest +
                ", numberOfBranches=" + numberOfBranches +
                ", numberOfEmployees=" + numberOfEmployees +
                ", numberOfAtm=" + numberOfAtm +
                '}';
    }
}

