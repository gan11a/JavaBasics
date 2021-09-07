package cf.iqas;

public class Main{

    public static void main(String[] args) {
        VoipRoom mlgfoxy = new VoipRoom( "mlgfoxy","220466");
        VoipRoom gan1a = new VoipRoom( "gan1a","320466");
        VoipRoom unregistered_user1 = new VoipRoom( "323445","420466");
        VoipRoom unregistered_user2 = new VoipRoom( "423445","520466");
        VoipRoom unregistered_user3 = new VoipRoom( "523445","620466");
        if (VoipRoom.getpplCounter() > 4) {
            System.out.println("VoipRoom is full!");
        }
        else {
            System.out.println("You can join us in this Voip Room!");}
        }
    }
