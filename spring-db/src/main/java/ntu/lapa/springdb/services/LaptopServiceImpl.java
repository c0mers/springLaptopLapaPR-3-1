
package ntu.lapa.springdb.services;

import lombok.RequiredArgsConstructor;
import ntu.lapa.springdb.entitys.Laptop;
import ntu.lapa.springdb.repository.LaptopRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


import java.util.List;

@Service
public class LaptopServiceImpl implements LaptopService{

    @Autowired
    public LaptopServiceImpl(LaptopRepository laptopRepository) {
        this.laptopRepository = laptopRepository;
    }

    private final LaptopRepository laptopRepository;

    @Override
    public List<Laptop> findAll() {
        return laptopRepository.findAll();
    }
}
