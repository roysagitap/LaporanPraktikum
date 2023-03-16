import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main{
  public static void main(String[] args) {
    List<Buku> teknologi = new ArrayList<>();
    teknologi.add(new Buku("Cara menjadi hengker", Arrays.asList("Ahmad", "Nurul")));
    teknologi.add(new Buku("Build pc dalam 5 menit", Arrays.asList("Adinda")));
    teknologi.add(new Buku("Cara hack satelit nasa", Arrays.asList("Roy", "Rafli")));
    teknologi.add(new Buku("Tutor membuat bahasa pemrograman", Arrays.asList("Mustika")));
    teknologi.add(new Buku("cara membuat aplikasi", Arrays.asList("Marck zuck")));

    List<Buku> filsafat = new ArrayList<>();
    filsafat.add(new Buku("Biografi plato", Arrays.asList("Eddelwif", "Morgan", "Paul")));
    filsafat.add(new Buku("Makna berperasaan", Arrays.asList("Affandi")));
    filsafat.add(new Buku("Peradaban atlantic", Arrays.asList("Plato")));
    filsafat.add(new Buku("Berkehidupan dimasyarakat", Arrays.asList("Prabowo")));
    filsafat.add(new Buku("Archipelago", Arrays.asList("Elsa")));

    List<Buku> sejarah = new ArrayList<>();
    sejarah.add(new Buku("Perkembangan indonesia", Arrays.asList("Zubair", "Ulil")));
    sejarah.add(new Buku("Melawan penjajah", Arrays.asList("Soekarno")));
    sejarah.add(new Buku("History of Bandung", Arrays.asList("H. Yakub")));
    sejarah.add(new Buku("Indonesia", Arrays.asList("Ahmad Subarjo")));
    sejarah.add(new Buku("Majapahit penyatu bangsa", Arrays.asList("Hatta")));

    List<Buku> agama = new ArrayList<>();
    agama.add(new Buku("Islam", Arrays.asList("Habib Almad")));
    agama.add(new Buku("Kristen", Arrays.asList("Albert")));
    agama.add(new Buku("Katolik", Arrays.asList("Van Djik")));
    agama.add(new Buku("Hindu", Arrays.asList("Malaka")));
    agama.add(new Buku("Budha", Arrays.asList("Shang yhang")));

    List<Buku> psikologi = new ArrayList<>();
    psikologi.add(new Buku("Mental health", Arrays.asList("Maria")));
    psikologi.add(new Buku("Cintaku", Arrays.asList("Evan")));
    psikologi.add(new Buku("Perasaan yang terpendam", Arrays.asList("Afril Estika", "Maulana")));
    psikologi.add(new Buku("Kasih kegelapan", Arrays.asList("Kukuh")));
    psikologi.add(new Buku("Fungsi otak", Arrays.asList("Lili", "Ilmi")));

    List<Buku> politik = new ArrayList<>();
    politik.add(new Buku("Banteng membanteng", Arrays.asList("Munir")));
    politik.add(new Buku("Indonesia dimata penguasa", Arrays.asList("Suharto")));
    politik.add(new Buku("Cara kebal hukum", Arrays.asList("Achmad Subarjo", "Asep")));
    politik.add(new Buku("Menari diatas kebenaran", Arrays.asList("Muddah")));
    politik.add(new Buku("Tangisan rakyat", Arrays.asList("Pandawa")));

    List<Buku> fiksi = new ArrayList<>();
    fiksi.add(new Buku("Mengalahkan thanos", Arrays.asList("Thor", "Iron Man", "Captain amer")));
    fiksi.add(new Buku("Mendapatkan hatimu", Arrays.asList("Sonia")));
    fiksi.add(new Buku("Memadamkan matahari", Arrays.asList("Jono")));
    fiksi.add(new Buku("Hidup didalam planet jupiter", Arrays.asList("Widi")));
    fiksi.add(new Buku("Tutor ngepet", Arrays.asList("Azza")));

    System.out.println("--- Daftar buku ---");

    System.out.println("\nKategori teknologi :");
    for(Buku buku : teknologi){
      System.out.println("- " + buku.getJudul() + " " + buku.getPenulis());
    }

    System.out.println("\nKategori Sejarah :");
    for(Buku buku : sejarah){
      System.out.println("- " + buku.getJudul() + " " + buku.getPenulis());
    }

    System.out.println("\nKategori agama :");
    for(Buku buku : agama){
      System.out.println("- " + buku.getJudul() + " " + buku.getPenulis());
    }

    System.out.println("\nKategori psikologi :");
    for(Buku buku : psikologi){
      System.out.println("- " + buku.getJudul() + " " + buku.getPenulis());
    }

    System.out.println("\nKategori politik :");
    for(Buku buku : politik){
      System.out.println("- " + buku.getJudul() + " " + buku.getPenulis());
    }

    System.out.println("\nKategori fiksi :");
    for(Buku buku : fiksi){
      System.out.println("- " + buku.getJudul() + " " + buku.getPenulis());
    }
  }
}