package br.com.joao.gestao_vagas.execeptions;

public class ErroMessageDTO {

    private String mensagem;
    private String field;

    // Construtor com parâmetros
    public ErroMessageDTO(String mensagem, String field) {
        this.mensagem = mensagem;
        this.field = field;
    }

    // Getters e setters
    public String getMensagem() {
        return mensagem;
    }

    public void setMensagem(String mensagem) {
        this.mensagem = mensagem;
    }

    public String getField() {
        return field;
    }

    public void setField(String field) {
        this.field = field;
    }
}
