public class WithEnum {

    enum Day {
        MONDAY("Start of the work week"),
        TUESDAY("Second day of work"),
        WEDNESDAY("Midweek"),
        THURSDAY("Almost there"),
        FRIDAY("End of the work week"),
        SATURDAY("Weekend"),
        SUNDAY("Rest day");

        private String description;

        // Constructor
        Day(String description) {
            this.description = description;
        }

        // Method to get the description
        public String getDescription() {
            return description;
        }
    }

    public static void main(String[] args) {
        Day today = Day.MONDAY;

        System.out.println(today + ": " + today.getDescription());
    }
}
