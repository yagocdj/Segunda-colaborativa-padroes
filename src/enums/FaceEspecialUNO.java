package enums;

import carta.FaceUNO;

public enum FaceEspecialUNO implements FaceUNO {
    INVERTER("Inverter", 20),
    PULAR("Pular", 20),
    MAIS_DOIS("+2", 20),
    CORINGA("Coringa", 50),
    MAIS_QUATRO("+4", 50),
    TROCAR_MAO("TrocaMao", 50);

    private final String nome;
    private final int valor;

    private FaceEspecialUNO(String nome, int valor) {
        this.nome = nome;
        this.valor = valor;
    }

    public String getNome() {
        return nome;
    }

    public int getValor() {
        return valor;
    }

}
