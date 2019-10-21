package javaClassesTaskA;

import java.util.List;

/**
 * Customer: id, Фамилия, Имя, Отчество, Адрес, Номер кредитной карточки, Номер банковского счета.
 * Создать массив объектов. Вывести:
 * a) список покупателей в алфавитном порядке;
 * b) список покупателей, у которых номер кредитной карточки находится в заданном интервале.
 * @author Nikolai
 */

public class Runner {
    public static void main(String[] args) {
        Shop shop = new Shop("GUM");
        shop.addCustomerToShopList(new Customer("Petr", "Petrov", "Minsk", 11223344, 12345));
        shop.addCustomerToShopList(new Customer("Andrey", "Andreev", "Vitebsk", 22334455,  23456));
        System.out.println("Sorted by first name:");
        List<Customer> listSortByFirstName = shop.getListByFirstName();
        System.out.println(listSortByFirstName);
        System.out.println();
        System.out.println("Sorted by last name:");
        List<Customer> listSortByLastName = shop.getListByLastName();
        System.out.println(listSortByLastName);
        System.out.println();
        System.out.println("Sorted by credit card range:");
        List<Customer> listSortByCreditCardRange = shop.getListByDiapasonCreaditCard(0, Integer.MAX_VALUE);
        System.out.println(listSortByCreditCardRange);
        }
    }

