package ru.netology.javaqa.javaqamvn.domain;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
//при тестировании таких классов надо всегда помнить , что у рнабора есть 3 важных
//состояния 1.Крнда набор пустой, 2. Внутри набора есть пустой элемент
//3.внутри набора есть несколько элементов(больше одного)
//4.если есть макс значение для размера набора, то тестируем граничные значения
public class ProductRepositoryTest {//item котор мы хотим добавить

    PurchaseItem item1 = new PurchaseItem(11, 1, "хлеб", 40, 3);

    PurchaseItem item2 = new PurchaseItem(222, 22, "булка", 30, 1);
    PurchaseItem item3 = new PurchaseItem(3, 30, "картошка", 20, 7);

    @Test
    public void test() {
        ProductRepository repo = new ProductRepository();//созд репозиторий
        repo.save(item1);//добавление этих элементов в репозиторий
        repo.save(item2);
        repo.save(item3);
        repo.removeById(item2.getId()); //например нужно удалить 2ой repo

        PurchaseItem[] expected = {item1, item3};//если удалить , то в ожидаемых ост 1 и 3 репо
        PurchaseItem[] actual = repo.getItems();//Items класс котор удобно пользоваться для хранения элементов

        Assertions.assertArrayEquals(expected, actual);//при сравнении двух массивов использ ArrayEquals
    }
}
