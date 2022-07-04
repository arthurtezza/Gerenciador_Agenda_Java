public class Contato {
    
private String nome, endereco, telefone;
private int diaNascimento, mesNascimento, anoNascimento;
private boolean favorito;   
private static int totalContatos;

    //sets
    
    public void setNome(String nome) {
        this.nome = nome;
    }
    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }
    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }
    public void setDiaNascimento(int diaNascimento) {
        this.diaNascimento = diaNascimento;
    }
    public void setMesNascimento(int mesNascimento) {
        this.mesNascimento = mesNascimento;
    }
    public void setAnoNascimento(int anoNascimento) {
        this.anoNascimento = anoNascimento;
    }
    public void setFavorito(boolean favorito) {
        this.favorito = favorito;
    }
    public static void setTotalContatos(int totalContatos) {
        Contato.totalContatos = totalContatos;
    }

    //gets

    public String getNome() {
        return nome;
    }
    public String getEndereco() {
        return endereco;
    }
    public String getTelefone() {
        return telefone;
    }
    public int getDiaNascimento() {
        return diaNascimento;
    }
    public int getMesNascimento() {
        return mesNascimento;
    }
    public int getAnoNascimento() {
        return anoNascimento;
    }
    public boolean getFavorito(){
        return favorito;
    }
    public static int getTotalContatos() {
        return totalContatos;
    }

    //Cosntrutores

    public Contato(String nome, String endereco, String telefone, int diaNascimento, int mesNascimento, int anoNascimento, boolean favorito){
        this.nome = nome;
        this.endereco = endereco;
        this.telefone = telefone;
        this.diaNascimento = diaNascimento;
        this.mesNascimento = mesNascimento;
        this.anoNascimento = anoNascimento;
        this.favorito = favorito;
    }

    public Contato(String nome, String endereco, String telefone, int diaNascimento, int mesNascimento, int anoNascimento){
        this.nome = nome;
        this.endereco = endereco;
        this.telefone = telefone;
        this.diaNascimento = diaNascimento;
        this.mesNascimento = mesNascimento;
        this.anoNascimento = anoNascimento;
    }



}
