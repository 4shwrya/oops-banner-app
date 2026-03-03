public class OOPSBannerApp {

    public static void main(String[] args) {

        String[] banner = new String[] {
            String.join(" ", "O", "O", "O", "O", " ", "P", "P", "P", " ", "S", "S", "S"),
            String.join(" ", "O", " ", " ", "O", " ", "P", " ", " ", "P", "S"),
            String.join(" ", "O", " ", " ", "O", " ", "P", "P", "P", " ", "S", "S"),
            String.join(" ", "O", " ", " ", "O", " ", "P", " ", " ", " ", " ", " ", "S"),
            String.join(" ", "O", " ", " ", "O", " ", "P", " ", " ", " ", " ", " ", "S"),
            String.join(" ", "O", " ", " ", "O", " ", "P", " ", " ", " ", "S"),
            String.join(" ", "O", "O", "O", "O", " ", "P", " ", " ", " ", "S", "S", "S")
        };

        for (String line : banner) {
            System.out.println(line);
        }
    }
}
