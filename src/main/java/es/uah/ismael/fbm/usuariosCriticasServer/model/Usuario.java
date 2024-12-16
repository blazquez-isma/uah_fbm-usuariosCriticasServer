package es.uah.ismael.fbm.usuariosCriticasServer.model;

import jakarta.persistence.*;
import org.hibernate.Hibernate;
import org.hibernate.annotations.ColumnDefault;

import java.util.List;
import java.util.Objects;

@Entity
@Table(name = "users")
public class Usuario {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "idUsuario", nullable = false)
    private Integer idUsuario;

    @Column(name = "username", nullable = false, length = 45)
    private String nombre;

    @Column(name = "password", nullable = false, length = 60)
    private String clave;

    @Column(name = "correo", nullable = false, length = 45)
    private String correo;

    @ColumnDefault("1")
    @Column(name = "enable", nullable = false)
    private Boolean enable = false;

    @OneToMany(mappedBy = "usuario", cascade = {CascadeType.ALL})
    private List<Critica> criticas;

    @ManyToMany(fetch = FetchType.EAGER)
    @JoinTable(name = "Users_has_Authorities",
            joinColumns = {
                @JoinColumn(name = "idUsuario", referencedColumnName = "idUsuario")
            },
            inverseJoinColumns = {
                @JoinColumn(name = "idRol", referencedColumnName = "idRol")
    })
    private List<Rol> roles;

    public Integer getIdUsuario() {
        return idUsuario;
    }

    public void setIdUsuario(Integer id) {
        this.idUsuario = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getClave() {
        return clave;
    }

    public void setClave(String clave) {
        this.clave = clave;
    }

    public String getCorreo() {
        return correo;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }

    public Boolean getEnable() {
        return enable;
    }

    public void setEnable(Boolean enable) {
        this.enable = enable;
    }

    public List<Critica> getCriticas() {
        return criticas;
    }

    public void setCriticas(List<Critica> criticas) {
        this.criticas = criticas;
    }

    public List<Rol> getRoles() {
        return roles;
    }

    public void setRoles(List<Rol> authorities) {
        this.roles = authorities;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || Hibernate.getClass(this) != Hibernate.getClass(o)) return false;
        Usuario usuario = (Usuario) o;
        return idUsuario != null && Objects.equals(idUsuario, usuario.idUsuario);
    }

    @Override
    public int hashCode() {
        return getClass().hashCode();
    }

    @Override
    public String toString() {
        return "Usuario{" +
                "idUsuario=" + idUsuario +
                ", nombre='" + nombre + '\'' +
                ", correo='" + correo + '\'' +
                ", enable=" + enable +
                ", roles=" + roles +
                ", criticas=" + criticas +
                '}';
    }
}