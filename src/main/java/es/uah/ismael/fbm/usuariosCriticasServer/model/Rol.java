package es.uah.ismael.fbm.usuariosCriticasServer.model;

import jakarta.persistence.*;

@Entity
@Table(name = "authorities")
public class Rol {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "idRol", nullable = false)
    private Integer idRol;

    @Column(name = "authority", nullable = false, length = 45)
    private String authority;

    public Integer getIdRol() {
        return idRol;
    }

    public void setIdRol(Integer id) {
        this.idRol = id;
    }

    public String getAuthority() {
        return authority;
    }

    public void setAuthority(String authority) {
        this.authority = authority;
    }

    @Override
    public String toString() {
        return "Rol{" +
                "idRol=" + idRol +
                ", authority='" + authority + '\'' +
                '}';
    }
}