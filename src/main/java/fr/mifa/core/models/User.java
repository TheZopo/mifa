package fr.mifa.core.models;

import java.util.ArrayList;

public class User extends Model {
    private String nickname;

    private ArrayList<Integer> joinedRoomsIds;

    public ArrayList<Integer> getJoinedRoomsIds() {
        return joinedRoomsIds;
    }

    public void setJoinedRoomsIds(ArrayList<Integer> joinedRoomsIds) {
        this.joinedRoomsIds = joinedRoomsIds;
    }

    public String getNickname() {
        return nickname;
    }

    public void setNickname(String nickname) {
        this.nickname = nickname;
    }
}
