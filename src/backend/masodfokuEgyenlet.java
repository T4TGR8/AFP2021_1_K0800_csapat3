public class masodfokuEgyenlet {
    public String megoldas(double a,double b,double c){
        double Diszkriminans = b*b-4*a*c;
        if (0 > Diszkriminans) return "Nincs megoldás!";
        if (a*b == 0) return "Ez nem egy másodfokú egyenlet!"; // Ha a = 0 vagy b = 0, akkor a*b = 0, ez hibát okozhat,így le kell kezelni.

        return  "x1 = " + String.valueOf( (-b + Math.sqrt( Diszkriminans ))/2 ) +
                "  x2 = " + String.valueOf( (-b - Math.sqrt( Diszkriminans ))/2 );
        //Amennyiben a diszkrimináns nulla,kétszer fogjuk megkapni ugyanazt az értéket.
    }
}
