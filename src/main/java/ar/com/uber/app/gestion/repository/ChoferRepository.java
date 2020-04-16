package ar.com.uber.app.gestion.repository;

import ar.com.uber.app.gestion.domain.ChoferEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface ChoferRepository extends JpaRepository<ChoferEntity, Long>  {

    @Query(value = "select * from chofer where barrio = ?1",nativeQuery = true)
    List<ChoferEntity> buscarChoferByBarrio(String barrio);

    @Query(value = "select * from chofer where dni = ?1",nativeQuery = true)
    ChoferEntity buscarPatenteByDni(String dni);
}
