package hotel;

public class ReservaService {

    public static final String MSG_CLIENTE_CON_RESERVA =
            "El cliente ya tiene reservas activas en esas fechas";

    private final ReservaRepository reservaRepository;
    private final DisponibilidadService disponibilidadService;
    private final AlternativaService alternativaService;

    public ReservaService(ReservaRepository reservaRepository,
                          DisponibilidadService disponibilidadService,
                          AlternativaService alternativaService) {
        this.reservaRepository = reservaRepository;
        this.disponibilidadService = disponibilidadService;
        this.alternativaService = alternativaService;
    }

    public String registrarReserva(Reserva reserva) {
        if (reservaRepository.clienteTieneReservaActivaEnFechas(
                reserva.getClienteId(),
                reserva.getFechaEntrada(),
                reserva.getFechaSalida())) {
            return MSG_CLIENTE_CON_RESERVA;
        }

        return "";
    }
}