public class Main {
    public static void main(String[] args) {
        NetworkInfo usr = new NetworkInfo();
        usr = fillInfo(10, "123", "slabo");
        usr.showParameters();

    }

    static class NetworkInfo {
        int ssid;
        String passwd;
        String securityType;

        void showParameters() {
            System.out.println(ssid);
            System.out.println(passwd);
            System.out.println(securityType);
        }
    }

    public static NetworkInfo fillInfo(int x, String  y, String z) {
        NetworkInfo blank = new NetworkInfo();
        blank.ssid = x;
        blank.passwd = y;
        blank.securityType = z;

        return blank;
    }
}
