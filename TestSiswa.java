
package encapsiswa;

public class TestSiswa {
    
    public static void main(String[] args) {
        EncapSiswa siswa = new EncapSiswa();
        siswa.setName("Kera Ngalam");
        siswa.setAddress("Rajajowas");
        siswa.setAge(100);
        siswa.cetak();
        
        EncapSiswa siswa1 = new EncapSiswa();
        siswa1.setName("Umak Apais");
        siswa1.setAddress("Nukus");
        siswa1.setAge(1);
        siswa1.cetak();
        
        EncapSiswa siswa2 = new EncapSiswa();
        siswa2.setName("yOo");
        siswa2.setAddress("sby");
        siswa2.setAge(16);
        siswa2.cetak();
        
        System.out.println("Nama\t: "+siswa.getName());
        System.out.println("Alamat\t: "+siswa.getAddress());
        System.out.println("Umur\t: "+siswa.getAge());
        
}
  
}
