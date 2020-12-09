public class Recorridos{
    public void diagonalPrincipal(int tam){//(String)para crear arreglo de obejtos modificar linea 2,3,6
        int[][] matriz=new int [tam][tam];
        for(int i=0;i<tam;i++){
            for(int j=0;j<tam;j++){
                if(i==j){
                    matriz[i][j]=1;
                }
            }
        }
        mostrar(matriz);
    }
    
    public void diagonalSecundaria(int tam){
        int[][] matriz=new int [tam][tam];
        for(int i=0;i<tam;i++){
            for(int j=0;j<tam;j++){
                if((i+j)==tam-1){
                    matriz[i][j]=1;
                }
            }
        }
        mostrar(matriz);
    }
    
    public void ajedres(int tam){
        int[][] matriz=new int [tam][tam];
        for(int i=0;i<tam;i++){
            for(int j=0;j<tam;j++){
                if((i+j)%2==0){
                    matriz[i][j]=1;
                }
            }
        }
        mostrar(matriz);
    }
    public void mostrar(int [][] mat){
        for(int fila=0;fila<mat.length;fila++){
            for(int col=0;col<mat[fila].length;col++){
                System.out.print(mat[fila][col]+"  ");// recorrido de izquierda a derecha
                //System.out.print(mat[col][fila]+"  "); recorrido de arriba a abajo
            }
            System.out.println();
        }
    }
}
