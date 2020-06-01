package ar.edu.unju.fi;

import java.time.LocalDate;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import ar.edu.unju.fi.model.Cuota;
import ar.edu.unju.fi.model.Equipo;
import ar.edu.unju.fi.model.Estadio;
import ar.edu.unju.fi.model.Noticia;
import ar.edu.unju.fi.model.Resultado;
import ar.edu.unju.fi.model.Usuario;
import ar.edu.unju.fi.service.ICuotaService;
import ar.edu.unju.fi.service.IEquipoService;
import ar.edu.unju.fi.service.IEstadioService;
import ar.edu.unju.fi.service.INoticiaService;
import ar.edu.unju.fi.service.IResultadoService;
import ar.edu.unju.fi.service.IUsuarioService;

/**
 * Clase para ejecutar el proyecto
 * 
 * @author Marcia Velarde
 *
 */
@SpringBootApplication
public class Velarde3878Tp5Application implements CommandLineRunner {

	// Realizaremos la inyeccion de los bean necesarios para realizar la operación
	// de guardar un objeto Usuario.
	@Autowired
	IUsuarioService usuarioService;
	@Autowired
	Usuario usuario;
	// Realizaremos la inyeccion de los bean necesarios para realizar la operación
	// de guardar un objeto Cuota.
	@Autowired
	ICuotaService cuotaService;
	@Autowired
	Cuota cuota;
	// Realizaremos la inyeccion de los bean necesarios para realizar la operación
	// de guardar un objeto Equipo.
	@Autowired
	IEquipoService equipoService;
	@Autowired
	Equipo equipo;
	// Realizaremos la inyeccion de los bean necesarios para realizar la operación
	// de guardar un objeto Estadio.
	@Autowired
	IEstadioService estadioService;
	@Autowired
	Estadio estadio;
	// Realizaremos la inyeccion de los bean necesarios para realizar la operación
	// de guardar un objeto Noticia.
	@Autowired
	INoticiaService noticiaService;
	@Autowired
	Noticia noticia;
	// Realizaremos la inyeccion de los bean necesarios para realizar la operación
	// de guardar un objeto Resultado.
	@Autowired
	IResultadoService resultadoService;
	@Autowired
	Resultado resultado;

	public static void main(String[] args) {
		SpringApplication.run(Velarde3878Tp5Application.class, args);	
		
	}

	@Override
	public void run(String... args) throws Exception {
		
		// Inicializo las variables de mi objeto Usuario
		usuario.setApellido("Perez");
		usuario.setDireccion("Av Mitre 256");
		usuario.setDni(30215478);
		usuario.setFechaAlta(LocalDate.now());
		usuario.setFechaNacimiento(LocalDate.of(1980, 11, 12));
		usuario.setId(1);
		usuario.setNombre("Juan");
		usuario.setPassword("123");
		usuario.setTipo("SOCIO");
		
		//A través del objeto implementador usuarioService invocaremos al método guardar.
		usuarioService.guardar();
		
		// Inicializo las variables de mi objeto Cuota
		cuota.setId(01);
		cuota.setFechaPago(LocalDate.of(2020, 05, 30));
		cuota.setPeriodo("Mayo");
		cuota.setMonto(2500);
		cuota.setEstado("Pagada");
		cuota.setUsuario(usuario);

		//A través del objeto implementador cuotaService invocaremos al método guardar.
		cuotaService.guardar();
		
		// Inicializo las variables de mi objeto Equipo
		equipo.setNombre("River Plate");
		equipo.setEstadio(estadio);

		//A través del objeto implementador equipoService invocaremos al método guardar.
		equipoService.guardar();
		
		// Inicializo las variables de mi objeto Estadio
		estadio.setCapacidad(70074);
		estadio.setCiudad("Buenos Aires");
		estadio.setDireccion("Av. Pte Figueroa Alcorta 7597");
		estadio.setFechaFundacion(LocalDate.of(1938, 05, 26));
		estadio.setNombre("Antonio Vespucio Liberti");
		
		//A través del objeto implementador estadioService invocaremos al método guardar.
		estadioService.guardar();
		
		// Inicializo las variables de mi objeto Noticia
		noticia.setFecha(LocalDate.of(2020, 05, 02));
		noticia.setTitulo("Gallardo dono su saco para una subasta a beneficio");
		noticia.setResumen("El muñeco entrego su prenda característica con su autógrafo para que los fondos recaudados se destinen a los comedores");
		
		//A través del objeto implementador noticiaService invocaremos al método guardar.
		noticiaService.guardar();
		
		// Inicializo las variables de mi objeto Resultado
		resultado.setEquipo1(equipo);
		resultado.setEquipo2(equipo);
		resultado.setFecha(LocalDate.of(2019, 11, 12));
		resultado.setGolesEquipo1(3);
		resultado.setGolesEquipo2(1);
		
		//A través del objeto implementador resultadoService invocaremos al método guardar.
		resultadoService.guardar();
		
	}

}
