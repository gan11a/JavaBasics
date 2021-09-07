package cf.iqas;

public class VoipRoom {
    String id;
    String password;
    int userNumber;
    private static int pplCounter;
    public VoipRoom(String id, String password) {
        this.id = id;
        this.password = password;
        this.userNumber = ++pplCounter;
        }
    public static int getpplCounter(){
        return pplCounter;
        }
    }


