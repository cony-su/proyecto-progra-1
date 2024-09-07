import java.util.*; 

class Cliente
{
  private DatosPersonales datosPersonales;
  private DatosContacto datosContacto; 
  private PlanesDisponibles plan;
  private List<Factura> facturas; // Colección de facturas, colección anidada
  private List<Tarjeta> tarjetasRegistradas; // Colección de tarjetas, colección anidada
  private Equipo equipo;

  public Cliente(DatosPersonales datosPersonales, DatosContacto datosContacto, PlanesDisponibles plan,Equipo equipo) 
  {
    this.datosPersonales = datosPersonales;
    this.datosContacto = datosContacto;
    this.plan = plan;
    this.equipo = equipo;
    facturas = new ArrayList<Factura>();
    tarjetasRegistradas = new ArrayList<Tarjeta>();
  }

  public DatosPersonales getDatosPersonales() {
    return datosPersonales;
  }

  public void setDatosPersonales(DatosPersonales datosPersonales){
    this.datosPersonales = datosPersonales;
  }

  public DatosContacto getDatosContacto() {
    return datosContacto;
  }

  public void setDatosContacto(DatosContacto datosContacto){
    this.datosContacto = datosContacto;
  }

  public PlanesDisponibles getPlan() {
    return plan;
  }

  public void setPlan(PlanesDisponibles plan){
    this.plan = plan;
  }

  public Equipo getEquipo() {
    return equipo;
  }

  public void setEquipo(Equipo equipo){
    this.equipo = equipo;
  }

  public List<Factura> getFacturas(){
    return facturas;
  }

  public void setFacturas(List<Factura> facturas){
    this.facturas = facturas;
  }

  public List<Tarjeta> getTarjetasRegistradas()
  {
    return tarjetasRegistradas;
  }

  public void setTarjetasRegistradas(List<Tarjeta> tarjetasRegistradas){
    this.tarjetasRegistradas = tarjetasRegistradas;
  }

  public void agregarFactura(Factura factura)
  {
    facturas.add(factura);
  }

  public void agregarTarjeta(Tarjeta tarjeta)
  {
    tarjetasRegistradas.add(tarjeta);
  }

  public void agregarTarjeta(int metodoPago, int tipoTarjeta, String nombreTitular, String numeroTarjeta, String fechaVencimiento, String codigoSeguridad)
  {
    Tarjeta tarjeta = new Tarjeta(metodoPago, tipoTarjeta, nombreTitular, numeroTarjeta, fechaVencimiento, codigoSeguridad);
    tarjetasRegistradas.add(tarjeta);
  }
}