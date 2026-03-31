package hotel;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

import java.time.LocalDate;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.verifyNoInteractions;
import static org.mockito.Mockito.when;

@ExtendWith(MockitoExtension.class)
public class ReservaServiceTest {

    @Mock
    private ReservaRepository reservaRepository;

    @Mock
    private DisponibilidadService disponibilidadService;

    @Mock
    private AlternativaService alternativaService;

    @InjectMocks
    private ReservaService reservaService;

    @Test
    void noDebeRegistrarReservaSiClienteYaTieneReservaActivaEnLasMismasFechas() {
        Reserva request = new Reserva(
                "HR1234",
                "CLI001",
                LocalDate.of(2026, 4, 10),
                LocalDate.of(2026, 4, 15),
                "DOBLE"
        );

        when(reservaRepository.clienteTieneReservaActivaEnFechas(
                "CLI001",
                LocalDate.of(2026, 4, 10),
                LocalDate.of(2026, 4, 15)
        )).thenReturn(true);

        String resultado = reservaService.registrarReserva(request);

        assertEquals(ReservaService.MSG_CLIENTE_CON_RESERVA, resultado);

        verify(reservaRepository).clienteTieneReservaActivaEnFechas(
                "CLI001",
                LocalDate.of(2026, 4, 10),
                LocalDate.of(2026, 4, 15)
        );

        verifyNoInteractions(disponibilidadService, alternativaService);
    }
}