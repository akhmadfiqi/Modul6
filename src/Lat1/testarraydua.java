package Lat1;

public class testarraydua {
        int nis [][] = {{210651},{210652},{210653}};
        String nama [][] = {{"Yoga Cahya"},{"Ahmad Khoirudin"},{"Akhmad Fiqi"}};
        
    public void tampil(){
        System.out.println("Identitas Siswa Angkatan 25");
    }
    public void namanis (){
        for (int i = 0; i< 3; i++){
        for (int j = 0; j < 1; j++){
    System.out.println(nama[i][j]+":"+nis[i][j]);
        }
        }
        }
    public static void main(String[]args){
        testarraydua siswa = new testarraydua();
        siswa.tampil();
        siswa.namanis();
    }
    }
