public class JuegoBarcos{
    public static void main(String[] args){
        int matriz[][];
        int filas=10;
        int columnas=10;
        matriz = new int [filas][columnas];
        
        for(int i=0;i<filas;i++){
            for(int j=0;j<columnas;j++){
                System.out.print(matriz[i][j]);
            }
            System.out.println("");
        }
    }
}
