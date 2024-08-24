package model;

import java.time.LocalDate;
import java.util.List;
import java.util.Map;

/**
 *
 * @author gabe
 */

public interface Builder {
    public List<Funcionario> setFuncionario(List<Funcionario> funcionarios);
    public Map<Integer,Integer> setPeca(Map<Integer,Integer> pecas);
    public LocalDate setData(LocalDate data);    
}
