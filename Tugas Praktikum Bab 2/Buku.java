import java.util.List;

public class Buku {
    private String judul;
    private List<String> penulis;
    private String sinopsis;

    public Buku(String judul, List<String> penulis, String sinopsis){
        this.judul = judul;
        this.penulis = penulis;
        this.sinopsis = sinopsis;
    }

    public String getJudul(){
        return judul;
    }

    public List<String> getPenulis(){
        return penulis;
    }

    public String getSinopsis(){
        return sinopsis;
    }

    public int countWords(String sentence) {
        sentence = sentence.trim();
        if (sentence.isEmpty()) {
            return 0;
        }
        int count = 1;
        for (int i = 0; i < sentence.length(); i++) {
            if (sentence.charAt(i) == ' ') {
                count++;
            }
        }
        return count;
    }

    public Buku copy(){
        Buku copy = new Buku(this.judul, this.penulis, this.sinopsis);
        return copy;
    }
    
}
