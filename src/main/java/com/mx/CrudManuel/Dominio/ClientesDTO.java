package com.mx.CrudManuel.Dominio;

public class ClientesDTO {

    private int idCliente;
    private String clienteActivo;
    private String clienteNombre;
    private String clienteFechaCreacion;
    private String clienteFechaModificacion;

    public ClientesDTO() {
    }

    public ClientesDTO(int idCliente, String clienteActivo, String clienteNombre, String clienteFechaCreacion,
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
