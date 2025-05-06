package entities;

public class Students {
    public String name;
    public double grade1;
    public double grade2;
    public double grade3;

    public double finalNota(){
        return grade1 + grade2 + grade3;
    }
    public double missingNota(){
        if(finalNota() < 60.00){
            return 60.00 - finalNota();
        }
        else{
            return 0.0;
        }
    }
}
