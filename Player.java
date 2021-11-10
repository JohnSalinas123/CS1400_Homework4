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
            throw new NullPointerException();
        }
        
    }

    // toString override for the Player class
    @Override
    public String toString() {
        return  "ID: " + this.id + "\n" +
                "Name: " + this.name + "\n" +
                "Experience: " + this.experience + "\n" +
                this.stats.toString() + this.status.toString();
    }

    // equals for the Player class
    @Override
    public boolean equals(Object other) {
        
        if (other == null || this.getClass() != other.getClass()) {
            return false;
        } {

            Player otherPlayer = (Player)other;
            if (otherPlayer.getName() == this.name && otherPlayer.getExperience() == this.experience &&
                otherPlayer.getStats().equals(this.stats) && otherPlayer.getStatus().equals(this.status)) {
                
                    return true;
            }

        }

        return false;

    }

    // get number of players created method
    public static int getNumPlayers() {
        return count;
    }

    /**
     * Getter methods for the Player class
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

    /**
     * Setter methods for the Player class
     */

    // setter method for name
    public void setName(String newName) {
        this.name = newName;
    }

    // setter method for experience
    public void setExperience(int newExp) {
        this.experience = newExp;
    }

    // setter method for stats
    public void setStats(Stats newStats) {

        if (newStats != null) {
            Stats safeStats = new Stats(newStats);
            this.stats = safeStats;
        } else {
            throw new NullPointerException();
        }

        
    }

    // setter method for status
    public void setStatus(Status newStatus) {

        if (newStatus != null) {
            Status safeStatus = new Status(newStatus);
            this.status = safeStatus;
        } else {
            throw new NullPointerException();
        }

        
    }

    // add method for experience
    public void addExperience(int addExp) {
        int expTotal = this.experience + addExp;

        if (expTotal > MAX_EXP) {
            this.experience = MAX_EXP;
        } else if (expTotal < 0) {
            this.experience = 0;
        } else {
            this.experience = expTotal;
        }

    }
    
}
