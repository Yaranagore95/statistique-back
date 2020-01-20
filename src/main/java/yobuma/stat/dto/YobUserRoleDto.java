package yobuma.stat.dto;

import java.util.List;

public class YobUserRoleDto {
    private int id;

    private String libelle;

    private List<YobUsersDto> utilisateurs;

    public YobUserRoleDto() {
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getLibelle() {
        return libelle;
    }

    public void setLibelle(String libelle) {
        this.libelle = libelle;
    }

    public List<YobUsersDto> getUtilisateurs() {
        return utilisateurs;
    }

    public void setUtilisateurs(List<YobUsersDto> utilisateurs) {
        this.utilisateurs = utilisateurs;
    }
}
