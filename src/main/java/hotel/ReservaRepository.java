package hotel;

import java.time.LocalDate;

public interface ReservaRepository {
    boolean existeCodigoReserva(String codigoReserva);
    boolean clienteTieneReservaActivaEnFechas(String clienteId, LocalDate fechaEntrada, LocalDate fechaSalida);
}