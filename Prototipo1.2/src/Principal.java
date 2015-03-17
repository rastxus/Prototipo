

import java.util.Date;
import java.util.Scanner;



/**
 * @author Jesus
 *
 */
import accesoDatos.BusquedaAlgoritmo;
import accesoDatos.Datos;
import modelo.SesionUsuario;
import modelo.Usuario;

import java.util.ArrayList;

import util.CifradoCesar;
public class Principal {



	public static void main(String[] args) 
	{
		int opcion=0;

		while(opcion!=-1){


			Scanner teclado = new Scanner(System.in);
			Scanner teclado1 = new Scanner(System.in);
			Scanner teclado2 = new Scanner(System.in);

			System.out.println("\n\n\n|*******************************************[]");
			System.out.println("|[1] Crear Datos Usuarios.                  []");
			System.out.println("|[2] Muestra Datos Usuarios.                []");
			System.out.println("|[3] Inciar sesion.                         []");
			System.out.println("|[4] Buscar Usuarios.                       []");
			System.out.println("|[5] Buscar Inicios de Sesion.              []");
			System.out.println("|[6] Comprobar correo.                      []");
			System.out.println("|[7] Muestra todos los usuarios activos.    []\n\n");
			System.out.print(" ¿Que desea hacer?...              ");
			opcion=teclado.nextInt();

			if(opcion==1){

				System.out.println("¿Cuantos usuarios quieres crear?");
				int n = teclado1.nextInt();
				long time_start, time_end;
				time_start = System.currentTimeMillis();				   
				//metodo crear datos
				Datos.crearDatosPrueba(n);	

				time_end = System.currentTimeMillis();
				System.out.println("Creados en : "+ ( time_end - time_start ) +" milliseconds");
			}
			if(opcion == 2){
				System.out.println(Datos.datosUsuariosTexto());
			}
			if(opcion == 3){
				iniciarSesion(); 
			}
			if(opcion==4){
				System.out.print("¿Que usuario busca en el sistema?\n#dni:");
				String dni=teclado1.nextLine();
				System.out.println(Datos.buscaUsuario(dni));
			}
			if(opcion==5){
				System.out.print("¿Que usuario desea comprobar?\n#dni:");
				String dni=teclado1.nextLine();

				System.out.println(Datos.buscaSesion(dni));
			}

			if(opcion==6){
				System.out.println("\nIntroduzca correo\n");

				String correo=teclado2.nextLine();

				String valido=Usuario.correoValido(correo);

				if (valido=="Error"){
					System.out.println("El correo no es valido.");
				}
				else{System.out.println("El correo es valido.");}

			}


			if(opcion==7){
				System.out.println("\nUsuarios conectados\n");

				System.out.println(Datos.datosSesionesTexto());
			}
			if(opcion == 8){
				System.out.println("Introduzca usuario a buscar");
				String user=teclado2.nextLine();
				System.out.println(BusquedaAlgoritmo.buscarUsuarioBin(user).getNombre());
			}
		}



	}//fin main





	private static boolean iniciarSesion()
	{

		System.out.println("********INICIO DE SESION*******");
		Scanner teclado=new Scanner(System.in);
		int intentos=3;
		boolean acceso=false;
		do{
			System.out.println("Usuario");
			String alias=teclado.nextLine();

			System.out.println("Contraseña");
			String contraseña=teclado.nextLine();
			int n = 0;
			for(int u = 0; u < Datos.datosUsuario.size() ; u++){

				if (Datos.datosUsuario.get(u).getNombre().equals(alias)){

					String[] numeroExtraido= Datos.datosUsuario.get(u).getClaveAcceso().split(",");
					n = Integer.parseInt(numeroExtraido[numeroExtraido.length - 1]);
				}
			}
			/**
			 *  Metodo que cifra nuevamente la clave recibida.
			 *	Recibe la contraseña a cifrar y el número con el
			 *  que ha sido cifrada.
			 */
			contraseña = CifradoCesar.RegistroCifrado(contraseña,n);


			for(int i=0;i<Datos.datosUsuario.size();i++){

				if (Datos.datosUsuario.get(i).getNombre().equals(alias)){

					if(Datos.datosUsuario.get(i).getClaveAcceso().equals(contraseña)){

						System.out.println("ok payo");
						registrodesesion(i);

						return true;
					}

				}

			}

			System.out.println("Fallo intento de inicio de sesión. Número de intentos restantes: "+ intentos);
			intentos--;
		} while(intentos>=0); 				

		return false;
	}
	public static void registrodesesion(int usuario){

		SesionUsuario aux = new SesionUsuario();


		aux.usr=Datos.datosUsuario.get(usuario);
		aux.fecha=new Date().toString();

		Datos.SesionesUsuario.add(aux);

		System.out.print("\n\n**Has iniciado sesión**\n"+aux.usr.aTextoConSeparador('\n'));
		System.out.print(aux.fecha);




	}	
}

