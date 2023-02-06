package ru.netology.javaqa.javaqamvn.domain;
public class ProductRepository {
    //для того чтобы показать те элементы котор нвс просили заполнить заводим массив длиною 0
    private PurchaseItem[] items = new PurchaseItem[0];

    public void save(PurchaseItem item) {//класс должен добавлять покупку в свой набор, для этого пишем метод
        PurchaseItem[] tmp = new PurchaseItem[items.length + 1];//созд нов массив на един больше чем старый, ед пишем на любой обЪЕМ МАССИВА
        for (int i = 0; i < items.length; i++) {//копируем сатрый массив
            tmp[i] = items[i];//копир в нов массив все элементы из старого массива
        }
        tmp[tmp.length - 1] = item;//добавляем новый параметр
        items = tmp;//присваеваем в поле items новый массив
    }

    public void removeById(int id) {//удаление покупки по уникальному номеру
        PurchaseItem[] tmp = new PurchaseItem[items.length - 1];
        int copyToIndex = 0;// заводим переменную для сохранения места куда нам нкжно копировать в нов массиве
        for (PurchaseItem item : items) {//пройдемся по всем item котор сохранены в нашем массиве
            if (item.getId() != id) {//если у item не такое Id котор нужно удалить то мы его копируем
                tmp[copyToIndex] = item;
                copyToIndex++;
            }
        }
        items = tmp;//сохраняем нов мвссив в наше поле
    }

    public PurchaseItem[] getItems() {//метод котор возвр все заполн элементы в виде массива
        return items;
    }
}
