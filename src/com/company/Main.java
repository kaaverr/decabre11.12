package com.company;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main {

    public static void main(String[] args) {
	/*
	* 1) Дано клас у которого 5 поле1(id, name, description, localDate, isActive)
	* потрібно зробити повну адмін панель
	* Базу Бекенд crud
	* c-create
	* r-read
	* u-update
	* d-delete
	*   максимально показать скил(search, sort, paging, valudation,
	*   tests)
	*
	*
	* 2) class company(name, Company boss, количество людей в компанії )
	* Найти самого верхнего боса, найти сколько человек у компании,
	* человек у каждой подчиняющейся ей компании
	*
	*
	*
	* 3)Map
	* все дание из map-convert to csv
	* */

        //2

        Company chief = new Company("chief" , null, 6);
        Company lawyer = new Company("lawyer" , chief, 2);
        Company accountant = new Company("accountant" , lawyer, 5);
        Company dev = new Company("dev" , chief, 5);
        Company grafDesign = new Company("graf design" , dev, 5);
        Company testers = new Company("testers" , dev, 5);
        Company uiDesginers = new Company("ui designers" , grafDesign, 5);
        Company backDev = new Company("back dev" , dev, 5);
        Company BD = new Company("BD" , backDev, 5);
        Company devOPS = new Company("dev OPS" , backDev, 5);
        Company audit = new Company("audit", null, 4);

        List<Company> companies = new ArrayList<>(
                Arrays.asList(
                        chief,lawyer,accountant,dev,grafDesign,testers
                        ,uiDesginers,backDev,BD,devOPS,audit
                )
        );

        CompanyServiceImpl service = new CompanyServiceImpl();
        Company theTopChief = service.getTopChief(testers,companies);


        //3

    }
}
