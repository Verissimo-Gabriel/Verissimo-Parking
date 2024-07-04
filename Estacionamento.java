package entities;

import java.time.Duration;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class Estacionamento implements OperacoesVeiculo {
    protected List<Veiculo> veiculos = new ArrayList<>();
    Veiculo veiculoRet;
    final double VALORHORA = 7.00;


    @Override
    public void entradaCarro(String placa, String modelo, String marca, LocalDateTime horaEntrada) {
        veiculos.add(new Carro(placa, modelo, marca));
    }

    @Override
    public void entradaMoto(String placa, String modelo, String marca, LocalDateTime horaEntrada) {
        veiculos.add(new Moto(placa, modelo, marca));
    }

    @Override
    public void saidaVeiculo(LocalDateTime horaSaida, String retirarPlaca) {

        Duration qtdTempo = Duration.between(veiculoRet.getHoraEntrada(), horaSaida);
        long qtdTempoHoras = qtdTempo.toHours();

        veiculos.removeIf(veiculoRet -> Objects.equals(veiculoRet.getPlaca(), retirarPlaca));

        System.out.println("Veículo retirado com sucesso. Valor a ser pago é: R$" + (VALORHORA + (qtdTempoHoras * 7.00)));
    }

    public boolean checkPlaca(String placa) {             //Verificador de placa
        boolean a = false;
        for (Veiculo veic : veiculos) {
            if (Objects.equals(veic.getPlaca(), placa)) {
                a = true;
                veiculoRet = veic;
            }
        }
        if (Objects.equals(placa, "")){
            a = true;
        }
        return a;
    }

    public void showVeiculos() {
        for (Veiculo veic : veiculos) {
            System.out.println(veic.toString());
        }
    }

    public void consultVeic(String consultPlaca) {
        try {

            for (Veiculo veic : veiculos) {
                if (Objects.equals(veic.getPlaca(), consultPlaca)) {
                    System.out.println(veic);
                }
            }
        } catch (Exception exception) {
            System.out.println("Erro ao consultar veículo.");
        }
    }

    public String checkModelo(String modelo) {
        if (Objects.equals(modelo, "")){
            modelo = "Modelo Desconhecido";
        }
        return modelo;
    }
}
