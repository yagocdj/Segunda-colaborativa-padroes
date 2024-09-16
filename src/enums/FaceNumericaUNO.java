package enums;

import carta.FaceUNO;

public enum FaceNumericaUNO implements FaceUNO{
    FACE_0("0", 0),
    FACE_1("1", 1),
    FACE_2("2", 2),
    FACE_3("3", 3),
    FACE_4("4", 4),
    FACE_5("5", 5),
    FACE_6("6", 6),
    FACE_7("7", 7),
    FACE_8("8", 8),
    FACE_9("9", 9);

    private final String nome;
    private final int valor;

    private FaceNumericaUNO(String nome, int valor) {
        this.nome = nome;
        this.valor = valor;
    }

    public String getNome(){
        return nome;
    }

    public int getValor(){
        return valor;
    }
}
