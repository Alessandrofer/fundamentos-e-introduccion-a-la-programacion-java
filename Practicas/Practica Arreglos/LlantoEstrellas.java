public class LlantoEstrellas{
    private int [] estrellas;
    private int par, impar;

    public LlantoEstrellas(int [] estrellas){
        this.estrellas=estrellas;
        par=0;
        impar=0;
        contarParImpar();
    }

    private void contarParImpar(){
        for(int x: estrellas){
            if(x%2==0){
                par++;
            }else{
                impar++;
            }
        }
    }

    public void ordenar(){
        int [] arrPar= new int[par];
        int [] arrImpar= new int[impar];
        int posPar=0, posImpar=0;
        for(int i=0;i<estrellas.length;i++){
            if(estrellas[i]%2==0){
                arrPar[posPar]=estrellas[i];
                posPar++;
            }else{
                arrImpar[posImpar]=estrellas[i];
                posImpar++;
            }
        }
        for (int i = 0; i < arrImpar.length; i++) {
            for (int j = i + 1; j < arrImpar.length ; j++) {
                if (arrImpar[i] > arrImpar[j]) {
                    int auxIm = arrImpar[j];
                    arrImpar[i] = arrImpar[j];
                    arrImpar[j] = auxIm;
                }
            }         
        }
        for (int i = 0; i < arrPar.length; i++) {
            for (int j = i + 1; j < arrPar.length ; j++) {
                if (arrPar[i] > arrPar[j]) {
                    int auxPa = arrPar[j];
                    arrPar[i] = arrPar[j];
                    arrPar[j] = auxPa;
                }
            }         
        }        
        fusion(arrImpar,arrPar);
    }

    public int[] fusion(int[] a, int[] b){
        int [] res= new int[a.length+b.length];
        int pos=0;
        for(int x: a){
            res[pos]=x;
            pos++;
        }
        for(int y: b){
            res[pos]=y;
            pos++;
        }
        return res;
    }
}


