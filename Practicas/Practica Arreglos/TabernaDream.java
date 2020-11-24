public class TabernaDream{
    private Dream memories[];
    public TabernaDream(int tam){
        memories = new Dream [tam];
    }

    public boolean addDream(Dream d){
        boolean res = false;
        for(int i=0;i<memories.length && res==false;i++){
            if(memories[i]==null){
                memories[i]=d;
                res=true;
            }
        }
        return res;
    }

    public void showDreams(){
        for(int i=0;i<memories.length;i++){
            if(memories[i]!=null){
                Dream d=memories[i];
                d.getNombre();
                System.out.println(d.getNombre());
                System.out.println(d.getDescripcion());
            }
        }
    }

    public Dream searchDream(String name){
        Dream res=null;
        for(int i=0;i<memories.length;i++){
            if(memories[i]!=null){
                Dream d=memories[i];
                if(d.getNombre().equals(name)){
                   res=d;
                   break;
                }
            }
        }
        return res;
    }

    public boolean deteleDream(int num){
        boolean res = false;
        for(int i=0;i<memories.length && res==false;i++){
            Dream actual = memories[i];
            if(i==num){
                res = true;
                memories [i]=null;
            }
        }
        return res;
    }
}
