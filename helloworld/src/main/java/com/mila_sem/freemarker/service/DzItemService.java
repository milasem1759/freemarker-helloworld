package com.mila_sem.freemarker.service;

import com.mila_sem.freemarker.dto.ServiceDz;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class DzItemService {

    public List<ServiceDz> getItems() {
        List<ServiceDz> list = new ArrayList<>();
        list.add(new ServiceDz("ИТ-консалтинга"));
        list.add(new ServiceDz("Предпроектного обследования, включающего анализ и оптимизацию бизнес-процессов"));
        list.add(new ServiceDz("Разработки"));
        list.add(new ServiceDz("Системного тестирования"));
        list.add(new ServiceDz("Технической поддержки"));
        return list;
    }
}
