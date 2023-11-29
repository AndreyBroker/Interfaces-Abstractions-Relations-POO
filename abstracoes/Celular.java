package abstracoes;

import Interfaces.InterfaceCelular;
import objetosGenericos.Capinha;
import objetosGenericos.Tela;

public abstract class Celular implements InterfaceCelular{
    protected String nome;
    protected String marca;
    protected int memoria;
    protected Tela tela;
    protected Capinha capinha;

    public Celular(String nome, String marca, int memoria, double tamanho_tela){
        this.nome = nome;
        this.marca = marca;
        this.memoria = memoria;
        this.tela = new Tela(tamanho_tela);
    }

    @Override
    public String getMarca() {
        return this.marca;
    }

    @Override
    public String getNome() {
        return this.nome;
    }

    @Override
    public int getMemoria() {
        return this.memoria;
    }

    public void setCapinha(Capinha capinha){
        this.capinha = capinha;
    }

    public void setTela(Tela tela){
        this.tela = tela;
    }

    public Tela getTela() {
        return this.tela;
    }
}
