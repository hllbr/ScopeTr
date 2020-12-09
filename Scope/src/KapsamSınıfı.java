
public class KapsamSınıfı {
    private int privateDegisken = 30;
    public KapsamSınıfı(){
        System.out.println("privateDeğisken = "+privateDegisken);
        
    }
    public void onileCarp(){
        int privateDegisken = 10 ;
        for(int i = 1;i<6;i++){
            System.out.println(i+" * "+this.privateDegisken +" = "+(i*this.privateDegisken));
        }
    }
    
}
