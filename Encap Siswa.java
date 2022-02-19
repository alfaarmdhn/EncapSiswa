
package encapsiswa;

public class EncapSiswa {
     private String name;
     private String address;
     private int age;
     
     public String getName(){
         return name;
     }
     public String getAddress(){
         return address;
     }
     public int getAge(){
         return age;
     }
     public void setName(String newName){
         name = newName;
     }
     public void setAddress(String newAddress){
         address = newAddress;
     }
     public void setAge(int newAge){
         age = newAge;
     }
     public void cetak(){
        System.out.println("Nama\t: "+getName());
        System.out.println("Alamat\t: "+getAddress());
        System.out.println("Umur\t: "+getAge());
     }

}
