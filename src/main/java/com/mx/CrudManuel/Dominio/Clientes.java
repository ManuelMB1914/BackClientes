package com.mx.CrudManuel.Dominio;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "cliente")
public class Clientes {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int idCliente;

    @Column (name = "clienteactivo")
    private String clienteActivo;
    
    @Column (name = "clientenombre")
    private String clienteNombre;
    
    @Column (name = "clientefechacreacion")
    private String clienteFechaCreacion;
    
    @Column (name = "clientefechamodificacion")
    private String clienteFechaModificacion;

    public Clientes() {
    }

    @Override
    public String toString() {
        return "Clientes [idCliente=" + idCliente + ", clienteActivo=" + clienteActivo + ", clienteNombre="
                + clienteNombre + ", clienteFechaCreacion=" + clienteFechaCreacion + ", clienteFechaModificacion="
                + clienteFechaModificacion + ", getClass()=" + getClass() + ", hashCode()=" + hashCode()
                + ", toString()=" + super.toString() + "]";
    }

    public Clientes(int idCliente, String clienteActivo, String clienteNombre, String clienteFechaCreacion,
            String clienteFechaModificacion) {
        this.idCliente = idCliente;
        this.clienteActivo = clienteActivo;
        this.clienteNombre = clienteNombre;
        this.clienteFechaCreacion = clienteFechaCreacion;
        this.clienteFechaModificacion = clienteFechaModificacion;
    }

    public int getIdCliente() {
        return idCliente;
    }

    public void setIdCliente(int idCliente) {
        this.idCliente = idCliente;
    }

    public String getClienteActivo() {
        return clienteActivo;
    }

    public void setClienteActivo(String clienteActivo) {
        this.clienteActivo = clienteActivo;
    }

    public String getClienteNombre() {
        return clienteNombre;
    }

    public void setClienteNombre(String clienteNombre) {
        this.clienteNombre = clienteNombre;
    }

    public String getClienteFechaCreacion() {
        return clienteFechaCreacion;
    }

    public void setClienteFechaCreacion(String clienteFechaCreacion) {
        this.clienteFechaCreacion = clienteFechaCreacion;
    }

    public String getClienteFechaModificacion() {
        return clienteFechaModificacion;
    }

    public void setClienteFechaModificacion(String clienteFechaModificacion) {
        this.clienteFechaModificacion = clienteFechaModificacion;
    }
}
