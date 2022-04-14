package com.shopme;
import com.shopme.Laptop;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface MapRepo2   extends JpaRepository<Laptop, Integer> {

}
