package spring.curso.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.*;

import spring.curso.dao.DiscosDao;
import spring.curso.model.Discos;

@Component
@Service
public class DiscosService {
	
	@Autowired
	DiscosDao discosDao;

	
	//Agregar Disco
	public void agregarDisco(Discos disco) {
		discosDao.agregarDisco(disco);
	}
	
	//Consultar Discos
	public List<Discos> consultarDiscos(){
		return discosDao.consultarDiscos();
	}
	
	//Consultar discos por genero
	public Discos consultarDiscosPorGenero(String genero) {
		return discosDao.consultarDiscosPorGenero(genero);
	}
	
	//Consultar disco por id
	public Discos editarDisco(Integer id) {
		return discosDao.editarDisco(id);
	}
	
	//Editar Discos
	public void actualizarDisco(Discos id) {
		discosDao.actualizarDisco(id);
	}
	
	//Eliminar Disco
	public void eliminarDisco(Integer id) {
		discosDao.eliminarDisco(id);
	}
	
	
	
	
}
