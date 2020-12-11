
public class Main {
    public static void main(String[] args) {
     /*  KapsamSınıfı kapsamSınıfı = new KapsamSınıfı();
       kapsamSınıfı.onileCarp();
       //Source = Mustafa Murat COŞKUN / UDEMY referans alınarak geliştirilmiştir..
*/
        //Java  Lokal tanımlanmış olan privateDeğisken kullandı private olarak tanımlananı değil
        //private olan değişkeni kullanmak için this anahtar kelimesini kullanmalıyız.
        //Java aynı isimli değişkenler arasından her zaman en yerel olanı tercih eder.
        KapsamSınıfı2.DahiliSınıf kapsamSınıfı2 = new KapsamSınıfı2().new DahiliSınıf();
        kapsamSınıfı2.onileCarp();
        
    }
    
}
