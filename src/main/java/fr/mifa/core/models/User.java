package fr.mifa.core.models;

import fr.mifa.core.network.PacketManager;

public class User extends Model {
    private String nickname;

    private transient PacketManager packetManager;

    private boolean connected;

    public boolean isConnected() {
        return connected;
    }

    public void setConnected(boolean connected) {
        this.connected = connected;
    }

    public PacketManager getPacketManager() {
        return packetManager;
    }

    public void setPacketManager(PacketManager packetManager) {
        this.packetManager = packetManager;
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
        this.connected = true;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj instanceof User) {
            User user = (User) obj;
            return nickname.equals(user.nickname) && user.getId() == this.getId();
        }
        return super.equals(obj);
    }
}
