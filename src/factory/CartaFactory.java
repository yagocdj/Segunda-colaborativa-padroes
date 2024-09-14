package factory;

import carta.Carta;
import enums.Cor;
import enums.Naipe;

public interface CartaFactory {
    Carta criarCarta(String face, int valor, Cor cor);
    Carta criarCarta(String face, int valor, Cor cor, Naipe naipe);
}
