import java.util.*; 
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

class GestorClientes
{
  private List<Cliente> listaClientes;
  BufferedReader lector = new BufferedReader(new InputStreamReader(System.in));

  public GestorClientes(List<Cliente> listaClientes)
  {
    this.listaClientes = listaClientes;
  }

  public void registarCliente(List <Cliente> listaClientes, HashMap<String, Cliente> mapaNombre, HashMap<String, Cliente> mapaRut, HashMap<String, Cliente> mapaIDFactura)
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
            plan = new PlanesDisponibles("Plan Económico", 8000, false, 60, false, 0, false, 10);
            factura1 = new Factura("253", 8000, "2023-06-01", true);
            factura2 = new Factura("257", 8000, "2023-07-01", false);
            break;

          case 2:
            plan = new PlanesDisponibles("Plan Básico", 12000, false, 120, false, 30, false, 50);
            factura1 = new Factura("117", 12000, "2023-06-01", true);
            factura2 = new Factura("115", 12000, "2023-07-01", false);
            break;

          case 3:
            plan = new PlanesDisponibles("Plan Normal", 15000, false, 200, false, 100, false, 100);
            factura1 = new Factura("905", 15000, "2023-06-01", true);
            factura2 = new Factura("902", 15000, "2023-07-01", false);
            break;

          case 4:
            plan = new PlanesDisponibles("Plan Premium", 20000, true, 0, true, 0, true, 0);
            factura1 = new Factura("612", 20000, "2023-06-01", true);
            factura2 = new Factura("614", 20000, "2023-07-01", false);
            break;

          default:
            System.out.println("Opción no válida");
            break;
        }
        Cliente cliente = new Cliente(datosPersonales, datosContacto, plan, equipo);
        cliente.agregarFactura(factura1);
        cliente.agregarFactura(factura2);
        listaClientes.add(cliente);
        mapaNombre.put(nombreCliente, cliente);
        mapaRut.put(rut, cliente);
        mapaIDFactura.put(factura1.getIdFactura(), cliente);
        mapaIDFactura.put(factura2.getIdFactura(), cliente);

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
    System.out.println("Rut: " + cliente.getDatosPersonales().getRut());
    System.out.println("Numero de Identificación: " + cliente.getDatosPersonales().getNumeroIdentificacion());
    System.out.println("Dirección: " + cliente.getDatosContacto().getDireccionFacturacion());
    System.out.println("Tipo de Plan: " + cliente.getPlan().getNombrePlan());
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
            System.out.print("  - Factura ID: " + factura.getIdFactura() + ", Monto: $" + factura.getMonto() + ", Fecha: " + factura.getFechaEmision() + ", Estado de Factura: ");
            if(factura.getPagado() == true) System.out.println("PAGADO");
            else System.out.println("NO PAGADO");
          }
      }

      System.out.println("--------------------------------------------------------------------------------------");
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

  public void buscarCliente(HashMap <String, Cliente> mapaNombre, HashMap <String, Cliente> mapaRut, HashMap <String, Cliente> mapaIDFactura) throws IOException
  {
    System.out.println("Ingrese la opción ");
    int opcionbusqueda = Integer.parseInt(lector.readLine());
    Cliente clienteEncontrado = null;
    switch(opcionbusqueda)
    {
      case 1:
        System.out.println("Ingrese el nombre del cliente a buscar:");
        String nombreCliente = lector.readLine();
        clienteEncontrado = mapaNombre.get(nombreCliente);
        if (clienteEncontrado != null)
        {
          System.out.println("\nCliente encontrado:");
          System.out.println("-------------------:");
          MostrarCliente(clienteEncontrado);
        }
        else
          System.out.println("No se encontró ningún cliente con ese nombre.");
        break;

      case 2:
        System.out.println("Ingrese el rut del cliente a buscar:");
        String rutCliente = lector.readLine();
        clienteEncontrado = mapaRut.get(rutCliente);
        if (clienteEncontrado != null){
          System.out.println("\nCliente encontrado:");
          System.out.println("-------------------:");
          MostrarCliente(clienteEncontrado);
        }
        else
          System.out.println("No se encontró ningún cliente con ese rut.");
        break;

      case 3:
        System.out.println("Ingrese el ID de factura del cliente a buscar:");
        String idFactura = lector.readLine();
        clienteEncontrado = mapaIDFactura.get(idFactura);
        if (clienteEncontrado != null){
          System.out.println("\nCliente encontrado:");
          System.out.println("--------------------");
          MostrarCliente(clienteEncontrado);
        }
        else
          System.out.println("No se encontró ningún cliente con ese ID de factura.");
        break;

      default:
        break;
    }
  }

  public void AgregarMapa(HashMap<String, Cliente> mapaNombre,HashMap<String, Cliente> mapaRut, HashMap<String, Cliente> mapaIDFactura, Cliente cliente)
  {
    mapaNombre.put(cliente.getDatosPersonales().getNombreCliente(), cliente);
    mapaRut.put(cliente.getDatosPersonales().getRut(), cliente);
    for(Factura factura : cliente.getFacturas())
    {
        mapaIDFactura.put(String.valueOf(factura.getIdFactura()), cliente);
    }
  }

  public void MostrarTarjeta(Tarjeta tarjeta)
  {
    System.out.println("Medio de Pago: " + tarjeta.getMetodoPago());  
    System.out.println("Tipo de Tarjeta: " + tarjeta.getTipoTarjeta());
    System.out.println("Nombre del Titular: " + tarjeta.getNombreTitular());
    System.out.println("Número de Tarjeta: " + tarjeta.getNumeroTarjeta());
    System.out.println("------------------------------------------");
  }
  
  public Tarjeta MedioDePago(Cliente cliente) throws IOException
  { 
    Menus menu = new Menus();
    menu.limpiarPantalla();
    menu.MenuMedioDePago();
    System.out.println("Ingrese la opción: ");
    int metodoPago = Integer.parseInt(lector.readLine());
    
    switch(metodoPago)
    {
      case 1:
        menu.limpiarPantalla();
        menu.MenuCredito();
        break;
      case 2:
        menu.limpiarPantalla();
        menu.MenuDebito();
        break;
      case 3:
        System.out.println("Tarjetas Registradas");
        System.out.println("--------------------");
        if(cliente.getTarjetasRegistradas() == null)
        {
          System.out.println("No hay tarjetas registradas.");
        }
        else
        {
          int contadorT = 1;
          for(Tarjeta tarjeta : cliente.getTarjetasRegistradas())
          {
            System.out.println(contadorT + ". ");
            MostrarTarjeta(tarjeta);
            contadorT++;
          }
          System.out.println("\nIngrese el número de la tarjeta que desea utilizar:");
          int numeroTarjeta = Integer.parseInt(lector.readLine());
        }
        break;
        
      default:
        break;
    }
    if(metodoPago == 3) return null;
    System.out.println("Ingrese la opción: ");
    int tipoTarjeta = Integer.parseInt(lector.readLine());
    menu.limpiarPantalla();
    System.out.println("Nombre del Titular: ");
    String nombreTitular = lector.readLine();
    System.out.println("Número de tarjeta: ");
    String numeroTarjeta = lector.readLine();
    System.out.println("Fecha de Vencimiento: ");
    String fechaVencimiento = lector.readLine();
    System.out.println("Código de Seguridad: ");
    String codigoSeguridad = lector.readLine();
    Tarjeta tarjeta = new Tarjeta(metodoPago, tipoTarjeta, nombreTitular, numeroTarjeta, fechaVencimiento, codigoSeguridad);
    return tarjeta;
  }
  
  public boolean ActualizarFactura(List<Factura> facturas, String id)
  {
    for (Factura factura : facturas) 
    {
      if (factura.getIdFactura().equals(id)) 
      {
        if(factura.getPagado() == false) 
        {
          factura.setPagado(true);
          return true;
        }
        else return false;
      }
    }
    return false;
  }
  
  public void PagarFactura(HashMap<String, Cliente> mapaNombre, HashMap<String, Cliente> mapaRut, HashMap<String, Cliente> mapaIDFactura, List<Cliente> listaClientes) throws IOException {
      System.out.println("Pago de Factura");
      System.out.println("---------------");
      System.out.println("Ingrese el ID de la factura a pagar: ");
      String id = lector.readLine();

      Cliente clienteLista = null;
      Cliente cliente = mapaIDFactura.get(id);

      if (cliente != null) 
      {
        MostrarCliente(cliente);
        System.out.println("¿Deseas pagar la factura? (SI/NO): ");
        String respuesta = lector.readLine();

        if (respuesta.equalsIgnoreCase("SI")) 
        {
          boolean facturaPagada = false;
          for (Cliente cliente1 : listaClientes) 
          {
            if (ActualizarFactura(cliente1.getFacturas(), id)) 
            {
              facturaPagada = true;
              clienteLista = cliente1;
              break;
            }
          }

          if (!facturaPagada) 
          {
            System.out.println("La factura ya estaba pagada o no se encontró la factura con el ID proporcionado.");
            return;
          }

          Tarjeta tarjeta = MedioDePago(clienteLista);
          if (tarjeta == null) return;
          if (!clienteLista.getTarjetasRegistradas().contains(tarjeta)) 
          {
            clienteLista.agregarTarjeta(tarjeta);
          }

          Cliente clienteNombre = mapaNombre.get(cliente.getDatosPersonales().getNombreCliente());
          if (clienteNombre != null && ActualizarFactura(clienteNombre.getFacturas(), id) && !clienteNombre.getTarjetasRegistradas().contains(tarjeta)) {
            clienteNombre.agregarTarjeta(tarjeta);
          }

          Cliente clienteRut = mapaRut.get(cliente.getDatosPersonales().getRut());
          if (clienteRut != null && ActualizarFactura(clienteRut.getFacturas(), id) && !clienteRut.getTarjetasRegistradas().contains(tarjeta)) {
            clienteRut.agregarTarjeta(tarjeta);
          }

          if (!cliente.getTarjetasRegistradas().contains(tarjeta)) {
            cliente.agregarTarjeta(tarjeta);
          }

          System.out.println("Factura pagada con éxito.");
          }
      } else System.out.println("Factura no encontrada.");
  }
}
