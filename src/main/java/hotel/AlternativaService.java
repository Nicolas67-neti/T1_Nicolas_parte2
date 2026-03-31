package hotel;

import java.time.LocalDate;
import java.util.List;

public interface AlternativaService {
    List<String> sugerirAlternativas(String tipoHabitacion, LocalDate fechaEntrada, LocalDate fechaSalida);
}