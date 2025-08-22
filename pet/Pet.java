package pet;

public class Pet {
    private String nomeESobrenome;
    private String tipoDoPet;
    private String sexoDoAnimal;
    private String enderecoEBairroEncontrado;
    private int idadeAproximada;
    private double pesoAproximado;
    private String racaAnimal;

    public double getPesoAproximado() {
        return pesoAproximado;
    }

    public void setPesoAproximado(double pesoAproximado) {
        this.pesoAproximado = pesoAproximado;
    }

    public String getRacaAnimal() {
        return racaAnimal;
    }

    public void setRacaAnimal(String racaAnimal) {
        this.racaAnimal = racaAnimal;
    }

    public String getNomeESobrenome() {
        return nomeESobrenome;
    }

    public void setNomeESobrenome(String nomeESobrenome) {
        this.nomeESobrenome = nomeESobrenome;
    }

    public String getEnderecoEBairroEncontrado() {
        return enderecoEBairroEncontrado;
    }

    public void setEnderecoEBairroEncontrado(String enderecoEBairroEncontrado) {
        this.enderecoEBairroEncontrado = enderecoEBairroEncontrado;
    }

    public int getIdadeAproximada() {
        return idadeAproximada;
    }

    public void setIdadeAproximada(int idadeAproximada) {
        this.idadeAproximada = idadeAproximada;
    }

    public enum tipoAnimal {
        CACHORRO(1),
        GATO(2);

        private final int valor;

        tipoAnimal(int valor) {
            this.valor = valor;
        }

        public int getValor() {
            return valor;
        }
    }



    public enum sexoAnimal {
        FEMEA,
        MACHO
    }
}
