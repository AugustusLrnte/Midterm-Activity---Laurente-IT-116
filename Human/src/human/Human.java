package human;

public class Human {
    private final String skin_color = "Skin Color: White";
    private final String eye_color = "Eye Color: Brown";
    private final String gender = "Gender: Boy";
    private final String height = "Height: 175"; 
    private final String weight = "Weight: 70";
    private final String age = "Age: 28";
    private final String race = "Race: German";
    private final String name = "Name: Vladimir Skwebelborg";
       
    public static void main(String[] args) {
       
        Human H = new Human ();
        Children C = new Children();
        
        System.out.println(H.skin_color);
        System.out.println(H.eye_color);
        System.out.println(H.gender);
        System.out.println(H.height);
        System.out.println(H.weight);
        System.out.println(H.age);
        System.out.println(H.race);
        System.out.println(H.name);
        System.out.println(C.intellegience_rating);
        System.out.println(C.mood_rating);
        System.out.println(C.genetic_disease[0]);
        System.out.println(C.wealth_rating);
    }  
}