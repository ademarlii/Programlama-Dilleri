public class Gramer {
    public static int sp;
    public static int sp1;

    public static String[] ozne={"Ben", "Sen", "Hasan", "Nurşah", "Elif", "Abdulrezzak", "Şehribanu", "Zeynelabidin", "Naki"};
    public static String[] nesne={"Bahçe", "Okul", "Park", "Sınıf", "Yarın", "Pazartesi", "Salı", "Çarşamba", "Perşembe", "Cuma", "Cumartesi", "Pazar", "Merkez", "Ev", "Kitap", "Defter", "Güneş", "Beydağı"};
    public static String[] yuklem= {"Gitmek", "Gelmek", "Okumak", "Yazmak", "Yürümek", "Görmek"};

    public void kontrolEt(String metin) {
        String[] text = metin.split("\\s");
        sp = text.length - 1;
        sp1 = 0;
        while (sp1 <= sp) {
            if (text[sp1].equals(" ")) {
                sp1++;
            }
            if (subject(text[sp1])) {
                sp1++;
            } else {
                System.out.println("HAYIR");
                return;
            }
            if (object(text[sp1])) {
                sp1++;
            } else {
                System.out.println("HAYIR");
                return;
            }
            if (predicate(text[sp1])) {
                System.out.println("EVET");
                return;
            } else {
                System.out.println("HAYIR");

            }
        }
    }

    public boolean subject(String kelime) {
        for (int i = 0; i < ozne.length; i++) {
            if (kelime.equals(ozne[i])) {
                return true;
            }
        }
        return false;
    }

    public boolean object(String kelime) {
        for (int i = 0; i < nesne.length; i++) {
            if (kelime.equals(nesne[i])) {
                return true;
            }
        }
        return false;
    }

    public boolean predicate(String kelime) {
        for (int i = 0; i < yuklem.length; i++) {
            if (kelime.equals(yuklem[i])) {
                return true;
            }
        }
        return false;
    }
}
