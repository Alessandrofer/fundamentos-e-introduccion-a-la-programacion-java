public class PerfectoNum{
    private int i, suma = 0, num;
    private String res;
    public String mostrar(int num){
        for (i = 1; i < num; i++) { 
            if (num % i == 0) {
                suma = suma + i;
            }
        }
        if (suma == num) {
            res="Perfecto";
        } else {
            res="No es perfecto";
        }
        return res;
    }
}
