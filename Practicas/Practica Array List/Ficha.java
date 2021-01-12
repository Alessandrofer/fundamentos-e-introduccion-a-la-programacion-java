public class Ficha{
    private String id;
    
    public Ficha(int num){
        String n=num+"";
        if(num>0&&num<10){
            n="0"+num;
        }
        this.id="C1-"+n;
    }
    
    public String getId(){
        return id;
    }
}
