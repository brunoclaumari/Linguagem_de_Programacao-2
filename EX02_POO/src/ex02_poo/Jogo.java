package ex02_poo;

import java.text.SimpleDateFormat;
import java.util.Date;

/**
 *
 * @author BRUNOSILVA
 */
class Jogo {

    private int codigo;
    private String nome;
    private String categoria;
    private Date data;

    /**
     * @return the codigo
     */
    public int getCodigo() {
        return codigo;
    }

    /**
     * @param codigo the codigo to set
     */
    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    /**
     * @return the nome
     */
    public String getNome() {
        return nome;
    }

    /**
     * @param nome the nome to set
     */
    public void setNome(String nome) {
        this.nome = nome;
    }

    /**
     * @return the categoria
     */
    public String getCategoria() {
        return categoria;
    }

    /**
     * @param categoria the categoria to set
     */
    public void setCategoria(String categoria) {
        this.categoria = categoria;
    }

    /**
     * @return the data
     */
    public Date getData() {
        return data;
    }

    /**
     * @param data the data to set
     */
    public void setData(Date data) {
        this.data = data;
    }
    
     @Override
    public String toString() {
        SimpleDateFormat formato = new SimpleDateFormat("dd/MM/yyyy");
        
        return "Código: "+ this.codigo +
                "\nNome: " + this.nome + 
                "\nCategoria: " + this.categoria + 
                "\nData de Lançamento: " + formato.format(this.data);
    }

}
