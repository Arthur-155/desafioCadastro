package pet;

public class Pet {
    private String nomeESobrenome,enderecoEBairroEncontrado,racaAnimal,cidade,rua;
    private int idadeAproximada,numeroDaCasa;
    private double pesoAproximado;
    private tipoAnimal tipoDoAnimal;
    private sexoAnimal sexoDoAnimal;

    public tipoAnimal getTipoDoAnimal() {
        return tipoDoAnimal;
    }

    public void setTipoDoAnimal(tipoAnimal tipoDoAnimal) {
        this.tipoDoAnimal = tipoDoAnimal;
    }

    public sexoAnimal getSexoDoAnimal() {
        return sexoDoAnimal;
    }

    public void setSexoDoAnimal(sexoAnimal sexoDoAnimal) {
        this.sexoDoAnimal = sexoDoAnimal;
    }

    public int getNumeroDaCasa() {
        return numeroDaCasa;
    }

    public void setNumeroDaCasa(int numeroDaCasa) {
        this.numeroDaCasa = numeroDaCasa;
    }

    public String getCidade() {
        return cidade;
    }

    public void setCidade(String cidade) {
        this.cidade = cidade;
    }

    public String getRua() {
        return rua;
    }

    public void setRua(String rua) {
        this.rua = rua;
    }

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
        FEMEA(1),
        MACHO(2);

        private final int valor;

        sexoAnimal(int valor) {
            this.valor = valor;
        }

        public int getValor() {
            return valor;
        }
    }
}
