public class Danae{
    public void mostrar(int [][] matriz){
        for(int fila=0;fila<matriz.length;fila++){
            for(int col=0;col<matriz[fila].length;col++){
                System.out.print(matriz[fila][col]+"  ");
            }
            System.out.println();
        }
    } 
}
