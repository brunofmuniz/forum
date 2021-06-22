package br.com.forum.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import br.com.forum.modelo.Topico;


public interface TopicoRepository extends JpaRepository<Topico, Long>{

	List<Topico> findByCursoNome(String nomeCurso);	
	
	/*	 
	@Query("select t from topico t where t.curso.nome = :pnomeCurso")
	List<Topico> carregaPorNomeCurso(@Param("pnomeCurso") String nomeCurso);
	*/
}
