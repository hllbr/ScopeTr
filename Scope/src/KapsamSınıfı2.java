
public class KapsamSınıfı2 {
    private int privateDegisken = 30 ;
    public KapsamSınıfı2(){
        
    }
    public void dahiliSınıfKontrol(){
       DahiliSınıf dahiliSınıf = new DahiliSınıf();
        System.out.println("Dahili sınıf Kontrol ediliyor....");
        System.out.println(dahiliSınıf.a);
    }
    public class DahiliSınıf{
        //Inner Class is here
        private int privateDegisken = 20 ;
        private int a = 3 ;
        
        public void onileCarp(){
           // int privateDegisken = 10 ;//her zaman en lokal olan değişken tercih edilir java tarafından
            for(int i = 1;i<6;i++){
                System.out.println(i+" * "+KapsamSınıfı2.this.privateDegisken +" = "+(i*KapsamSınıfı2.this.privateDegisken));
            }
        }
    }
    
}
