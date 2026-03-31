package hotel;

import java.time.LocalDate;

public class Reserva {

    private  String codigoReserva;
    private  String clienteId;
    private  LocalDate fechaEntrada;
    private  LocalDate fechaSalida;
    private  String tipoHabitacion;

    public Reserva(String codigoReserva, String clienteId,
                          LocalDate fechaEntrada, LocalDate fechaSalida,
                          String tipoHabitacion) {
        this.codigoReserva = codigoReserva;
        this.clienteId = clienteId;
        this.fechaEntrada = fechaEntrada;
        this.fechaSalida = fechaSalida;
        this.tipoHabitacion = tipoHabitacion;
    }

    public String getCodigoReserva() {
        return codigoReserva;
    }

    public String getClienteId() {
        return clienteId;
    }

    public LocalDate getFechaEntrada() {
        return fechaEntrada;
    }

    public LocalDate getFechaSalida() {
        return fechaSalida;
    }

    public String getTipoHabitacion() {
        return tipoHabitacion;
    }
}