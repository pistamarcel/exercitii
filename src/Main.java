public class Main {
    public static void main(String[] args) {
   Caine caine= new Caine()  ;


   caine.mananca();
   caine.sunet();
     System.out.println(caine.inteligenta);
     caine.reproducere();
     caine.vaneaza();
    }



  public void exemplificarepersoana(){ Persoane persoana= new Persoane();
        System.out.println(persoana.nume);
        System.out.println(persoana.varsta);
        System.out.println(persoana.adresa);
        persoana.plimbare();
        persoana.gateste();

        System.out.println(Persoane.SPECIE);
        System.out.println( Persoane.respira(8));
        System.out.println(persoana.SPECIE);
        System.out.println(persoana.respira(12));}


    public static class Caine   {

        public boolean inteligenta;

        public void mananca(){
        System.out.println("Eu sunt un caine si imi place sa mananc oase.");

        }
    public void sunet(){
        System.out.println("Ham ham..");
        }


        public void reproducere() {
            System.out.println("Eu sunt un caine si imi hranesc copii cu lapte.");
        }


        public void vaneaza() {
            System.out.println("Eu sunt un caine de companie si nu pot vana");
        }
    }
}

