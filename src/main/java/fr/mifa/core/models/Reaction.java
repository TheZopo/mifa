package fr.mifa.core.models;

import fr.mifa.core.enums.ReactionTypeEnum;

public class Reaction extends Model {
    private ReactionTypeEnum type;

    private String nickname;

    public ReactionTypeEnum getType() {
        return type;
    }

    public void setType(ReactionTypeEnum type) {
        this.type = type;
    }

    public String getNickname() {
        return nickname;
    }

    public void setNickname(String nickname) {
        this.nickname = nickname;
    }

    public Reaction(ReactionTypeEnum type, String nickname) {
        this.type = type;
        this.nickname = nickname;
    }
}
