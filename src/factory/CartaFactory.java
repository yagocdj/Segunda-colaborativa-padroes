package factory;

import carta.Carta;
import enums.Cor;

public interface CartaFactory {
    Carta criarCarta(String face, int valor, Cor cor);
    Carta criarCarta(String face, int valor, Cor cor, String naipe);
}
