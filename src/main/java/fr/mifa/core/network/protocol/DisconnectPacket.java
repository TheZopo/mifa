package fr.mifa.core.network.protocol;

public class DisconnectPacket extends Packet {
    private String reason;

    public String getReason() {
        return reason;
    }

    public void setReason(String reason) {
        this.reason = reason;
    }

    public DisconnectPacket(String reason) {
        this.reason = reason;
    }
}
