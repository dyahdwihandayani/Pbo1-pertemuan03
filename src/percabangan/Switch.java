package percabangan;

public class Switch {
    public static void main(String[] args) {
        char nilai ='d';
        switch (nilai){
            case'A':
                System.out.println("Mhs  :\"Terimakasih pak\"");
                System.out.println("Dosen  :\"Selamat ya !!\"");
                break;
            case'B':
                System.out.println("Mhs  :\"Kenapa saya tidak dapat a,Pak \"");
                System.out.println("Dosen  :\"karna kamu tidak rajin Belajar....\"");
                break;
            case'C':
                System.out.println("Mhs  :\"saya turun trus pak ,tugas sering ngumpul jua\"");
                System.out.println("Dosen  :\"tapi bisa lah menjawab ujian\"");
                System.out.println("Mhs    :\"Hihihi...\"");
                break;
            default:
                System.out.println("Mhs  :\"saya turun trus pak ,tugas sering ngumpul jua\"");
                System.out.println("Dosen  :\"Bujur jua kah \"");
                System.out.println("Dosen  :\"*memeriksa berkas \"");
                System.out.println("Dosen  :\"*menceleng \"");
                System.out.println("Mhs    :\"kaburrrrr...\"");
                break;

        }
    }
}