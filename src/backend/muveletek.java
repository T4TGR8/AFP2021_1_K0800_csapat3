package backend;

public class muveletek {
    //Az Összes művelet visszatérési Típusa String! oka: pl 3/0 = ERROR

    //Prototipus: 2 szám összegének,különbségének,stb... kiszámítására képes.
    public String Osszeadas(double a, double b){
        return String.valueOf(a+b);
    }
    public String Kivonas(double a, double b){
        return String.valueOf(a-b);
    }
    public String Szorzas(double a, double b){
        return String.valueOf(a*b);
    }
    public String Osztas(double a, double b){
        if (b==0) return "Nullával nem lehet osztani!";
        return String.valueOf(a+b);
    }
    public String Hatvanyozas(double a, double b){
        return String.valueOf(Math.pow(a,b));
    }
    public String NegyzetGyökvonas(double a){
        return String.valueOf(Math.sqrt(a));
    }


}
