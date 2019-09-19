package fr.mifa.core.network.protocol;

public class AuthPacket extends Packet {
    private String nickname;

    public String getNickname() {
        return nickname;
    }

    public void setNickname(String nickname) {
        this.nickname = nickname;
    }
}
