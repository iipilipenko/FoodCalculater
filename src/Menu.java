public class Menu {
    private final String person;
    private final double weight;
    private final double height;
    private final Male male;
    private final ActivityFactor activityFactor;
    private final int age;

    enum Male {
        MALE,
        FEMALE;
    }

    enum ActivityFactor{
        MINIMUM(1.2),
        LOW(1.375),
        MEDIUM(1.55),
        HIGH(1.725),
        HARDCORE(1.9);

        private double factor;

        ActivityFactor(double factor) {
            this.factor = factor;
        }

        public double getFactor() {
            return factor;
        }
    }

    public Menu(String person, double weight, double height, Male male, int age, ActivityFactor activityFactor) {
        this.person = person;
        this.weight = weight;
        this.height = height;
        this.male = male;
        this.activityFactor = activityFactor;
        this.age = age;
    }

    public String getPerson() {
        return person;
    }

    public double getWeight() {
        return weight;
    }

    public double getHeight() {
        return height;
    }

    public double dailyCaloriesNorm () {
        switch (male) {
            case MALE:
                return activityFactor.getFactor()*(88.36+(13.4*this.weight)+(4.8*this.height)-(5.7*this.age));
            case FEMALE:
                return activityFactor.getFactor()*(447.6+(9.2*this.weight)+(3.1*this.height)-(4.3*this.age));
        }
        return -1;
    }


}
