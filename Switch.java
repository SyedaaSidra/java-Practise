public class Switch {

        public String Days(String today){
            
        switch(today){
            case "Monday":
            return "it is Monday Today";
            case "Tuesday":
            return "it is Tuesday Today";
            case "Wednesday":
            return "it is Wednesday Today";
            case "Thursday":
            return "it is Thursday Today";
            default:
            return "it is Sunday Today";

        }
        }


        
       

        public String DaysArrow(String today) {
            return switch (today) {
                case "Monday" -> "It is Monday Today";
                case "Tuesday" -> "It is Tuesday Today";
                case "Wednesday" -> "It is Wednesday Today";
                case "Thursday" -> "It is Thursday Today";
                case "Friday" -> "It is Friday Today";
                case "Saturday" -> "It is Saturday Today";
                case "Sunday" -> "It is Sunday Today";
                default -> "Invalid day provided!";
            };
        }
        

       

    

    public static void main(String[] a){

        Switch s= new Switch();
       
        System.out.println( s.Days("Monday"));
        System.out.println( s.DaysArrow("Wednesday"));
    }
    
}
