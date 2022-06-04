



public class Persoane {

    public static String SPECIE="homo-sapiens";
 // Atribute
String nume;
int varsta;
String adresa;

//Constructori
Persoane() {
    nume = "Maria";
    varsta = 25;
    adresa = "Strada Luminii, Nr: 45";
}
 Persoane( String nume, int varsta){
     this.nume=nume;
     this.varsta=varsta;
    }



  // Metode
void plimbare(){
    System.out.println("Ai plecat la plimbare.");
    }
void gateste(){
    System.out.println("Eu gatest pranzul.");
    }
public static boolean respira(int datadecedarii) {
 /*   if (datadecedarii > 0) {
        return false;
    } else {
        return true;*/

        return datadecedarii>0 ? false: true;
    }





}
