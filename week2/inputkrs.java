
public class inputkrs {
    public static void main (String[] args) {
        //TODO Auto-generated method stub
        krs krs1 = new krs();

        krs1.setMataKuliah("Pemrograman Web", 4);
        krs1.setMataKuliah("PBO", 2);
        krs1.setMataKuliah("Dasar Pemrograman", 1);
        krs1.setMataKuliah("Analisa dan Perancangan", 0);
        krs1.setMataKuliah("Pemrograman Game", 3);


        krs1.setSks(3, 0);
        krs1.setSks(4, 1);
        krs1.setSks(2, 2); 
        krs1.setSks(3, 3);
        krs1.setSks(2, 4);

        krs1.infoKrs();
    }
    
}
