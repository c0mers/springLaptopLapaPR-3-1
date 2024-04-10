package ntu.lapa.springdb.services;

import ntu.lapa.springdb.entitys.Laptop;
import org.springframework.stereotype.Service;

import java.util.List;

public interface LaptopService {
    List<Laptop> findAll();
}
