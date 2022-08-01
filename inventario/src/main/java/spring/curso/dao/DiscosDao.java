package spring.curso.dao;

import java.util.*;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.orm.hibernate5.HibernateTemplate;
import org.springframework.stereotype.Component;

import spring.curso.model.Discos;
@Component
public class DiscosDao {
	
	@Autowired
	HibernateTemplate hibernateTemplate;

	
	//Agregar Disco
	@Transactional
	public void agregarDisco (Discos disco) {
		hibernateTemplate.save(disco);
	}
	
	//Consultar Discos
	public List<Discos> consultarDiscos(){	
		return hibernateTemplate.loadAll(Discos.class);
	}
	
	//Consultar Discos por genero
	public Discos consultarDiscosPorGenero(String genero) {
		return hibernateTemplate.load(Discos.class, genero);
	}
	
	//editar disco por id
	@Transactional
	public Discos editarDisco(Integer id) {	
		Discos disco = hibernateTemplate.get(Discos.class, id);
		
		return disco;
	}
	
	//Actualizar Discos
	@Transactional
	public void actualizarDisco(Discos disco) {
		hibernateTemplate.update(disco);
	}
	
	//Eliminar Disco
	@Transactional
	public void eliminarDisco(Integer id) {
		hibernateTemplate.delete(hibernateTemplate.load(Discos.class, id));
	}
		
}
