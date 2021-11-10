public class Main {

    public static void main(String []args) throws Exception {
        Stats player1Stats = null;
        Stats player2Stats = null;
        Stats newPlayer2Stats = null;
        Stats testPlayerStats = null;
        Stats nullStats = null;

        Stats player3Stats = new Stats(6,6,8);
        Status player3Status = new Status(20,10,10);

        Status player1Status = new Status(20,10,10);
        Status player2Status = new Status(20,5,5);

        // Passing illegal parameter combination to Stats contructor
        try {
            testPlayerStats = new Stats(20,10,10);
        } catch (Exception error) {
            System.out.println("Error was caught: " + error + "\n");
        }

        try {
            newPlayer2Stats = new Stats(10,5,5);
        } catch (Exception error) {
            System.out.println("Error was caught: " + error + "\n");
        }

        try {
            player1Stats = new Stats(6,6,8);

        } catch (Exception error) {
            System.out.println("Error was caught: " + error + "\n");
        }

        try {
            player2Stats = new Stats(7,5,8);
        } catch (Exception error) {
            System.out.println("Error was caught: " + error + "\n");
        }


        Player player1 = new Player("John", 500, player1Stats, player1Status);
        Player player2 = new Player("Lance", 800, player2Stats, player2Status);
        Player player3 = new Player("John", 500, player3Stats, player3Status);

        //System.out.println(player1.equals(player3));

        Player nullPlayer = null;

        // Passing null player to Player class copy constructor
        try {
            Player errorPlayer = new Player(nullPlayer);
        } catch (Exception error) {
            System.out.println("Error was caught " + error + "\n");
        }

        System.out.println(player1);
        System.out.println(player2);
        System.out.println("\n" + "After some operations:" + "\n");

        player1.setName("John Cena");
        player1.setExperience(600);
        player1.addExperience(400);

        player2.setName("Lancelot");
        player2.setStats(newPlayer2Stats);

        System.out.println(player1);
        System.out.println(player2);

        // Passing null Stats to setStats method
        try {
            player2.setStats(nullStats);
        } catch (Exception error) {
            System.out.println("Error was caught: " + error + "\n");
        }
        

       
    }
    
}
