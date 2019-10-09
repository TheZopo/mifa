package fr.mifa.core.network.protocol;

import fr.mifa.core.models.Reaction;

public class ReactionPacket extends Packet {
    private Reaction reaction;

    private int messageId;

    private String roomName;

    public Reaction getReaction() {
        return reaction;
    }

    public void setReaction(Reaction reaction) {
        this.reaction = reaction;
    }

    public int getMessageId() {
        return messageId;
    }

    public void setMessageId(int messageId) {
        this.messageId = messageId;
    }

    public String getRoomName() {
        return roomName;
    }

    public void setRoomName(String roomName) {
        this.roomName = roomName;
    }

    public ReactionPacket(Reaction reaction, int messageId, String roomName) {
        this.reaction = reaction;
        this.messageId = messageId;
        this.roomName = roomName;
    }
}
