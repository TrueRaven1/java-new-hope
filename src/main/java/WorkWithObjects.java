import model.Student;

public class WorkWithObjects {
    public static void main(String[] args) {
        Student nikolajs = new Student();
        nikolajs.setFirstName("Nikolajs");
        nikolajs.setLastName("Gr.");
        nikolajs.setEmail("sexyboy@napljazhe.gr");
        nikolajs.setAge(21);

        Student dasha = new Student();
        dasha.setFirstName("Darja");
        dasha.setLastName("Ag.");
        dasha.setEmail("notfor@you.lv");
        dasha.setAge(18);

        Student lena = new Student("Helena", "Ne.", "hel@ena.lv");
        lena.setAge(21);

//        System.out.println(nikolajs.getFirstName() + " " + nikolajs.getLastName());
//        System.out.println(dasha.getFirstName() + " " + dasha.getLastName());

//        System.out.println(nikolajs.getFullName());
//        System.out.println(dasha.getFullName());

        nikolajs.printFullInfo();
        dasha.printFullInfo();
        lena.printFullInfo();
    }
}
//sozdatj 2 project s Gradle i nazvatj krasivo (pro zametki)
//sozdatj novije objecti 1.zametka 2.poljzovatelj(pohozh na studenta) 3. kategorija ( po rabote, po domu, kupitj v magazine)
//pola svoistva, getteri setteri, konstruktor.
//3 zadanie, novij klass gde zapolnitj kazhdij object i metodi vivesti v konsolj.
//zametka //poljzovateli //kategorii

// 4. V klasse bil metod otobrazhenija vseh zametok
// 5. Metod otobrazhatj zametki konkretnogo poljzovatelja
// 6. Kategorii sdelatj Enamom

//7. V proekte s zametkami sozdatj strukturu proekta, dobavitj biblioteki springweb i 2,
//8. controller, endpoint s adresom (otobrazhatj vse zametki) (shou notes),zapolnitj objekt i peredatj na controller, ispoljzuja model otobrazhatj na stranichke zametki
//9. otobrazhatj vse zametki ispoljzuja for cikl u timeleaf
//10, sdelatj otdeljnij endpoint v kotorom peredovatj imeil poljzovatelja, i na stranichke budut otobrazheni zametki konkretnogo poljzovatelja
// /points /