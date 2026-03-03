public class OOPSBannerApp {

    public static void main(String[] args) {

        String[] banner = new String[7];

        for (int i = 0; i < 7; i++) {
            banner[i] = buildO(i) + "  " +
                        buildO(i) + "  " +
                        buildP(i) + "  " +
                        buildS(i);
        }

        for (String line : banner) {
            System.out.println(line);
        }
    }

    // ----------- O Pattern -----------
    public static String buildO(int row) {
        if (row == 0 || row == 6)
            return String.join(" ", "O","O","O","O");
        else
            return String.join(" ", "O"," "," ","O");
    }

    // ----------- P Pattern -----------
    public static String buildP(int row) {
        if (row == 0)
            return String.join(" ", "P","P","P");
        else if (row == 1)
            return String.join(" ", "P"," "," ","P");
        else if (row == 2)
            return String.join(" ", "P","P","P");
        else
            return String.join(" ", "P");
    }

    // ----------- S Pattern -----------
    public static String buildS(int row) {
        if (row == 0 || row == 6)
            return String.join(" ", "S","S","S");
        else if (row == 2)
            return String.join(" ", "S","S");
        else if (row == 1)
            return String.join(" ", "S");
        else if (row == 3 || row == 4 || row == 5)
            return String.join(" ", "S");
        else
            return "";
    }
}
