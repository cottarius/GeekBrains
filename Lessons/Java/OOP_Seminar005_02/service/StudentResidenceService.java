package service;

import model.Student;

import java.util.List;
import java.util.Map;

/*
В модуле service реализованы принципы SOLID:
1. Interface Segregation Principle - созданы узкоспециализированные интерфейсы для конкретных клиентов.
   Клиенты не зависят от интерфейсов, которые они не используют.
   В модуле service находятся 3 интерфейса, независящие друг от друга и не влияющие на работу клиентов, реализующих
   другие интерфейсы
 */

public interface StudentResidenceService {
    public Map<Integer, List<Student>> createRoom (int number, List<Student> list);
    public void getRooms();
}
