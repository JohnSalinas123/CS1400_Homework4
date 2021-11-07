public class Player {

    private String name;
    private int experience;
    private Stats stats;        // strength, intelligence, stamina
    private Status status;      // hitPoints, hunger, sleepiness
    private int id;
    private static int count = 1;

    private int MAX_EXP = 1000;


    // constructor for Player class
    public Player(String name, int initExp, Stats initStats, Status initStatus) {

        this.id = count;
        this.name = name;

        if (initExp < 0) {
            this.experience = 0;
        } else if (initExp > MAX_EXP) {
            this.experience = MAX_EXP;
        } else {
            this.experience = initExp;
        }

        this.stats = new Stats(initStats);
        this.status = new Status(initStatus);

        count++;

    }
    
    // copy constructor for the Player class
    public Player(Player otherPlayer) throws Exception {

        if (otherPlayer != null) {
            this.id = count;
            this.name = otherPlayer.getName();
            this.stats = otherPlayer.getStats();
            this.status = otherPlayer.getStatus();
            count++;
        } else {
            throw new Exception("IllegalNullReference");
        }
        
    }

    // toString override for the Player class
    @Override
    public String toString() {
        return  "ID: " + this.id + "\n" +
                "Name: " + this.name + "\n" +
                "Experience: " + this.experience + "\n" +
                this.stats.toString() + this.status.toString();

                /*
                "Stats: " + "\n" +
                "   Strength:       " + this.stats.getStrenth() + "\n" +
                "   Intelligence:   " + this.stats.getIntelligence() + "\n" +
                "   Stamina:        " + this.stats.getStamina() + "\n" +
                "Status: " + "\n" +
                "   HitPoints:      " + this.status.getHitPoints() + "\n" +
                "   Hunger:         " + this.status.getHunger() + "\n" +
                "   Sleepiness:     " + this.status.getSleepiness() + "\n"; 

                */
    }

    // equals for the Player class
    public boolean equals(Object other) {
        
    }


    /**
     * Getter method for the Player class
     */

    // getter method for name
    public String getName() {
        return name;
    }

    // getter method for experience
    public int getExperience() {
        return experience;
    }

    // getter method for Stats
    public Stats getStats() {
        Stats statsSafe = new Stats(stats);
        return statsSafe;
    }

    // getter method for Status
    public Status getStatus() {
        Status statusSafe = new Status(status);
        return statusSafe;
    }


    
}
