package entities;

import java.time.LocalDateTime;

public interface OperacoesVeiculo {
    void entradaCarro(String placa, String modelo, String marca, LocalDateTime horaEntrada);

    void entradaMoto(String placa, String modelo, String marca, LocalDateTime horaEntrada);

    void saidaVeiculo(LocalDateTime horaSaida, String retirarPlaca);

}
