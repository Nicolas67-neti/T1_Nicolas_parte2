package hotel;

import java.time.LocalDate;

public interface DisponibilidadService {
    boolean hayDisponibilidad(String tipoHabitacion, LocalDate fechaEntrada, LocalDate fechaSalida);
}