package SetterGetter;

public class SetterGetter {
    public String variable; //variabel atau atribut
    public void set (String variable) //method buat set variabel
    {
        this.variable = variable; //menetapkan nilai ke variabel
    }
    public String get () //method buat get variabel
    {
        return variable; //mengembalikan nilai variabel ke fungsi atau kelas yang memanggilnya
    }
}
