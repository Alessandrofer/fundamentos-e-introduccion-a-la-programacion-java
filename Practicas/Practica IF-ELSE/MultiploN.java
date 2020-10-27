public class MultiploN{
    private int num1,num2, multi;
    public MultiploN(int num1, int num2){
         multi=num1%num2;
        }
    public String multiplo(){
       String res="";       
         if(multi==0){
            res="Son parientes";
        }else{
            res="No son parientes";
        }   
        return res;
    }
}
