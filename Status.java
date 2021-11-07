public class Status {
    
    private int hitPoints;
    private int hunger;
    private int sleepiness;
    
    private int MAX_HP = 25;
    private int MAX_HUNGER = 15;
    private int MAX_SLEEPINESS = 15;

    // constructor for the Status class
    public Status(int hitPoints, int hunger, int sleepiness) {

        // Set the initial hit points
        if (hitPoints < 0) {
            this.hitPoints = 0;
        } else if (hitPoints > MAX_HP) {
            this.hitPoints = MAX_HP;
        } else {
            this.hitPoints = hitPoints;
        }

        // Set the initial hunger
        if (hunger < 0) {
            this.hunger = 0;
        } else if (hunger > MAX_HUNGER) {
            this.hunger = MAX_HUNGER;
        } else {
            this.hunger = hunger;
        }

        // Set the intial sleepiness
        if (sleepiness < 0) {
            this.sleepiness = 0;
        } else if (sleepiness > MAX_SLEEPINESS) {
            this.sleepiness = MAX_SLEEPINESS;
        } else {
            this.sleepiness = sleepiness;
        }

    }

    // copy constructor for Status class
    public Status(Status objectCopy) {

        this.hitPoints = objectCopy.hitPoints;
        this.hunger = objectCopy.hunger;
        this.sleepiness = objectCopy.sleepiness;

    }

    // toString override for Status class
    @Override
    public String toString() {

        return "Hit Points: " + hitPoints + "\n" +
                "Hunger: " + hunger + "\n" +
                "Sleepiness: " + sleepiness + "\n";
        
    }

    // equals for Status class
    public boolean equals(Object other) {

        if (other == null || this.getClass() != other.getClass()) {
            return false;
        } else {

            Status otherStats = (Status)other;
            if (otherStats.getHitPoints() == this.hitPoints &&
                otherStats.getHunger() == this.hunger &&
                otherStats.getSleepiness() == this.sleepiness) {

                    return true;

            }

        }

        return false;

    } // end equals

    /**
     * Getter methods for the Status class
     */

     // getter method for hit points
    public int getHitPoints() {
        return hitPoints;
    } 

    // getter method for hunger
    public int getHunger() {
        return hunger;
    }

    // getter method for sleepiness
    public int getSleepiness() {
        return sleepiness;
    }

    /**
     * Setter methods for the Status class
     */

    // setter method for hit points
    public void setHitPoints(int hitPoints ) {
        
        if (hitPoints < 0) {
            this.hitPoints = 0;
        } else if (hitPoints > MAX_HP) {
            this.hitPoints = MAX_HP;
        } else {
            this.hitPoints = hitPoints;
        }

    }

    // setter method for hunger
    public void setHunger(int hunger) {

        if (hunger < 0) {
            this.hunger = 0;
        } else if (hunger > MAX_HUNGER) {
            this.hunger = MAX_HUNGER;
        } else {
            this.hunger = hunger;
        }

    }

    // setter method for sleepiness
    public void setSleepiness(int sleepiness) {

        if (sleepiness < 0) {
            this.sleepiness = 0;
        } else if (sleepiness > MAX_SLEEPINESS) {
            this.sleepiness = MAX_SLEEPINESS;
        } else {
            this.sleepiness = sleepiness;
        }

    }

    // delta routine for hit points
    public void addHitPoints(int delta) {
        int tempHitPoints = this.hitPoints + delta;

        if (tempHitPoints < 0) {
            this.hitPoints = 0;
        } else if (tempHitPoints > MAX_HP) {
            this.hitPoints = MAX_HP;
        } else {
            this.hitPoints = tempHitPoints;
        }

    }

    // delta routine for hunger
    public void addHunger(int delta) {
        int tempHunger = this.hunger + delta;

        if (tempHunger < 0) {
            this.hunger = 0;
        } else if (tempHunger > MAX_HUNGER) {
            this.hunger = MAX_HUNGER;
        } else {
            this.hunger = tempHunger;
        }

    }

    // delta routine for sleepiness
    public void addSleepiness(int delta) {
        int tempSleepiness = this.sleepiness + delta;

        if (tempSleepiness < 0) {
            this.sleepiness = 0;
        } else if (tempSleepiness > MAX_SLEEPINESS) {
            this.sleepiness = MAX_SLEEPINESS;
        } else {
            this.sleepiness = tempSleepiness;
        }
    }


}
