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
}