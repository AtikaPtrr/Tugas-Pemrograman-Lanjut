package pemrogramanlanjut;

public class Nim {
    char Lulus;
    char Tahun;
    char Masuk;
    char fakul;
    char pro;
    char di;
    char gen;


    private String nim;


    public void setNim(String nim){

        this.nim = nim;
    }

    public String getLulus(){

        Lulus = nim.charAt(0);

        if (Lulus == '1'){
            return "S1 (Sarjana)";
        }
        if (Lulus == '2'){
            return "S2 (Magister)";
        }
        if (Lulus == '3'){
            return "S3 (Doktor)";}

        return "UNKNOWN";
    }

    public String getTahun(){

        Tahun = nim.charAt(1);
        Masuk = nim.charAt(2);

        String yy = "20";
        String TahunMasuk = yy+Tahun+Masuk;
        return TahunMasuk;
    }

    public String getFakultas(){
        fakul = nim.charAt(3);

        if (fakul== '1'){
            return "TARBIYAH DAN KEGURUAN";
        }
        if (fakul== '2'){
            return "SYARI’AH DAN HUKUM";
        }
        if (fakul== '3'){
            return "USHULUDDIN";
        }
        if (fakul== '4'){
            return "DAKWAH &  KOMUNIKASI";
        }
        if (fakul== '5'){
            return "SAINS DAN TEKNOLOGI";
        }
        if (fakul== '6'){
            return "PSIKOLOGI";
        }
        if (fakul== '7'){
            return "EKONOMI DAN ILMU SOSIAL";
        }
        if (fakul== '8'){
            return "PERTANIAN DAN PETERNAKAN";
        }
        return "UNKNOWN";

    }

    public String getProdi(){
        pro = nim.charAt(4);
        di = nim.charAt(5);
        if (pro == '0' && di=='1'){
            return "Teknik Informatika";
        }
        if (pro == '0' && di=='2'){
            return "Teknik Industri";
        }
        if (pro == '0' && di =='3'){
            return "Sistem Informasi ";
        }
        if (pro == '0' && di =='4'){
            return "Matematika";
        }
        if (pro == '0' && di =='5'){
            return "Teknik Elektro";
        }
        return "UNKNOWN";
    }

    public String getGender(){
        gen = nim.charAt(6);
        if(gen == '1'){
            return "LAKI-LAKI";
        }
        if(gen == '2'){
            return "PEREMPUAN";
        }
        return "UNKNOWN";
    }

    public String getNomor(){
        String n = nim.substring(7);
        return n;
    }
        
        
        
    }

