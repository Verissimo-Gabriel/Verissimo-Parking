package entities;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;


public abstract class Veiculo {
    protected String placa;
    protected String modelo;
    protected String marca;
    protected LocalDateTime horaEntrada;
    private final DateTimeFormatter fmt = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm");

    public Veiculo(String placa, String modelo, String marca) {
        this.placa = placa;
        this.modelo = modelo;
        this.marca = marca;
        this.horaEntrada = LocalDateTime.now();
    }

    public String getPlaca() {
        return placa;
    }

    public String getModelo() {
        return modelo;
    }

    public String getMarca() {
        return marca;
    }


    public LocalDateTime getHoraEntrada() {
        return horaEntrada;
    }


    @Override
    public String toString() {
        return getMarca() +
                " " +
                getModelo().toUpperCase() +
                ". Placa: " + getPlaca() +
                ". Hora de Entrada: " + getHoraEntrada().format(fmt) +
                ".";
    }
}
