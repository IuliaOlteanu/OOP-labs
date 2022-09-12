class Afisare{
    public void print(String args[]){
        for(int i=0;i<args.length;i++){
            System.out.println(args[i]);
        }
    }
}
public class Problema3{
    public static void main(String args[]){
        Afisare obiect= new Afisare();
        obiect.print(args);
    }
}