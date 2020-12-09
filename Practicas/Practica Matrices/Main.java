public class Main{
    public static void main(String args[]){
        Carta[][] cartas=new Carta[4][4];
        for(int i=0;i<cartas.length;i++){
            for(int j=0;j<cartas.length;j++){
                cartas[i][j]= new Carta();
            }
        }
        PresMeredith presMeredith=new PresMeredith(cartas);
        presMeredith.visualizar();
        System.out.println("Ingrese coordenadas");
    }
}

