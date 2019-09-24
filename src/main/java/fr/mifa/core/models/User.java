package fr.mifa.core.models;

import fr.mifa.core.network.PacketManager;

public class User extends Model {
    private String nickname;

    private transient PacketManager packetManager;

    public PacketManager getPacketManager() {
        return packetManager;
    }

    public String getNickname() {
        return nickname;
    }

    public void setNickname(String nickname) {
        this.nickname = nickname;
    }

    public User(String nickname, PacketManager packetManager) {
        this.nickname = nickname;
        this.packetManager = packetManager;
    }
}
