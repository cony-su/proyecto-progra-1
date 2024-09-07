class Tarjeta
{
  private String metodoPago;
  private String tipoTarjeta;
  private String nombreTitular;
  private String numeroTarjeta;
  private String fechaVencimiento;
  private String codigoSeguridad;

  public Tarjeta(int metodoPago, int tipoTarjeta, String nombreTitular, String numeroTarjeta, String fechaVencimiento, String codigoSeguridad)
  {
    if(metodoPago == 1) //credito
    {
      this.metodoPago = "Credito";
        switch(tipoTarjeta)
        {
          case 1:
            this.tipoTarjeta = "Visa";
            break;
          case 2:
            this.tipoTarjeta = "Mastercard";
            break;
          case 3:
            this.tipoTarjeta = "American Express";
            break;
          case 4:
            this.tipoTarjeta = "Diners Club";
            break;
          default:
            System.out.println("Opción no válida");
            break;
        }
    }
    else if(metodoPago == 2)
    {
      this.metodoPago = "Debito";
      switch(tipoTarjeta)
        {
          case 1:
            this.tipoTarjeta = "Visa";
            break;
          case 2:
            this.tipoTarjeta = "Mastercard";
            break;
          case 3:
            this.tipoTarjeta = "Redcompra";
            break;
          case 4:
            this.tipoTarjeta = "Bank Red";
            break;
          default:
            System.out.println("Opción no válida");
            break;
        }
    }
    
    this.nombreTitular = nombreTitular;
    this.numeroTarjeta = numeroTarjeta;
    this.fechaVencimiento = fechaVencimiento;
    this.codigoSeguridad = codigoSeguridad;
  }

  public String getMetodoPago() {
    return metodoPago;
  }

  public void setMetodoPago(String metodoPago){
    this.metodoPago = metodoPago;
  }

  public String getTipoTarjeta() {
    return tipoTarjeta;
  }

  public void setTipoTarjeta(String tipoTarjeta){
    this.tipoTarjeta = tipoTarjeta;
  }

  public String getNombreTitular() {
    return nombreTitular;
  }

  public void setNombreTitular(String nombreTitular){
    this.nombreTitular = nombreTitular;
  }

  public String getNumeroTarjeta() {
    return numeroTarjeta;
  }

  public void setNumeroTarjeta(String numeroTarjeta){
    this.numeroTarjeta = numeroTarjeta;
  }

  public String getFechaVencimiento() {
    return fechaVencimiento;
  }

  public void setFechaVencimiento(String fechaVencimiento){
    this.fechaVencimiento = fechaVencimiento;
  }

  public String getCodigoSeguridad() {
    return codigoSeguridad;
  }

  public void setCodigoSeguridad(String codigoSeguridad){
    this.codigoSeguridad = codigoSeguridad;
  }

}