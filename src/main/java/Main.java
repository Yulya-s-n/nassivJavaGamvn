public class Main {
    public static void main(String[] args) {

        String[] names = {
                "Petya",
                "Anya",
                "Olya",
                "Kolya"
        };
        String newName = "Slava";
        /* для того .чтобы добавить новый элемент в массив(а мы помним ,что не можем менять массив с точки зрения добавления и удаления ячеек)
         * names - не массив ,это ячека,которая лежит в массиве и мы сможем с ней работать
         * нам нужно привести код к тому,что в names будут лежать все те же самые имена +slava
         * 1. создадим массив . на 1 ячеку больше(так как нужно добавить 1 элемент)
         * 2. поэтапно скопируем все ячеки из старого в новый*/


        String[] tmp = new String[names.length + 1]; //для того, чтобы новый массив временно сохранить, создается ячейка tmp,
        //кладем сюда новвй созданный массив , который на ед больше.в квадратных скобках спрашиваем длину массива-length и прибавляем единицу
        for (int i = 0; i < names.length; i++) {
            //нам нужно скопироовать все элементы из старого в новый ,поэтому с помощью цикла перебираем все номера ячеек первого массива

            tmp[i] = names[i];
        }
        tmp[tmp.length - 1] = newName;//элементов может быть сколько угодно, поэтому берем переменную и вычисляем номер ячейки и туда клвдем новое имя newName
        names = tmp;

        //names = [..., "Slava"]
    }
    //УДАЛЕНИЕ ЯЧЕКИ
    //в самом массиве мы ничего удалять не можем,но мы можем заменить значение в ячейке
    //создаем новый маасиив. котор выглядит как старый. у которого якобы удалили элемент
    //1.Заводим переменную, которую нужно удалить
    //String removeName = "Olya";
    //пишем такой код, в  котором будет лежать все кроме оли
    //2. Создаем новый массив, который по размеру на ед меньше
    //String[] tmp = new String[tmp.length - 1];не стоит самосу вычислять конкретную цифру строчек массива,поруим это яве
    //3. Заводим отдельную переменную, для индекса куда будем копировать
    //int copyToIndex = 0;всегда указывает на ячеку на котор сл доны скопировать
    //4. заводим индекс откуда будем копировать
    //for (Strings name : names) {
    //проверяем каждый элемент с тем, что нужно удалить.!!ссылочные типы сравниваются не через ==
    //а через eguals
    //if (!name.eguals(removeName)) {!name -отрицание ,значит не равно
    //tmp[copyToIndex] = name;
    //copyToIndex; // переставляет на следующую ячеку,чтобы не копировалост все в одну
    //}
    //}
    //name = tap;

    //else

}
