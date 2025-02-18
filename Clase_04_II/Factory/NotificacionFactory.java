package Clase_04_II.Factory;

public class NotificacionFactory {
    public static Notificacion getNotificacion(TipoNotificacion tipoNotificacion) {
        switch (tipoNotificacion) {
            case EMAIL:
                return new NotificacionEmail();
            case SMS:
                return new NotificacionSMS();
            case PUSH:
                return new NotificacionPush();
            default:
                throw new IllegalArgumentException("Tipo de notificacion no valida");
        }

    }
}
