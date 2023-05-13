package SetterGetter;

public class Main {
    public static void main(String[] args) {
        String x; //deklarasi variabel
        SetterGetter object = new SetterGetter(); //membuat objek baru
        object.set("value"); //set nilai ke variabel objek
        x = object.get(); //get nilai dari variabel objek
        System.out.print(x); //cetak nilai variabel ke layar
    }
}
