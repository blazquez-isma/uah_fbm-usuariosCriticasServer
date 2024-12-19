package es.uah.ismael.fbm.usuariosCriticasServer.model;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import jakarta.persistence.*;
import org.hibernate.Hibernate;
import org.hibernate.annotations.OnDelete;
import org.hibernate.annotations.OnDeleteAction;

import java.time.LocalDate;
import java.util.Objects;

@Entity
@Table(name = "criticas")
public class Critica {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "idCritica", nullable = false)
    private Integer idCritica;

    @ManyToOne
    @OnDelete(action = OnDeleteAction.CASCADE)
    @JoinColumn(name = "idUsuario", referencedColumnName = "idUsuario", nullable = false)
    @JsonIgnoreProperties("criticas")
    private Usuario usuario;

    @Column(name = "idPelicula", nullable = false)
    private Integer idPelicula;

    @Lob
    @Column(name = "valoracion", nullable = false)
    private String valoracion;

    @Column(name = "nota", nullable = false)
    private Integer nota;

    @Column(name = "fecha", nullable = false)
    private LocalDate fecha;

    public Integer getIdCritica() {
        return idCritica;
    }

    public void setIdCritica(Integer idCritica) {
        this.idCritica = idCritica;
    }

    public Usuario getUsuario() {
        return usuario;
    }

    public void setUsuario(Usuario idUsuario) {
        this.usuario = idUsuario;
    }

    public Integer getIdPelicula() {
        return idPelicula;
    }

    public void setIdPelicula(Integer idPelicula) {
        this.idPelicula = idPelicula;
    }

    public String getValoracion() {
        return valoracion;
    }

    public void setValoracion(String valoracion) {
        this.valoracion = valoracion;
    }

    public Integer getNota() {
        return nota;
    }

    public void setNota(Integer nota) {
        this.nota = nota;
    }

    public LocalDate getFecha() {
        return fecha;
    }

    public void setFecha(LocalDate fecha) {
        this.fecha = fecha;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || Hibernate.getClass(this) != Hibernate.getClass(o)) return false;
        Critica critica = (Critica) o;
        return idCritica != null && Objects.equals(idCritica, critica.idCritica);
    }

    @Override
    public int hashCode() {
        return getClass().hashCode();
    }

    @Override
    public String toString() {
        return "Critica{" +
                "idCritica=" + idCritica +
                ", idUsuario=" + usuario.getIdUsuario() +
                ", idPelicula=" + idPelicula +
                ", valoracion='" + valoracion + '\'' +
                ", nota=" + nota +
                ", fecha=" + fecha +
                '}';
    }
}