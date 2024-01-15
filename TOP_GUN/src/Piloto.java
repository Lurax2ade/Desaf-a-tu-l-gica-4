import java.util.*;
public class Piloto {

	private int idPiloto;
	private String nomPiloto;
	private int horasVueloPiloto;
	private String rangoPiloto;

	public Piloto(int idPiloto, String nomPiloto, int horasVueloPiloto, String rangoPiloto) {

		this.idPiloto=idPiloto;
		this.nomPiloto=nomPiloto;
		this.horasVueloPiloto=horasVueloPiloto;
		this.rangoPiloto=rangoPiloto;


	}

	public void setIdPiloto (int idPiloto) {//SETTER

		this.idPiloto=idPiloto;
	}

	public int getIdPiloto() {//GETTER

		return idPiloto;

	}

	public void setnomPiloto(String nomPiloto) {//SETTER

		this.nomPiloto=nomPiloto;
	}

	public String getnomPiloto() {//GETTER
		return nomPiloto;
	}



	public void setHorasVueloPiloto (int horasVueloPiloto) {//SETTER

		this.horasVueloPiloto=horasVueloPiloto;
	}

	public String getHorasVueloPiloto(String horasVueloPiloto) {//GETTER
		return horasVueloPiloto;
	}

	public void setrangoPiloto (String rangoPiloto) {//SETTER

		this.rangoPiloto=rangoPiloto;
	}

	public String getrangoPiloto(String rangoPiloto) {//GETTER
		return rangoPiloto;
	}

	public void mostrarPiloto() {

		System.out.println("El id del piloto es : " + idPiloto);
		System.out.println("El nombre es : " + nomPiloto);
		System.out.println("Las horas de vuelo realizadas por el piloto son: " + horasVueloPiloto);
		System.out.println("El rango del piloto es de : " + rangoPiloto);
	}

	public class Avión {//clase Padre

		private int idAvion;
		private String modAvion;
		private int capAvion;
		private Piloto piloto;


		public void Avión (int idAvion,String modAvion,int capAvion ) {//constructor con parámetros

			this.idAvion=idAvion;
			this.modAvion=modAvion;
			this.capAvion=capAvion;

		}

		public void setIdAvion(int idAvion) {//SETTER
			this.idAvion = idAvion;
		}

		public int getidAvion() {//GETTER
			return idAvion;
		}

		public void setmodAvion(String modAvion) {//SETTER

			this.modAvion=modAvion;
		}

		public String getmodAvion( String modAvion) {//GETTER
			return modAvion;
		}

		public void setcapAvion(int capAvion ) {//SETTER

			this.capAvion=capAvion;
		}
		public int getcapAvion(  ) {//GETTER
			return capAvion;

		}

		public void setPiloto(Piloto Piloto) {

			this.piloto=Piloto;
		}
		public Piloto getPiloto() {

			return piloto;

		}
		public void  mostrarAvion() {
			System.out.println("Id: " + idAvion);
			System.out.println("modAvion: " + modAvion);
			System.out.println("capAvion: " + capAvion);
			piloto.mostrarPiloto();
		}


		public class Entrenamiento extends Avión{//clase hija de Avion

			private boolean tieneDobleMando;

			public Entrenamiento(int idAvion,String modAvion,int capAvion, boolean tieneDobleMando) {
				super ();
				this.tieneDobleMando=tieneDobleMando;
			}

			public void settieneDobleMando(String tieneDobleMando) {

				if (tieneDobleMando=="Si") {
					this.tieneDobleMando=true;

				}else {
					this.tieneDobleMando=false;

				}
			}
			public String gettieneDobleMando(){

				if (tieneDobleMando=true) {
					return "El avión tiene doble mando";
				}else {
					return "El avión solo tiene un mando";

				}
			}

			public class Combate extends Avión{

				private boolean esFurtivo;

				public Combate (int idAvion,String modAvion,int capAvion, boolean esFurtivo) {
					super();
					this.esFurtivo=esFurtivo;
				}

				public void setesFurtivo(String esFurtivo) {

					if (esFurtivo=="si") {

						this.esFurtivo=true;
					}else {
						this.esFurtivo=false;
					}
				}
				public String getesFurtivo () {
					if (esFurtivo=true) {
						return "El avión es de combate";
					}else {
						return "El avión no es de combate";
					}
				}

				public class Gestion{

					public static void main(String[]args) {

						Piloto piloto1=new Piloto(1, "Pete Maverick", 10000, "Capitán");					
						Piloto piloto2 = new Piloto(2, "Natasha Phoenix", 3000, "Teniente");
						Piloto piloto3 = new Piloto(3, "Bradley Rooster", 3500, "Teniente");


						piloto1.mostrarPiloto();
						piloto2.mostrarPiloto();
						piloto3.mostrarPiloto();

						Scanner scanner = new Scanner(System.in);

						System.out.println("Introduce los datos para dos pilotos:");

						System.out.print("Nombre del piloto 4: ");
						String nombrePiloto4 = scanner.nextLine();

						System.out.print("Horas de vuelo del piloto 4: ");
						int horasVueloPiloto4 = scanner.nextInt();

						System.out.print("Rango del piloto 4: ");
						scanner.nextLine(); 

						String rangoPiloto4 = scanner.nextLine();

						Piloto piloto4 = new Piloto(4, nombrePiloto4, horasVueloPiloto4, rangoPiloto4);

						System.out.print("Nombre del piloto 5: ");
						String nombrePiloto5 = scanner.nextLine();
						System.out.print("Horas de vuelo del piloto 5: ");
						int horasVueloPiloto5 = scanner.nextInt();
						System.out.print("Rango del piloto 5: ");
						scanner.nextLine(); 
						String rangoPiloto5 = scanner.nextLine();

						Piloto piloto5 = new Piloto(5, nombrePiloto5, horasVueloPiloto5, rangoPiloto5);
					}


				}

			}

		}}}









