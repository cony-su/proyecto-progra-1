class DatosContacto
{
  private String direccionFacturacion;
  private String telefono;
  private String correo;

  public DatosContacto(String direccionFacturacion, String telefono, String correo)
  {
    this.direccionFacturacion = direccionFacturacion;
    this.telefono = telefono;
    this.correo = correo;
  }

  public String getDireccionFacturacion(){
    return direccionFacturacion;
  }

  public void setDireccionFacturacion(String nombreContacto){
    this.direccionFacturacion = direccionFacturacion;
  }

  public String getTelefono(){
    return telefono;
  }

  public void setTelefono(String telefono){
    this.telefono = telefono;
  }

  public String getCorreo(){
    return correo;
  }

  public void setCorreo(String correo){
    this.correo = correo;
  }
}