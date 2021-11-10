public class Stats {

    private int strength;
    private int intelligence;
    private int stamina;

    private int MAX_STAT_VALUE = 12;    // The max value of any one stat.
    private int MAX_STAT_SUM = 20;      // The max value of all stats combined.

    // constructor for class Stats
    public Stats(int strValue, int intValue, int stamValue) {
        int statSum = strValue + intValue + stamValue;

        if (statSum == MAX_STAT_SUM && strValue >= 1 && strValue <= 12 && intValue >= 1 && intValue <= 12
                 && stamValue >= 1 && stamValue <= 12) {

            strength = strValue;
            intelligence = intValue;
            stamina = stamValue;

        } else {
            throw new IllegalArgumentException();
        }
    }

    //copy constructor
    public Stats(Stats objectCopy) {

        strength = objectCopy.strength;
        intelligence = objectCopy.intelligence;
        stamina = objectCopy.stamina;

    }
    
    // toString override
    @Override
    public String toString(){

        return "Strength: " + this.strength + "\n" +
                "Intelligence: " + this.intelligence + "\n" +
                "Stamina: " + this.stamina + "\n"; 

    }
    
    //equals
    @Override
    public boolean equals(Object other) {
        
        if (other == null || getClass() != other.getClass()) {
            return false;
        } else {

            Stats otherStats = (Stats)other;
            if (otherStats.getStrenth() == this.strength &&
                otherStats.getIntelligence() == this.intelligence &&
                otherStats.getStamina() == this.stamina) {

                    return true;

            }

        }

        return false;

    }

    /**
     * Getter methods for the Stats class
     */

    // getter method for Strength
    public int getStrenth() {
        return strength;
    }

    // getter method for Intelligence
    public int getIntelligence() {
        return intelligence;
    }

    // getter method for Stamina
    public int getStamina() {
        return stamina;
    }


    // move ammount of strength to intelligence, reducing strength by the same ammount
    public void moveStrengthToIntelligence(int ammount) throws Exception {
        strength = strength - ammount;
        intelligence = intelligence + ammount;

        if (!(strength >= 1 && strength <= 12 && intelligence >= 1 && intelligence <= 12 )) {
            throw new Exception("IllegalStatValue");
        } 


    }

    // move ammount of intelligence to stamina, reducing intelligence by the same ammount
    public void moveIntelligenceToStamina(int ammount) throws Exception {
        intelligence = intelligence - ammount;
        stamina = stamina + ammount;

        if (!(intelligence >= 1 && intelligence <= 12 && stamina >= 1 && stamina <= 12)) {
            throw new Exception("IllegalStatValue");
        }   
    }

    // move ammount of stamina to strength, reducing stamina by the same ammount
    public void moveStaminaToStrength(int ammount) throws Exception {
        stamina = stamina - ammount;
        strength = strength + ammount;

        if (!(strength >= 1 && strength <= 12 && stamina >= 1 && stamina <= 12)) {
            throw new Exception("IllegalStatValue");
        }   
    }

}

