package com.mila_sem.freemarker.service;

import com.mila_sem.freemarker.dto.Office;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class OfficeService {

    public List<Office> getOffices() {
        List<Office> offices = new ArrayList<>();
        offices.add(new Office(
                "Москва",
                "117246, Научный проезд, дом 8, строение 1, офис 431",
                "+7 (499) 653-71-56",
                "sales@dz.ru"
        ));
        offices.add(new Office(
                "Казань",
                "420107, ул. Петербургская, дом 50, корпус 23",
                "+7 (843) 570-540-7",
                "kazan@dz.ru"
        ));
        offices.add(new Office(
                "Ульяновск",
                "432017, ул. Железной Дивизии, дом 5Б, комплекс «Спартак», 5-ый этаж",
                "+7 (8422) 777-808",
                "uln@dz.ru"
        ));
        offices.add(new Office(
                "Санкт-Петербург",
                "197374, ул. Оптиков, дом 4",
                "+7 (812) 324-27-24",
                "sales@e-legion.com"
        ));
        return offices;
    }
}
