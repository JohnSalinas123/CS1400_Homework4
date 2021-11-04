public class Main {

    public static void main(String []args) {
        Stats stat = null;
        Stats stat2 = null;


        try {
            stat = new Stats(6,6,8);

        } catch (Exception e) {
            //TODO: handle exception
            System.out.println(e);
        }

        try {
            stat2 = new Stats(7,5,8);
        } catch (Exception e) {
            //TODO: handle exception
            System.out.println(e);
        }

        
        System.out.println(stat);
        System.out.println(stat2);
        System.out.println(stat.equals(stat2));
        
    }
    
}
