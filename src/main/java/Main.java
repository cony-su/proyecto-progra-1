import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.HashMap; 

class DatosPersonales
{
  private String nombreCliente;
  private String fechaNacimiento; //despues cambiar el tipo de variable a una LocalDate+++++++++++++++++++++++++
  private String direccion;
  private int numeroIdentificacion;
  private String rut; 

  public DatosPersonales(String nombreCliente, String FechaNacimiento, String direccion, int numeroIdentificacion, String rut)
  {
    this.nombreCliente = nombreCliente;
    this.fechaNacimiento = FechaNacimiento;
    this.direccion = direccion;
    this.numeroIdentificacion = numeroIdentificacion;
    this.rut = rut;
  }

  public String getNombreCliente(){ 
    return nombreCliente;
  }

  public void setnombreCliente(String nombreCliente){
    this.nombreCliente = nombreCliente;
  }

  public String getFechaNacimiento(){
    return fechaNacimiento;
  }

  public void setFechaNacimiento(String fechaNacimiento){
    this.fechaNacimiento = fechaNacimiento;
  }

  public String getDireccion(){
    return direccion;
  }

  public void setDireccion(String direccion){
    this.direccion = direccion;
  }

  public int getNumeroIdentificacion(){
    return numeroIdentificacion;
  }

  public void setNumeroIdentificacion(int numeroIdentificacion){
    this.numeroIdentificacion = numeroIdentificacion;
  }

  public String getRut(){
    return rut;
  }

  public void setRut(String rut){
    this.rut = rut;
  }
}

class DatosContacto
{
  private String direccionFacturacion;
  private String numeroTelefono;
  private String correoElectronico;

  public DatosContacto(String direccionFacturacion, String numeroTelefono, String correoElectronico)
  {
    this.direccionFacturacion = direccionFacturacion;
    this.numeroTelefono = numeroTelefono;
    this.correoElectronico = correoElectronico;
  }

  public String getDireccionFacturacion(){
    return direccionFacturacion;
  }

  public void setDireccionFacturacion(String direccionFacturacion){
    this.direccionFacturacion = direccionFacturacion;
  }

  public String getNumeroTelefono(){
    return numeroTelefono;
  }

  public void setNumeroTelefono(String numeroTelefono){
    this.numeroTelefono = numeroTelefono;
  }

  public String getCorreoElectronico(){
    return correoElectronico;
  }

  public void setCorreoElectronico(String correoElectronico){
    this.correoElectronico = correoElectronico;
  }
}

class PlanesDisponibles
{
  private String nombrePlan;
  private int precioPlan;
  private Boolean llamadasNacionalesIlimitadas;
  private int limiteLlamadasNacionales; //se refiere al limite de minutos de llamadas nacionales
  private Boolean llamadasInternacionalesIlimitadas;
  private int limiteLlamadasInternacionales;
  private Boolean datosIlimitados;
  private int limiteDatos;
  //faltan las variables de los mensajes *me dio paja ponerlo*

  public PlanesDisponibles(String nombrePlan, int precioPlan, Boolean llamadasNacionalesIlimitadas, int limiteLlamadasNacionales, Boolean llamadasInternacionalesIlimitadas,int limiteLlamadasInternacionales, Boolean datosIlimitados, int limiteDatos)
  {
    this.nombrePlan = nombrePlan;
    this.precioPlan = precioPlan;
    this.llamadasNacionalesIlimitadas = llamadasNacionalesIlimitadas;
    this.limiteLlamadasNacionales = limiteLlamadasNacionales;
    this.llamadasInternacionalesIlimitadas = llamadasInternacionalesIlimitadas;
    this.limiteLlamadasInternacionales = limiteLlamadasInternacionales;
    this.datosIlimitados = datosIlimitados;
    this.limiteDatos = limiteDatos;
  }

  public String getNombrePlan(){
    return nombrePlan;
  }

  public void setNombrePlan(String nombrePlan){
    this.nombrePlan = nombrePlan;
  }

  public int getPrecioPlan(){
    return precioPlan;
  }

  public void setPrecioPlan(int precioPlan){
    this.precioPlan = precioPlan;
  }

  public Boolean getLlamadasNacionalesIlimitadas(){
    return llamadasNacionalesIlimitadas;
  }

  public void setLlamadasNacionalesIlimitadas(Boolean llamadasNacionalesIlimitadas){
    this.llamadasNacionalesIlimitadas = llamadasNacionalesIlimitadas;
  }

  public int getLimiteLlamadasNacionales(){
    return limiteLlamadasNacionales;
  }

  public void setLimiteLlamadasNacionales(int limiteLlamadasNacionales){
    this.limiteLlamadasNacionales = limiteLlamadasNacionales;
  }

  public Boolean getLlamadasInternacionalesIlimitadas(){
    return llamadasInternacionalesIlimitadas;
  }

  public void setLlamadasInternacionalesIlimitadas(Boolean llamadasInternacionalesIlimitadas){
    this.llamadasInternacionalesIlimitadas = llamadasInternacionalesIlimitadas;
  }

  public int getLimiteLlamadasInternacionales(){
    return limiteLlamadasInternacionales;
  }

  public void setLimiteLlamadasInternacionales(int limiteLlamadasInternacionales){
    this.limiteLlamadasInternacionales = limiteLlamadasInternacionales;
  }

  public Boolean getDatosIlimitados(){
    return datosIlimitados;
  }

  public void setDatosIlimitados(Boolean datosIlimitados){
    this.datosIlimitados = datosIlimitados;
  }

  public int getLimiteDatos(){
    return limiteDatos;
  }
}

class Factura //ESTA CLASE REPRESENTA UNA FACTURA INDIVIDUAL
{
  private int idFactura;
  private double monto;
  private String fechaEmision; //pasar el tipo de variable a LocalDate luego+++++++++++++++++++++++++++++++++++++++
  private boolean pagado;

    // Constructor
  public Factura(int idFactura, double monto, String fechaEmision, boolean pagado) {
    this.idFactura = idFactura;
    this.monto = monto;
    this.fechaEmision = fechaEmision;
    this.pagado = pagado;
  }

  public int getIdFactura() {
    return idFactura;
  }

  public void setIdFactura(int idFactura) {
    this.idFactura = idFactura;
  }

  public double getMonto() {
    return monto;
  }

  public void setMonto(double monto) {
    this.monto = monto;
  }

  public String getFechaEmision() {
    return fechaEmision;
  }

  public void setFechaEmision(String fechaEmision) {
    this.fechaEmision = fechaEmision;
  }

  public boolean isPagado() {
    return pagado;
  }

  public void setPagado(boolean pagado) {
    this.pagado = pagado;
  }
}

class Equipo
{
  private String marca;
  private String modelo;
  private int numeroSerie;

  public Equipo(String marca, String modelo, int numeroSerie)
  {
    this.marca = marca;
    this.modelo = modelo;
    this.numeroSerie = numeroSerie;
  }

  public String getMarca() {
    return marca;
  }

  public void setMarca(String marca){
    this.marca = marca;
  }

  public String getModelo() {
    return modelo;
  }
  
  public void serMoselo(String modelo){
    this.modelo = modelo;
  }

  public int getNumeroSerie() {
    return numeroSerie;
  }

  public void serNumeroSerie(int numeroSerie){
    this.numeroSerie = numeroSerie;
  }

  //TERMINAR EL GETTER Y SETTER DE LOS ATRIBUTOS
}

// class MetodoPago 

class Cliente
{
  private DatosPersonales datosPersonales;
  private DatosContacto datosContacto;
  private PlanesDisponibles plan;
  private List<Factura> facturas; // Colección de facturas, colección anidada
  private Equipo equipo;

  public Cliente(DatosPersonales datosPersonales, DatosContacto datosContacto, PlanesDisponibles plan,Equipo equipo) 
  {
    this.datosPersonales = datosPersonales;
    this.datosContacto = datosContacto;
    this.plan = plan;
    this.equipo = equipo;
    this.facturas = new ArrayList<Factura>();
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

  public void agregarFactura(Factura factura)
  {
    facturas.add(factura);
  }

  public List<Factura> getFacturas(){
    return facturas;
  }

  public void setFacturas(List<Factura> facturas){
    this.facturas = facturas;
  }
  
}

class Menus
{
  public void MenuPrincipal()
  {
    System.out.println("Bienvenido al sistema de telefonía celular");
    System.out.println("------------------------------------------");
    System.out.println("1. Mostrar clientes");
    System.out.println("2. Mostrar planes");
    System.out.println("3. Registrar cliente");
    System.out.println("4. Buscar cliente");
    System.out.println("5. Salir \n");
  }

  public void limpiarPantalla() 
  {
    String sistemaOperativo = System.getProperty("os.name").toLowerCase();
    try {
        if (sistemaOperativo.contains("win")) {
            new ProcessBuilder("cmd", "/c", "cls").inheritIO().start().waitFor();
        } else {
            new ProcessBuilder("clear").inheritIO().start().waitFor();
        }
    } catch (Exception e) {
        e.printStackTrace();
    }
  }

  public void MenuPlanes()
    {
      System.out.println("\n¿Que plan desea registrar?");
      System.out.println("-------------------------");
      System.out.println("1. Plan Económico");
      System.out.println("2. Plan Básico");
      System.out.println("3. Plan Normal");
      System.out.println("4. Plan Premium \n");
    }
  
  public void PlanEconomico()
  {
    System.out.println("Plan Económico");
    System.out.println("--------------");
    System.out.println("- Llamadas nacionales: 60 minutos");
    System.out.println("- Llamadas internaciones: 0 minutos");
    System.out.println("- Datos móviles: 1 GB");
   // System.out.println("- Mensajes: 10 SMS");
    System.out.println("Precio: $8000\n");   
  }

  public void PlanBasico()
    {
      System.out.println("Plan Básico");
      System.out.println("-----------");
      System.out.println("- Llamadas nacionales: 120 minutos");
      System.out.println("- Llamadas internaciones: 30 minutos");
      System.out.println("- Datos móviles: 5 GB");
     // System.out.println("- Mensajes: 10 SMS");
      System.out.println("Precio: $12000\n"); 
    }

  public void PlanNormal()
  {
    System.out.println("Plan Normal");
    System.out.println("--------------");
    System.out.println("- Llamadas nacionales: 200 minutos");
    System.out.println("- Llamadas internaciones: 100 minutos");
    System.out.println("- Datos móviles: 10 GB");
   // System.out.println("- Mensajes: 10 SMS");
    System.out.println("Precio: $15000\n");
  }

  public void PlanPremium()
  {
    System.out.println("Plan Premium");
    System.out.println("------------");
    System.out.println("- Llamadas nacionales: minutos ilimitados");
    System.out.println("- Llamadas internaciones: minutos ilimitados");
    System.out.println("- Datos móviles: GB ilimitados");
   // System.out.println("- Mensajes: 10 SMS");
    System.out.println("Precio: $20000\n"); 
  }

  public void MenuBuscarCliente()
    {
      System.out.println("Deseas buscar un cliente por:");
      System.out.println("-----------------------------");
      System.out.println("1. Nombre");
      System.out.println("2. Rut");
      System.out.println("3. ID de factura");
      System.out.println("4. Regresar \n");
    }
}

class GestorClientes
{
  private List<Cliente> listaClientes;
  BufferedReader lector = new BufferedReader(new InputStreamReader(System.in));

  public GestorClientes(List<Cliente> listaClientes)
  {
    this.listaClientes = listaClientes;
  }

  public void registarCliente(List <Cliente> listaClientes)
    {
      try 
      {
        System.out.println("Ingrese el nombre del cliente:");
        String nombreCliente = lector.readLine();
        System.out.println("Ingrese la fecha de nacimiento del cliente (dd/mm/aaaa):");
        String fechaNacimiento = lector.readLine();
        System.out.println("Ingrese la dirección del cliente:");
        String direccion = lector.readLine();
        System.out.println("Ingrese el número de identificación del cliente:");
        String nIdentificacion = lector.readLine();
        int numeroIdentificacion = Integer.parseInt(nIdentificacion);
        System.out.println("Ingrese el rut del cliente:");
        String rut = lector.readLine();

        DatosPersonales datosPersonales = new DatosPersonales(nombreCliente, fechaNacimiento, direccion, numeroIdentificacion, rut);

        System.out.println("Ingrese la dirección de facturación del cliente:");
        String direccionFacturacion = lector.readLine();
        System.out.println("Ingrese el número de teléfono del cliente:");
        String numeroTelefono = lector.readLine();
        System.out.println("Ingrese el correo electrónico del cliente:");
        String correoElectronico = lector.readLine();

        DatosContacto datosContacto = new DatosContacto(direccionFacturacion, numeroTelefono, correoElectronico);

        System.out.println("Ingrese la marca del teléfono del cliente:");
        String marca = lector.readLine();
        System.out.println("Ingrese el modelo de teléfono del cliente:");
        String modelo = lector.readLine();
        System.out.println("Ingrese el número de serie del teléfono del cliente:");
        String numSerie = lector.readLine();
        int numeroSerie = Integer.parseInt(numSerie); // Assign value to numeroSerie
        Equipo equipo = new Equipo(marca, modelo, numeroSerie); 
        Menus menu = new Menus();
        menu.MenuPlanes();
        System.out.println("Seleccione un plan disponible:");
        int opcionPlan = Integer.parseInt(lector.readLine());
        PlanesDisponibles plan = null;
        Factura factura1 = null;
        Factura factura2 = null;
        switch(opcionPlan)
        {
          case 1:
            plan = new PlanesDisponibles("Plan Económico", 8000, false, 60, false, 0, false, 1);
            factura1 = new Factura(253, 8000, "2023-06-01", true);
            factura2 = new Factura(253, 8000, "2023-07-01", false);
            break;
            
          case 2:
            plan = new PlanesDisponibles("Plan Básico", 12000, false, 120, false, 30, false, 5);
            factura1 = new Factura(117, 12000, "2023-06-01", true);
            factura2 = new Factura(117, 12000, "2023-07-01", false);
            break;

          case 3:
            plan = new PlanesDisponibles("Plan Normal", 15000, false, 200, false, 100, false, 10);
            factura1 = new Factura(905, 15000, "2023-06-01", true);
            factura2 = new Factura(905, 15000, "2023-07-01", false);
            break;
            
          case 4:
            plan = new PlanesDisponibles("Plan Premium", 20000, true, 0, true, 0, true, 0);
            factura1 = new Factura(612, 20000, "2023-06-01", true);
            factura2 = new Factura(612, 20000, "2023-07-01", false);
            break;
            
          default:
            System.out.println("Opción no válida");
            break;
        }
        Cliente cliente = new Cliente(datosPersonales, datosContacto, plan, equipo);
        cliente.agregarFactura(factura1);
        cliente.agregarFactura(factura2);
        listaClientes.add(cliente);

        System.out.println("el cliente se ha registrado correctamente.");
      }

      catch (IOException e) {
          System.out.println("Ocurrió un error al leer la entrada del usuario. Por favor, intente nuevamente.");
          e.printStackTrace();
      }   
    }

  public void MostrarCliente(Cliente cliente) 
  {
    if (cliente == null) 
    {
      System.out.println("Cliente no encontrado.");
      return;
    }

    System.out.println("Nombre: " + cliente.getDatosPersonales().getNombreCliente());
    System.out.println("Dirección: " + cliente.getDatosContacto().getDireccionFacturacion());
    System.out.println("Plan: " + cliente.getPlan().getNombrePlan());
    System.out.println("Equipo: " + cliente.getEquipo().getMarca() + " " + cliente.getEquipo().getModelo());
    System.out.println("Facturas:");

      if (cliente.getFacturas() == null || cliente.getFacturas().isEmpty()) 
      {
          System.out.println("  No hay facturas para mostrar.");
      } 
      else 
      {
          for (Factura factura : cliente.getFacturas()) 
          {
              System.out.println("  - Factura ID: " + factura.getIdFactura() + ", Monto: $" + factura.getMonto() + ", Fecha: " + factura.getFechaEmision());
          }
      }

      System.out.println("------------------------------------------");
  }
  
  
  public void MostrarClientes(List<Cliente> listaClientes) 
  {
        if (listaClientes == null || listaClientes.isEmpty()) 
        {
            System.out.println("No hay clientes para mostrar.");
            return;
        }

        System.out.println("Lista de Clientes:");
        System.out.println("------------------------------------------");

        for (Cliente cliente : listaClientes) 
        {
          MostrarCliente(cliente); // Llama al método mostrarCliente para cada cliente
        }
    
    
  }

  public void buscarCliente(HashMap <String, Cliente> mapaNombre, HashMap <String, Cliente> mapaRut, HashMap <String, Cliente> mapaID ) throws IOException
  {
    System.out.println("Ingrese la opción ");
    int opcionbusqueda = Integer.parseInt(lector.readLine());
    Cliente clienteEncontrado = null;
    switch(opcionbusqueda)
    {
      case 1:
        System.out.println("Ingrese el nombre del cliente a buscar:");
        String nombreCliente = lector.readLine();
        clienteEncontrado = BuscarMapa(mapaNombre, nombreCliente);
        if (clienteEncontrado != null)
          MostrarCliente(clienteEncontrado);
        else
          System.out.println("No se encontró ningún cliente con ese nombre.");
        break;
        
      case 2:
        System.out.println("Ingrese el rut del cliente a buscar:");
        String rutCliente = lector.readLine();
        clienteEncontrado = BuscarMapa(mapaRut, rutCliente);
        if (clienteEncontrado != null)
          MostrarCliente(clienteEncontrado);
        else
          System.out.println("No se encontró ningún cliente con ese rut.");
        break;
        
      case 3:
        System.out.println("Ingrese el ID de factura del cliente a buscar:");
        String idFactura = lector.readLine();
        clienteEncontrado = BuscarMapa(mapaID, idFactura);
        if (clienteEncontrado != null)
          MostrarCliente(clienteEncontrado);
        else
          System.out.println("No se encontró ningún cliente con ese ID de factura.");
        break;
        
      default:
        break;
    }
  }

  public void AgregarMapa(HashMap<String, Cliente> mapa, Cliente cliente, int opcion)
  {
    switch(opcion)
    {
      case 1: //nombre
        mapa.put(cliente.getDatosPersonales().getNombreCliente(), cliente);
        break;

      case 2: //rut
        mapa.put(cliente.getDatosPersonales().getRut(), cliente);
        break;

      case 3: //id factura 
        for(Factura factura : cliente.getFacturas())
        {
          mapa.put(String.valueOf(factura.getIdFactura()), cliente);
        }
        break;
        
      default:
        return;
    }
  }

  public Cliente BuscarMapa(HashMap<String, Cliente> mapa, String buscado)
  {
    return mapa.get(buscado);
  }
  
}

class ClientesRegistrados
{
  private DatosPersonales datosPersonales;
  private DatosContacto datosContacto;
  private PlanesDisponibles plan;
  private List<Factura> facturas;
  private Equipo equipo;
  
  public Cliente ClienteRegistrado1()
  {
    datosPersonales = new DatosPersonales("Juan Pérez", "01/01/1990", "Calle 123, Ciudad", 12345678, "12345678-9");
    datosContacto = new DatosContacto("Calle 456, Ciudad", "555-1234", "oqibz@example.com");
    plan = new PlanesDisponibles("Plan Económico", 8000, false, 60, false, 0, false, 1);
    equipo = new Equipo("Samsung", "Galaxy S21", 12345);
    Factura factura1 = new Factura(101, 8000, "2023-05-05", true);
    Factura factura2 = new Factura(102, 8000, "2023-06-05", true);
    Factura factura3 = new Factura(103, 8000, "2023-07-05", false);
    Cliente cliente = new Cliente(datosPersonales, datosContacto, plan, equipo);
    cliente.agregarFactura(factura1);
    cliente.agregarFactura(factura2);
    cliente.agregarFactura(factura3);
    return cliente;
  }

  public Cliente ClienteRegistrado2()
  {
    datosPersonales = new DatosPersonales("María García", "15/05/1985", "Avenida Principal, Ciudad", 23456789, "23456789-0");
    datosContacto = new DatosContacto("Avenida Secundaria, Ciudad", "555-5678", "tugrp@example.com");
    plan = new PlanesDisponibles("Plan Básico", 12000, false, 120, false, 30, false, 5);
    equipo = new Equipo("Apple", "iPhone 13", 67890);
    Factura factura1 = new Factura(1, 1500.0, "2023-06-01", false);
    Factura factura2 = new Factura(2, 2500.0, "2023-07-02", true);
    Cliente cliente = new Cliente(datosPersonales, datosContacto, plan, equipo);
    cliente.agregarFactura(factura1);
    cliente.agregarFactura(factura2);
    return cliente;
  }

  public Cliente ClienteRegistrado3()
  {
    datosPersonales = new DatosPersonales("Carlitos Paredes", "27/04/2011", "Calle Falsa 123", 2715123, "20.382.115-k");
    datosContacto = new DatosContacto("Calle Falsa 123", "973812212", "carlitos2781@gmail.com");
    plan = new PlanesDisponibles("Plan Básico", 12000, false, 120, false, 30, false, 5);
    equipo = new Equipo("Samsung", "Galaxy S20", 123456);
    Factura factura1 = new Factura(1, 1500.0, "2023-06-01", false);
    Factura factura2 = new Factura(2, 2500.0, "2023-07-02", true);
    Cliente cliente = new Cliente(datosPersonales, datosContacto, plan, equipo);
    cliente.agregarFactura(factura1);
    cliente.agregarFactura(factura2);
    return cliente;
  }

  public Cliente ClienteRegistrado4()
  {
      datosPersonales = new DatosPersonales("Mauris Romagnoli", "15/09/1087", "Calle Falsa 321", 2715123, "18.556.139-6");
      datosContacto = new DatosContacto("Calle Falsa 321", "981342172", "Maurisroma87@gmail.com");
      plan = new PlanesDisponibles("Plan Premium", 20000, true, 0, true, 0, true, 0);
      equipo = new Equipo("Xiaomi", "Mi 13", 45687);
      Factura factura1 = new Factura(1, 1500.0, "2023-06-01", false);
      Factura factura2 = new Factura(2, 2500.0, "2023-07-02", true);
      Cliente cliente = new Cliente(datosPersonales, datosContacto, plan, equipo);
      cliente.agregarFactura(factura1);
      cliente.agregarFactura(factura2);
      return cliente;
  }
}

public class Main 
{
  public static void main(String[] args) throws IOException 
  {
    BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
    List<Cliente> listaClientes = new ArrayList<Cliente>();
    HashMap<String, Cliente> mapaNombre = new HashMap<String, Cliente>();
    HashMap<String, Cliente> mapaRut = new HashMap<String, Cliente>();
    HashMap<String, Cliente> mapaID = new HashMap<String, Cliente>();
    ClientesRegistrados clientesRegistrados = new ClientesRegistrados();
    Cliente cliente1 = clientesRegistrados.ClienteRegistrado1();
    Cliente cliente2 = clientesRegistrados.ClienteRegistrado2();
    Cliente cliente3 = clientesRegistrados.ClienteRegistrado3();
    Cliente cliente4 = clientesRegistrados.ClienteRegistrado4();
    listaClientes.add(cliente1);
    listaClientes.add(cliente2);
    listaClientes.add(cliente3);
    listaClientes.add(cliente4);
    
    GestorClientes gestorClientes = new GestorClientes(listaClientes);
    gestorClientes.AgregarMapa(mapaNombre, cliente1, 1);
    gestorClientes.AgregarMapa(mapaNombre, cliente2, 1);
    gestorClientes.AgregarMapa(mapaNombre, cliente3, 1);
    gestorClientes.AgregarMapa(mapaNombre, cliente4, 1); 
    gestorClientes.AgregarMapa(mapaRut, cliente1, 2); 
    gestorClientes.AgregarMapa(mapaRut, cliente2, 2);
    gestorClientes.AgregarMapa(mapaRut, cliente3, 2);
    gestorClientes.AgregarMapa(mapaRut, cliente4, 2);
    gestorClientes.AgregarMapa(mapaID, cliente1, 3);
    gestorClientes.AgregarMapa(mapaID, cliente2, 3);
    gestorClientes.AgregarMapa(mapaID, cliente3, 3);
    gestorClientes.AgregarMapa(mapaID, cliente4, 3);
    
    Menus menu = new Menus();
    while(true)
    {
      menu.MenuPrincipal();
      System.out.println("Ingrese una opción: ");
      String opcionStr = reader.readLine(); // Captura la entrada del usuario como un string
      int opcion = Integer.parseInt(opcionStr);
      
      switch(opcion) 
      {
        case 1:
          menu.limpiarPantalla();
          gestorClientes.MostrarClientes(listaClientes);
          System.out.println("Digite una letra para salir ");
          String op = reader.readLine();
          break;
        case 2:
          menu.limpiarPantalla();
          menu.PlanEconomico();
          menu.PlanBasico();
          menu.PlanNormal();
          menu.PlanPremium();
          System.out.println("Digite una letra para salir ");
          String op2 = reader.readLine();
          break;
        case 3:
          menu.limpiarPantalla();
          gestorClientes.registarCliente(listaClientes);
          System.out.println("Digite una letra para salir ");
          String op3 = reader.readLine();
          break;
        case 4:
          menu.limpiarPantalla();
          menu.MenuBuscarCliente();
          gestorClientes.buscarCliente(mapaNombre, mapaRut, mapaID);
          System.out.println("Digite una letra para salir ");
          String op4 = reader.readLine();
          break;
        default:
          System.out.println("Opción no válida");
          return;
      }   
      menu.limpiarPantalla();
    }   
  }
}