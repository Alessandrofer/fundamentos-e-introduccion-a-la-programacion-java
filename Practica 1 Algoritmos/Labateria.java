public class Labateria{
   public int calcularBateria(){
    int bateAct=55, hrJue=20, hrSoc=10, hrYou=15;
    int mediHrJue=hrJue/2;
    int cuaHrSoc=hrSoc/4;
    int actuYou=(hrYou*40)/60;
    int total=bateAct-mediHrJue-cuaHrSoc-actuYou;
    return total;
}
}
