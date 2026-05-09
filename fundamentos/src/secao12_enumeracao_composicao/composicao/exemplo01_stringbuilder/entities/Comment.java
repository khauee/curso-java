package secao12_enumeracao_composicao.composicao.exemplo01_stringbuilder.entities;

public class Comment {

    private String text;

    public  Comment() {
    }

    public Comment(String text) {
        this.text = text;
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }
}
