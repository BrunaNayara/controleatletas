package controleatleta;

import java.util.ArrayList;

public class Nadador extends Atleta {

    private char categoria; //P=Pré-Mirim  M=Mirim T=Petiz I=Infantil J=Junior 
    //V=Juvenil F=Infanto-Juvenil S=Junior-Senior
    private ArrayList<Premiacao> premiacoes;
    private Double envergadura; // Em cm
    private Double massaMagra;
    private Double massaGorda;
    private int totalCompeticoes;
    private int totalMedalhasOuro;
    private int totalMedalhasPrata;
    private int totalMedalhasBronze;
    

    public Nadador(String nome) {
        super(nome);
    }

    public char getCategoria() {
        return categoria;
    }

    public void setCategoria(char categoria) {
        this.categoria = categoria;
    }

    public int getTotalCompeticoes() {
        return totalCompeticoes;
    }

    public void setTotalCompeticoes(int competicoes) {
        this.totalCompeticoes = competicoes;
    }

    public int getTotalMedalhasOuro() {
        return totalMedalhasOuro;
    }

    public void setTotalMedalhasOuro(int medalhasOuro) {
        this.totalMedalhasOuro = medalhasOuro;
    }

    public int getTotalMedalhasPrata() {
        return totalMedalhasPrata;
    }

    public void setTotalMedalhasPrata(int medalhasPrata) {
        this.totalMedalhasPrata = medalhasPrata;
    }
    
    public int getTotalMedalhasBronze() {
        return totalMedalhasBronze;
    }

    public void setTotalMedalhasBronze(int medalhasBronze) {
        this.totalMedalhasBronze = medalhasBronze;
    }

    public Double getEnvergadura() {
        return envergadura;
    }
    

    public void setEnvergadura(Double envergadura) {
        this.envergadura = envergadura;
    }
    
    
    public Double getMassaGorda() {
        return massaGorda;
    }

    public void setMassaGorda(Double massaGorda) {
        this.massaGorda = massaGorda;
    }
    
    public Double getMassaMagra() {
        return massaMagra;
    }

    public void setMassaMagra(Double massaMagra) {
        this.massaMagra = massaMagra;
    }

    
    
    public ArrayList<Premiacao> getPremiacoes() {
        return premiacoes;
    }

    public void setPremiacoes(ArrayList<Premiacao> premiacoes) {
        this.premiacoes = premiacoes;
    }   

    

}