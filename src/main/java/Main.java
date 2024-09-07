import java.util.*;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class Main 
{
  public static void main(String[] args) throws IOException 
  {
    BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
    ArrayList<Cliente> listaClientes = new ArrayList<Cliente>(); 
    HashMap<String, Cliente> mapaNombre = new HashMap<String, Cliente>();
    HashMap<String, Cliente> mapaRut = new HashMap<String, Cliente>();
    HashMap<String, Cliente> mapaIDFactura = new HashMap<String, Cliente>();
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
    gestorClientes.AgregarMapa(mapaNombre, mapaRut, mapaIDFactura, cliente1);
    gestorClientes.AgregarMapa(mapaNombre, mapaRut, mapaIDFactura, cliente2);
    gestorClientes.AgregarMapa(mapaNombre, mapaRut, mapaIDFactura, cliente3);
    gestorClientes.AgregarMapa(mapaNombre, mapaRut, mapaIDFactura, cliente3);
    
    ClientesCSV cargador = new ClientesCSV();
    cargador.cargarClientesDesdeCSV("clientes.csv", mapaNombre, mapaRut, listaClientes);
    cargador.FacturasClientesCSV("facturas .csv", listaClientes, mapaIDFactura, mapaNombre, mapaRut);
    cargador.TarjetasClientesCSV("tarjetas.csv", listaClientes, mapaIDFactura, mapaNombre, mapaRut);
    
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
          gestorClientes.registarCliente(listaClientes, mapaNombre, mapaRut, mapaIDFactura); 
          System.out.println("Digite una letra para salir ");
          String op3 = reader.readLine();
          break;
        case 4:
          menu.limpiarPantalla();
          menu.MenuBuscarCliente();
          gestorClientes.buscarCliente(mapaNombre, mapaRut, mapaIDFactura);
          System.out.println("Digite una letra para salir ");
          String op4 = reader.readLine();
          break;
        case 5:
          menu.limpiarPantalla();
          gestorClientes.PagarFactura(mapaNombre, mapaRut, mapaIDFactura, listaClientes);
          System.out.println("Digite una letra para salir ");
          String op5 = reader.readLine();
          break;
        default:
          System.out.println("Opción no válida");
          return;
      }   
      menu.limpiarPantalla();
    }   
  }
}