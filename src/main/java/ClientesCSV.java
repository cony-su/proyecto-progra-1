import java.util.*;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.io.FileReader;

class ClientesCSV 
{
  public void cargarClientesDesdeCSV(String archivoCSV, HashMap<String, Cliente> mapaNombre, HashMap<String, Cliente> mapaRut, ArrayList<Cliente> listaClientes) 
  {
    try (BufferedReader lector = new BufferedReader(new FileReader(archivoCSV))) 
    {
      String linea;
      boolean esPrimeraLinea = true;  // Para omitir la primera línea de encabezados
      while ((linea = lector.readLine()) != null) {
      if (esPrimeraLinea) {
      esPrimeraLinea = false;
      continue;  // Omitir encabezado
    }
    String[] datos = linea.split(",");
     try {
          DatosPersonales datosPersonales = new DatosPersonales(datos[0],datos[1],datos[2],Integer.parseInt(datos[3]),datos[4]);
          DatosContacto datosContacto = new DatosContacto(datos[2], datos[5], datos[6]);
          Equipo equipo = new Equipo(datos[7], datos[8], Integer.parseInt(datos[9]));
          PlanesDisponibles plan = new PlanesDisponibles(
                      datos[10],
                      Integer.parseInt(datos[11]),
                      Boolean.parseBoolean(datos[12]),
                      Integer.parseInt(datos[13]),
                      Boolean.parseBoolean(datos[14]),
                      Integer.parseInt(datos[15]),
                      Boolean.parseBoolean(datos[16]),
                      Integer.parseInt(datos[17])
                  );
                  Cliente cliente = new Cliente(datosPersonales, datosContacto, plan, equipo);

                  listaClientes.add(cliente);
                  mapaNombre.put(datos[0], cliente);
                  mapaRut.put(datos[4], cliente); 
                  
              } catch (NumberFormatException e) {
                  System.out.println("Error al convertir número: " + e.getMessage());
              }
          }
      } catch (IOException e) {
          System.out.println("Error al leer el archivo CSV.");
          e.printStackTrace();
      }
  }


  public void FacturasClientesCSV(String archivoCSV, ArrayList<Cliente> listaClientes, HashMap<String, Cliente> mapaID, HashMap<String, Cliente> mapaNombre, HashMap<String, Cliente> mapaRut) throws IOException {
      try (BufferedReader lector = new BufferedReader(new FileReader(archivoCSV))) {
          String linea;
          boolean esPrimeraLinea = true;

          while ((linea = lector.readLine()) != null) {
              if (esPrimeraLinea) {
                  esPrimeraLinea = false;
                  continue;  // Omitir encabezado
              }
              String[] datos = linea.split(",");
              try {
                  String rut = datos[0];
                  String idFactura = datos[1];
                  int monto = Integer.parseInt(datos[2]);
                  String fechaEmision = datos[3];
                  boolean pagada = Boolean.parseBoolean(datos[4]);

                  Factura factura = new Factura(idFactura, monto, fechaEmision, pagada);
                  for (Cliente cliente : listaClientes) {
                      if (cliente.getDatosPersonales().getRut().equals(rut)) {
                          cliente.agregarFactura(factura);

                          // Actualiza el mapaID si no contiene el cliente
                          if (mapaID.get(idFactura) == null) {
                              mapaID.put(idFactura, cliente);
                          }

                          // Actualiza el mapaNombre si no contiene el cliente
                          Cliente clienteNombre = mapaNombre.get(cliente.getDatosPersonales().getNombreCliente());
                          if (clienteNombre == null) {
                              mapaNombre.put(cliente.getDatosPersonales().getNombreCliente(), cliente);
                          }

                          // Actualiza el mapaRut si no contiene el cliente
                          Cliente clienteRut = mapaRut.get(cliente.getDatosPersonales().getRut());
                          if (clienteRut == null) {
                              mapaRut.put(cliente.getDatosPersonales().getRut(), cliente);
                          }

                          break; // Salir del bucle después de encontrar el cliente
                      }
                  }

              } catch (NumberFormatException e) {
                  System.out.println("Error al convertir número: " + e.getMessage());
              } catch (ArrayIndexOutOfBoundsException e) {
                  System.out.println("Error: datos incompletos en la línea.");
              }
          }
      }
  }

    public void TarjetasClientesCSV(String archivoCSV, ArrayList<Cliente> listaClientes, HashMap<String, Cliente> mapaID, HashMap<String, Cliente> mapaRut, HashMap<String, Cliente> mapaNombre) throws IOException {
        try (BufferedReader lector = new BufferedReader(new FileReader(archivoCSV))) {
            String linea;
            boolean esPrimeraLinea = true;

            while ((linea = lector.readLine()) != null) {
                if (esPrimeraLinea) {
                    esPrimeraLinea = false;
                    continue;  // Omitir encabezado
                }
                String[] datos = linea.split(",");
                try {
                    String rut = datos[0];
                    int metodoPago = Integer.parseInt(datos[1]);
                    int tipoTarjeta = Integer.parseInt(datos[2]);
                    String nombreTitular = datos[3];
                    String numeroTarjeta = datos[4];
                    String fechaVencimiento = datos[5];
                    String codigoSeguridad = datos[6];

                    Tarjeta tarjeta = new Tarjeta(metodoPago, tipoTarjeta, nombreTitular, numeroTarjeta, fechaVencimiento, codigoSeguridad);
                    Cliente clientee = null;
                    for (Cliente c : listaClientes) {
                        if (c.getDatosPersonales().getRut().equals(rut)) {
                            clientee = c;
                            break;
                        }
                    }
                    if (clientee != null) {
                        clientee.agregarTarjeta(tarjeta);
                        
                    } else {
                        System.out.println("Cliente con RUT " + rut + " no encontrado.");
                    }
                } catch (NumberFormatException e) {
                    System.out.println("Error al convertir número: " + e.getMessage());
                } catch (ArrayIndexOutOfBoundsException e) {
                    System.out.println("Error: datos incompletos en la línea.");
                }
            }
        }
    }
}