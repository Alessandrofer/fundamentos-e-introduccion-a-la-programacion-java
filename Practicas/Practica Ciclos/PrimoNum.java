public class PrimoNum{
    private int primo=0,i=1,num=0;
    private String res;
    public String calcuPrim(int num){
        String res;
        do
        {
            if(num%i==0)
            {
                primo++;
            }
            i++;
        } while(num>=i);
        if(primo==2)
        {
            res="Si es primo";
        }
        else
        {
            res="No es primo";
        }
        return res;
    }

}
