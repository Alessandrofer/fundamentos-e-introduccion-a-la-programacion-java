public class ContactBook{
    private User[] contacts;
    public ContactBook(){
        contacts= new User[50];
    }

    public boolean addContact(User us){
        boolean res=false;
        for(int i=0;i<contacts.length;i++){
            if(contacts[i]==null){
                contacts[i]=us;
                res=true;
                break;
            }
        }
        return res;
    }

    public boolean deleteContact(int num){
        boolean res=false;
        for(int i=0;i<contacts.length && res==false;i++){
            User actual = contacts[i];
            if(i==num){
                res=true;
                contacts[i]=null;
            }
        }
        return res;
    }

    public User searchContactFName(String name){
        User res=null;
        for(int i=0;i<contacts.length;i++){
            if(contacts[i]!=null){
                User na=contacts[i];
                if(na.getName().equals(name)){
                    res=na;
                    break;
                }
            }
        }
        return res;
    }

    public User searchContactFNumb(int numberS){
        User res=null;
        for(int i=0;i<contacts.length;i++){
            if(contacts[i]!=null){
                User nu=contacts[i];
                if(nu.getNumber()==numberS){
                    res=nu;
                    break;
                }
            }
        }
        return res;
    }

    public void showAllContacts(){
        System.out.println("All Contacts ");
        System.out.println("------------------");
        for(int i=0;i<contacts.length;i++){
            if(contacts[i]!=null){
                User inf=contacts[i];
                inf.getName();
                System.out.println("Name: "+inf.getName());
                System.out.println("Year: "+inf.getYear());
                System.out.println("Number: "+inf.getNumber());
                System.out.println("------------------");
            }
        }
    }

    /*public void sortContacts(){// verificar
        for (int j = 0; j < contacts.length; j++) {
            for (int i = 0; i < contacts.length - j; i++) {
                if (User.contacts.getName[contacts].compareTo(contacts[i + 1]) > 0) {
                    String aux;
                    aux = nombres[i];
                    nombres[i] = nombres[i + 1];
                    nombres[i + 1] = aux;
                }
            }
        }
    }*/
}
