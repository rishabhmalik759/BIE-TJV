package server.service.interfaces;

import javassist.NotFoundException;
import server.model.BetTypeEntity;

import javax.naming.directory.InvalidAttributesException;
import java.util.List;

public interface BetTypeService {
    List<BetTypeEntity> findAll();

    BetTypeEntity findById(Long id) throws NotFoundException;

    BetTypeEntity save(BetTypeEntity betType) throws InvalidAttributesException;

    BetTypeEntity update(Long id, BetTypeEntity betType) throws NotFoundException, InvalidAttributesException;

    void delete(Long id) throws NotFoundException;
}
